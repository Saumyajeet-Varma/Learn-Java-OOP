package src.module12;

abstract class BaseClass {

    static int objectCount = 0;
    final int fixedValue = 10;

    BaseClass() {
        objectCount++;
    }

    abstract void display();

    static void showObjectCount() {
        System.out.println(objectCount);
    }
    
    final void showFixedValue() {
        System.out.println(fixedValue);
    }
}

public class NonAccessModifier extends BaseClass {

    @Override
    void display() {
        System.out.println("Display method implemented");
    }

    public static void main(String[] args) {
        
        BaseClass.showObjectCount();

        NonAccessModifier obj1 = new NonAccessModifier();
        obj1.display();
        obj1.showFixedValue();
        
        NonAccessModifier obj2 = new NonAccessModifier();
        obj2.display();

        BaseClass.showObjectCount();
    }
}
