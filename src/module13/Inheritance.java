package src.module13;

class Animal {

    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating");
    }
}

class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    void bark() {
        System.out.println(name + " is barking");
    }
}

class Puppy extends Dog {

    Puppy(String name) {
        super(name);
    }

    void play() {
        System.out.println(name + " is playing");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        
        Puppy puppy = new Puppy("Buddy");
        
        puppy.eat();
        puppy.bark();
        puppy.play();
    }
}
