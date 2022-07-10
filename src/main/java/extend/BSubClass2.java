package extend;

import sun.reflect.ReflectionFactory;
import java.lang.reflect.Constructor;

public class BSubClass2 extends BClass {

    private int avar2;
    private int bvar2;

    public BSubClass2() {
        System.out.println("hello, I'm BSubClass2");
    }

    public BSubClass2(int a, int b) {
        this.avar2 = a;
        this.bvar2 = b;
        System.out.println("hello, I'm BSubClass2, too...");
    }

    @Override
    public String toString() {
        return "BSubClass2{" +
                "avar2=" + avar2 +
                ", bvar2=" + bvar2 +
                '}';
    }

    public static void main(String[] args) throws Exception {
//        BSubClass2 bSub1 = new BSubClass2();
//        BSubClass2 bSub2 = new BSubClass2(1, 2);
//        System.out.println(bSub1.toString());
//        System.out.println(bSub2.toString());
//
//        System.out.println("\n-------------分割线--------------------\n");

        Constructor<?> constructor = ReflectionFactory.getReflectionFactory().newConstructorForSerialization(BSubClass2.class,
                Object.class.getDeclaredConstructor(new Class[0]));
        constructor.setAccessible(true);
        Object o = constructor.newInstance(new Object[0]);
        System.out.println(o.toString());
    }
}
