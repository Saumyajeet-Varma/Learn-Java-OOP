package src.module12;

class BaseClass {

    void defaultMethod() {
        System.out.println("Default method: accessible only within the same package");
    }

    public void publicMethod() {
        System.out.println("Public method: accessible from anywhere");
    }

    private void privateMethod() {
        System.out.println("Private method: accessible only within this class");
    }

    protected void protectedMethod() {
        System.out.println("Protected method: accessible within same package and subclasses");
    }




    void callPrivate() {
        privateMethod();
    }
}

public class AccessModifier extends BaseClass {
    public static void main(String[] args) {

        BaseClass parentObj = new BaseClass();
        AccessModifier childObj = new AccessModifier();

        parentObj.defaultMethod();
        parentObj.publicMethod();
        // parentObj.privateMethod(); ❌ Not visible
        parentObj.callPrivate();
        childObj.protectedMethod();
    }
}