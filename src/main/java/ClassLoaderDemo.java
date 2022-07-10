public class ClassLoaderDemo {

    public static void main(String[] args) throws ClassNotFoundException {
        Class ia = Class.forName("[I");
        System.out.println(ia);

        // 数组类型不能使用ClassLoader.loadClass方法，会报错：
        // Exception in thread "main" java.lang.ClassNotFoundException: [I
        Class ia2 =  ClassLoader.getSystemClassLoader().loadClass("[I");

    }
}
