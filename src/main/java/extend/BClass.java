package extend;

public class BClass {
    private int bval;
    public BClass() {
        System.out.println("hello, I'm BClass");
    }

    public void setBval(int val) {
        this.bval = val;
    }

    public int getBval() {
       return this.bval;
    }
}

