
public class ClassforNameDemo {
    public static void main(String[] args) {
        try {
            //Class.forName(String className)，会对类进行初始化，执行类的static代码块
//            Class<?> clazz = Class.forName("evil.Exploit2");

            //Class.forName(String name, boolean initialize, ClassLoader loader),
            //   如果参数initialize为true，则会对类进行初始化，执行类的static代码块
            Class.forName("evil.Exploit2", true, ClassLoader.getSystemClassLoader());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
