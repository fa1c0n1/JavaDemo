package extend;

public class BSubClass extends BClass {

    public BSubClass() {
        System.out.println("hello, I'm BSubClass");
    }

    public static void main(String[] args) {
        BSubClass bsub = new BSubClass();
        bsub.setBval(5);
        int bval = bsub.getBval();
        System.out.println("bval=" + bval);
    }
}
