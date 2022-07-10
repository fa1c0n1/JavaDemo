import util.HttpsRequestUtils;

import java.io.*;

public class ShellExec {

    public ShellExec() {
        System.out.println("hello1");
    }

    public static void main(String[] args) throws Exception {
        System.out.println(System.currentTimeMillis());
        System.out.println("hello2");

        InputStream in = HttpsRequestUtils.doGet("http://10.2.30.72/static/css/index.ed4a.css");
        readAndWriteFile(in, "/tmp/aaaaaa2.txt");

    }

    public static void readAndWriteFile(InputStream inStream, String path) throws IOException {
        File file = new File(path);
        if (!file.exists()) {
            file.createNewFile();
        }
        BufferedInputStream in = new BufferedInputStream(inStream);
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file));
        byte[] buf = new byte[1024];
        int i = -1;
        while ((i = in.read(buf)) != -1) {
            out.write(buf, 0, i);
        }
        in.close();
        out.close();
    }

}

//import java.io.File;
//import java.util.Scanner;
//
//public class Execute {
//    public Execute() {
//    }
//
//    public static void main(String[] args) throws Exception {
//        String o = "";
//        String cmd = args[0];
//        ProcessBuilder p;
//        if (System.getProperty("os.name").toLowerCase().contains("win")) {
//            p = new ProcessBuilder(new String[]{"cmd.exe", "/c", cmd});
//        } else {
//            String pty = "/bin/sh";
//            if ((new File("/bin/bash")).exists()) {
//                pty = "/bin/bash";
//            }
//            p = new ProcessBuilder(new String[]{pty, "-c", cmd});
//        }
//
//        Process s = p.start();
//        Scanner c = (new Scanner(s.getInputStream())).useDelimiter("\\A");
//        c.close();
//    }
//}
