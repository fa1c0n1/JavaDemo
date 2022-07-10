package util;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.InputStream;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

/**
 * Created by scott on 2018-3-15.
 */
public class HttpsRequestUtils {

	public static InputStream request(String url) throws Exception {
		InputStream in = null;
		SSLClient httpClient = new SSLClient();
		HttpPost httpPost = new HttpPost(url);
		httpPost.addHeader("Content-Type", "application/json");
		HttpResponse response = httpClient.execute(httpPost);
		if (response != null) {
			HttpEntity entity = response.getEntity();
			if (entity != null) {
				in = entity.getContent();
			}
		}
		return in;
	}

	public static InputStream doGet(String url) throws Exception {
		InputStream in = null;
		SSLClient httpClient = new SSLClient();
		HttpGet httpGet = new HttpGet(url);
		HttpResponse response = httpClient.execute(httpGet);
		if (response != null) {
			HttpEntity entity = response.getEntity();
			if (entity != null) {
				in = entity.getContent();
			}
		}
		return in;
	}

	private static class SSLClient extends DefaultHttpClient {
		public SSLClient() throws Exception {
			super();
			SSLContext ctx = SSLContext.getInstance("TLS");
			X509TrustManager tm = new X509TrustManager() {
//				@Override
				public void checkClientTrusted(X509Certificate[] chain,
											   String authType) throws CertificateException {
				}

//				@Override
				public void checkServerTrusted(X509Certificate[] chain,
											   String authType) throws CertificateException {
				}

//				@Override
				public X509Certificate[] getAcceptedIssuers() {
					return null;
				}
			};
			ctx.init(null, new TrustManager[]{tm}, null);
			SSLSocketFactory ssf = new SSLSocketFactory(ctx, SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
			ClientConnectionManager ccm = this.getConnectionManager();
			SchemeRegistry sr = ccm.getSchemeRegistry();
			sr.register(new Scheme("https", 443, ssf));
		}
	}

	private static class TrustAnyTrustManager implements X509TrustManager {

		public void checkClientTrusted(X509Certificate[] chain, String authType)
				throws CertificateException {
		}

		public void checkServerTrusted(X509Certificate[] chain, String authType)
				throws CertificateException {
		}

		public X509Certificate[] getAcceptedIssuers() {
			return new X509Certificate[]{};
		}
	}

}
