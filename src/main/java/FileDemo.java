import java.io.File;
import java.io.IOException;

public class FileDemo {
    private static final String BASE_DIRECTORY = "/tmp";

    public static void main(String[] args) throws IOException {
        String userInput = "../../../../../../../etc/passwd";
        String userInput1 = "..;/..;/..;/..;/..;/..;/..;/etc/passwd";
        File file = new File(BASE_DIRECTORY, userInput1);
        System.out.println("getCanonicalPath=" + file.getCanonicalPath());
        System.out.println("getPath=" + file.getPath());
        System.out.println("getAbsolutePath=" + file.getAbsolutePath());
        if (file.getCanonicalPath().startsWith(BASE_DIRECTORY)) {
            // process file
        }
    }
}
