package src.module11;

public class Constructor {

    int x;

    Constructor() {
        x = 10;
    }

    // 'this' Keyword
    Constructor(int x) {
        this.x = x;
    }
    public static void main(String[] args) {

        Constructor obj1 = new Constructor();
        System.out.println(obj1.x);
        
        Constructor obj2 = new Constructor(21);
        System.out.println(obj2.x);
    }
}
