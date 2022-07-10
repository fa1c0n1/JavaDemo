import java.net.URL;
import java.net.URLClassLoader;

public class URLClassLoaderDemo {

    public static void main(String[] args) {
        try {
            //使用file协议在本地寻找指定.class文件
            //URL[] urls = new URL[]{new URL("file:///Users/fa1c0n/codeprojects/IdeaProjects/misc-classes/src/main/java/")};

            //使用http协议到远程地址寻找指定.class文件
            URL[] urls = new URL[]{new URL("http://127.0.0.1:8000/")};
            URLClassLoader urlClassLoader = new URLClassLoader(urls);
            Class clazz = urlClassLoader.loadClass("Exploit");
            clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
