package src.module12;

class EncapsulatedClass {

    private int x;

    public int getVal() {
        return x;
    }

    public void setVal(int x) {
        this.x = x;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        EncapsulatedClass obj = new EncapsulatedClass();
        obj.setVal(10);
        System.out.println(obj.getVal());
    }
}
