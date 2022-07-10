import java.io.IOException;
import java.lang.reflect.Method;

public class ReflectionDemo5 {

    public static void main(String[] args) {
        try {
            Object object = Runtime.class;
            Class cls = object.getClass();
            Method method = cls.getMethod("getMethod", new Class[] {
                    String.class, Class[].class });
            method.invoke(object, "getRuntime");

//            Class cls = input.getClass();
//            Method method = cls.getMethod(iMethodName, iParamTypes);
//            return method.invoke(input, iArgs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
