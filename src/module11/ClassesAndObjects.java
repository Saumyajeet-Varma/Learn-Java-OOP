package src.module11;

public class ClassesAndObjects {

    int x = 10;
    int y = 15;

    static void staticHello() {
        System.out.println("Hello World !");
    }

    public void publicHello() {
       System.out.println("Hello World !!");
    }

    public static void main(String[] args) {

        ClassesAndObjects obj = new ClassesAndObjects();

        obj.y = 21;

        System.out.println(obj.x);
        System.out.println(obj.y);

        staticHello();
        obj.publicHello();
    }
}