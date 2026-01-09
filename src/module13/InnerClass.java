package src.module13;

class OuterClass1 {

    int x = 10;

    class InnerClass1 {
        int y = 21;
    }
}

class OuterClass2 {

    int x = 10;

    class InnerClass2 {
        public int innerMethod() {
            return x;
        }
    }
}

class OuterClass3 {

    static class InnerClass3 {
        int y = 21;
    }
}

public class InnerClass {
    public static void main(String[] args) {
        
        OuterClass1 outer1 = new OuterClass1();
        OuterClass1.InnerClass1 inner1 = outer1.new InnerClass1();
        System.out.println(inner1.y + outer1.x);
        
        OuterClass2 outer2 = new OuterClass2();
        OuterClass2.InnerClass2 inner2 = outer2.new InnerClass2();
        System.out.println(inner2.innerMethod());
        
        OuterClass3.InnerClass3 inner3 = new OuterClass3.InnerClass3();
        System.out.println(inner3.y);
    }
}
