package src.module14;

class Animal {
    public void makeSound() {
        System.out.println("Animal sound");
    }
}

interface Greeting {
    void sayHello();
}

public class AnonymousClass {
    public static void main(String[] args) {

        Animal myAnimal = new Animal() {
            public void makeSound() {
                System.out.println("Woof woof");
            }
        };

        myAnimal.makeSound();

        Greeting greet = new Greeting() {
            public void sayHello() {
                System.out.println("Hello, World!");
            }
        };

        greet.sayHello();
    }
}
