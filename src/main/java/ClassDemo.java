import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ClassDemo {

    public static void main(String[] args) {
        Class<?>[] interfaces = OverrideAnnotationOf.class.getInterfaces();
        System.out.println(interfaces.length);
    }
}
