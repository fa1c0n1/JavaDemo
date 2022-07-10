package extend;

public class AClass1 implements AInterface {

    @Override
    public void fun1() {
        System.out.println("fun1...");
    }

    public static void main(String[] args) {
         new AClass1().fun1();
    }
}
