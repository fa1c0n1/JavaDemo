public class ClassLoaderDemo2 {

    public static void main(String[] args) throws ClassNotFoundException {
        try {
            System.out.println(ClassLoader.getSystemClassLoader());
            System.out.println(ClassLoader.getSystemClassLoader().getParent());
            System.out.println(ClassLoader.getSystemClassLoader().getParent().getParent());

            System.out.println("---Bootstrap ClassLoader的加载路径---");
            System.out.println(System.getProperty("sun.boot.class.path"));
            System.out.println();

            System.out.println("---sun.misc.Launcher$ExtClassLoader 的加载路径---");
            System.out.println(System.getProperty("java.ext.dirs"));
            System.out.println();

            System.out.println("---sun.misc.Launcher$AppClassLoader 的加载路径---");
            System.out.println(System.getProperty("java.class.path"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
