# Learn Java




This Repository only contains **Java OOP**.

| Topics      | Modules        | Links |
|------------|----------------|-------|
| Java Basics | Modules 1–10   | [Click](https://github.com/Saumyajeet-Varma/Learn-Java) |
| Java OOP    | Modules 11–20  | [Click](https://github.com/Saumyajeet-Varma/Learn-Java-OOP) |
| Java DS     | Modules 21–30  | [Click](https://github.com/Saumyajeet-Varma/Learn-Java-DataStructures) |




# Java OOP

## Table of Contents

- [OOP](#oop)
- [Classes and Objects](#classes-and-objects)
    - [Class](#class)
    - [Object](#object)
- [Class Attributes](#class-attributes)
    - [Accessing Attributes](#accessing-attributes)
    - [Modify Attributes](#modify-attributes)
- [Class Methods](#class-methods)
    - [Access Methods With an Object](#access-methods-with-an-object) 
    - [Public Method vs Static Method](#public-method-vs-static-method)
- [Constructor](#constructor)
    - [Constructor Parameters](#contructor-parameters)
    - [`this` Keyword](#this-keyword)
- [Modifiers](#modifiers)
    - [Access Modifiers](#access-modifiers)
    - [Non-Access Modifiers](#non-access-modifiers)
- [Encapsulation](#encapsulation)
    - [Get and Set](#get-and-set)
    - [Why Encapsulation ?](#why-encapsulation-)
- [Java Packages and API](#java-packages-and-api)
    - [Built-in Packages](#built-in-packages)
    - [User-defined Packages](#user-defined-packages)
- [Inheritance](#inheritance)
- [Polymorphism](#polymorphism)
- [`super` Keyword](#super-keyword)
    - [Access Parent Methods](#access-parent-methods)
    - [Access Parent Attributes](#access-parent-attributes)
    - [Call Parent Constructor](#call-parent-constructor)
- [Inner Class](#inner-class)
    - [Private Inner Class](#private-inner-class)
    - [Static Inner Class](#static-inner-class)
    - [Access Outer Class From Inner Class](#access-outer-class-from-inner-class)
<!-- - [Abstraction](#abstraction) -->




## OOP

OOP stands for **Object-Oriented Programming**.

Procedural programming is about writing procedures or methods that perform operations on the data, while object-oriented programming is about creating objects that contain both data and methods.

Object-oriented programming has several advantages over procedural programming:

- OOP is faster and easier to execute
- OOP provides a clear structure for the programs
- OOP helps to keep the Java code DRY "Don't Repeat Yourself", and makes the code easier to maintain, modify and debug
- OOP makes it possible to create full reusable applications with less code and shorter development time




## Classes and Objects

Classes and objects are the two main aspects of object-oriented programming.

Everything in Java is associated with classes and objects, along with its attributes and methods. For example: in real life, a car is an object. The car has **attributes**, such as weight and color, and **methods**, such as drive and brake.

A Class is like an object constructor, or a "blueprint" for creating objects.

### Class

A class is a blueprint or template that defines the properties (data members) and behaviors (member functions) of objects.

It does not occupy memory until an object is created.

To create a class, use the keyword `class`.

```java
public class Main {
    int x = 5;
}
```

> In this example, we create a class named "`Main`" with a variable `x`

### Object

An object is an instance of a class that represents a real-world entity.

It occupies memory and can use the methods defined in the class.

In Java, an object is created from a class. We have already created the class named `Main`, so now we can use this to create objects.

```java
public class Main {

    int x = 5;

    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println(myObj.x);
    }
}
```

> To create an object of `Main`, specify the class name, followed by the object name, and use the keyword `new`




## Class Attributes

we used the term "variable" for `x` in the example (as shown below). It is actually an attribute of the class. Or you could say that class attributes are variables within a class

Another term for class attributes is fields.

```java
public class Main {
    int x = 5;
    int y = 3;
}
```

### Accessing Attributes

You can access attributes by creating an object of the class, and by using the dot syntax (`.`)

```java
public class Main {
  
    int x = 5;

    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println(myObj.x);
    }
}
```

### Modify Attributes

You can also modify or override attribute values

```java
public class Main {
  
    int x;

    public static void main(String[] args) {
        Main myObj = new Main();
        myObj.x = 21;
        System.out.println(myObj.x);
    }
}
```

```java
public class Main {
  
    int x = 10;

    public static void main(String[] args) {
        Main myObj = new Main();
        myObj.x = 21;
        System.out.println(myObj.x);
    }
}
```

> If you don't want the ability to override existing values, declare the attribute as `final`




## Class Methods

We known about methods, that methods are declared within a class, and that they can perform certain actions

```java
public class Main {

    static void myMethod() {
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        myMethod();
    }
}
```

### Access Methods With an Object

```java
public class Main {
 
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }

    public static void main(String[] args) {
        Main myCar = new Main();
        myCar.fullThrottle();
        myCar.speed(200);
    }
}
```

### Public Method vs Static Method

| Feature                       | `public` method       | `static` method            |
| ----------------------------- | --------------------- | -------------------------- |
| Access level                  | Accessible everywhere | Depends on access modifier |
| Belongs to                    | Object                | Class                      |
| Object required               | Yes (if non-static)   | No                         |
| Can access non-static members | Yes                   | No                         |
| Example                       | `obj.method()`        | `Class.method()`           |




## Constructor

A constructor in Java is a special method that is used to initialize objects.

The constructor is called when an object of a class is created.

```java
public class Main {

    int x;  

    public Main() {
        x = 5;
    }

    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println(myObj.x);
    }
}
```

> Note that the constructor name must match the class name, and it cannot have a return type 

### Contructor Parameters

Constructors can also take parameters, which is used to initialize attributes.

```java
public class Main {
    
    int x;

    public Main(int y) {
        x = y;
    }

    public static void main(String[] args) {
        Main myObj = new Main(5);
        System.out.println(myObj.x);
    }
}
```

### `this` Keyword

The `this` keyword in Java refers to the current object in a method or constructor.

The `this` keyword is often used to avoid confusion when class attributes have the same name as method or constructor parameters.

```java
public class Main {
    
    int x;

    public Main(int x) {
        this.x = x;
    }

    public static void main(String[] args) {
        Main myObj = new Main(5);
        System.out.println("Value of x = " + myObj.x);
    }
}
```

> Think of `this.x = x;` as: "`this.x` (the class variable) gets the value of x (the parameter)." Without `this`, the code above `x = x`; would set the parameter `x` equal to itself, and the class variable would stay uninitialized (0).

You can also use `this()` to call another constructor in the same class.

```java
public class Main {

    int modelYear;
    String modelName;

    public Main(String modelName) {
        this(2020, modelName);
    }

    public Main(int modelYear, String modelName) {
        this.modelYear = modelYear;
        this.modelName = modelName;
    }

    public void printInfo() {
        System.out.println(modelYear + " " + modelName);
    }

    public static void main(String[] args) {

        Main car1 = new Main("Corvette");
        Main car2 = new Main(1969, "Mustang");

        car1.printInfo();
        car2.printInfo();
    }
}
```




## Modifiers

We divide modifiers into two groups:
- **Access Modifiers** - controls the access level
- **Non-Access Modifiers** - do not control access level, but provides other functionality

### Access Modifiers

#### Public

A `public` method is accessible from any class.

```java
public class Main {

    public void myPublicMethod() {
        System.out.println("Public methods are accessible from any class");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.myPublicMethod();
    }
}
```

#### Private

A `private` method is accessible only within the same class.

```java
public class Main {

    private void myPrivateMethod() {
        System.out.println("Private methods are accessible only within the same class");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.myPrivateMethod();
    }
}
```

#### Access Modifiers List

For **classes**, you can use either `public` or default:

| Modifier | Description |
|---------------|-------------|
| `public` | The class is accessible by any other class |
| default | The class is only accessible by classes in the same package. This is used when you don't specify a modifier. We will learn more about it |

For **attributes**, **methods** and **constructors**, you can use the one of the following:

| Modifier | Description |
|--------|-------------|
| `public` | The code is accessible for all classes |
| `private` | The code is only accessible within the declared class |
| default | The code is only accessible in the same package. This is used when you don't specify a modifier. You will learn more about packages in the Packages chapter |
| `protected` | The code is accessible in the same package and subclasses. You will learn more about subclasses and superclasses in the Inheritance |

### Non-Access Modifiers

Non-access modifiers do not control visibility (like `public` or `private`), but instead add other features to classes, methods, and attributes.

The most commonly used non-access modifiers are `final`, `static`, and `abstract`.

#### Final

If you don't want the ability to override existing attribute values, declare attributes as `final`.

```java
public class Main {
    
    final int x = 10;
    final double PI = 3.14;

    public static void main(String[] args) {
        Main myObj = new Main();
        myObj.x = 50;
        myObj.PI = 25; 
        System.out.println(myObj.x);
    }
}
```

#### Static

A `static` method belongs to the class, not to any specific object. This means you can call it without creating an object of the class.

```java
public class Main {

    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

  
    public static void main(String[] args) {
        myStaticMethod();
        Main.myStaticMethod();
    }
}
```

> A `static` method belongs to the class itself. You can call it without creating an object, but it cannot use variables or methods that belong to an object.

#### Abstract

An `abstract` method belongs to an `abstract` class, and it does not have a body. The body is provided by the subclass.

```java
abstract class Main {
    public String fname = "John";
    public int age = 24;
    public abstract void study(); 
}

class Student extends Main {
    
    public int graduationYear = 2018;
    
    public void study() {
        System.out.println("Studying all day long");
    }
}
```

#### Non-Access Modifiers List

For **classes**, you can use either `final` or `abstract`:

| Modifier | Description |
|---------------|-------------|
| `final` | The class cannot be inherited by other classes |
| `abstract` | The class cannot be used to create objects (To access an abstract class, it must be inherited from another class). |

For **attributes** and **methods**, you can use the one of the following:

| Modifier | Description |
|---------|-------------|
| `final` | Attributes and methods cannot be overridden or modified |
| `static` | Attributes and methods belong to the class, not to objects. This means all objects share the same `static` attribute, and `static` methods can be called without creating objects. |
| `abstract` | Can only be used in an abstract class, and only on methods. The method does not have a body (e.g., `abstract void run();`). The body is provided by the subclass. You will learn more about inheritance and abstraction in the Inheritance and Abstraction chapters. |
| `transient` | Attributes are skipped when serializing the object containing them |
| `synchronized` | Methods can only be accessed by one thread at a time |
| `volatile` | The value of an attribute is not cached thread-locally and is always read from main memory |




## Encapsulation

The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:
- declare class variables/attributes as `private`
- provide public get and set methods to access and update the value of a `private` variable

### Get and Set

You learned from the previous chapter that `private` variables can only be accessed within the same class (an outside class has no access to it). However, it is possible to access them if we provide public get and set methods.

The `get` method returns the variable value, and the `set` method sets the value.

```java
public class Person {

    private String name; 

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }
}
```

### Why Encapsulation ?

- Better control of class attributes and methods
- Class attributes can be made **read-only** (if you only use the `get` method), or **write-only** (if you only use the `set` method)
- Flexible: the programmer can change one part of the code without affecting other parts
- Increased security of data




## Java Packages and API

A package in Java is used to group related classes. Think of it as **a folder in a file directory**. We use packages to avoid name conflicts, and to write a better maintainable code. Packages are divided into two categories:

- Built-in Packages (packages from the Java API)
- User-defined Packages (create your own packages)

### Built-in Packages

The Java API is a library of prewritten classes, that are free to use, included in the Java Development Environment.

The library contains components for managing input, database programming, and much much more. The complete list can be found at Oracles website: [https://docs.oracle.com/javase/8/docs/api/](https://docs.oracle.com/javase/8/docs/api/)

To use a class or a package from the library, you need to use the `import` keyword

#### Syntax:

```java
import package.name.ClassName;   // Import a single class
import package.name.*;   // Import the whole package
```

#### Example:

```java
import java.util.Scanner;

class Main {
    
    public static void main(String[] args) {
        
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");

        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);
    }
}
```

> In the example above, `java.util` is a package, while `Scanner` is a class of the `java.util` package.

```java
import java.util.*;
```

> The above example will import all the classes in the `java.util` package

### User-defined Packages

To create your own package, you need to understand that Java uses a file system directory to store them. Just like folders on your computer

```md
└── root
  └── mypack
    └── MyPackageClass.java
```

To create a package, use the `package` keyword

##### MyPackageClass.java
```java
package mypack;

class MyPackageClass {
    public static void main(String[] args) {
        System.out.println("This is my package!");
    }
}
```

##### Save the file as MyPackageClass.java, and compile it

```bash
C:\Users\Your Name>javac MyPackageClass.java
```

##### Then compile the package

```bash
C:\Users\Your Name>javac -d . MyPackageClass.java
```

> The `-d` keyword specifies the destination for where to save the class file. You can use any directory name, like c:/user (windows), or, if you want to keep the package within the same directory, you can use the dot sign "`.`", like in the example above.

##### To run the MyPackageClass.java file, write the following

```bash
C:\Users\Your Name>java mypack.MyPackageClass
```

##### The output will be

```bash
This is my package!
```

> **Note**: The package name should be written in lower case to avoid conflict with class names.




## Inheritance

In Java, it is possible to inherit attributes and methods from one class to another. We group the "inheritance concept" into two categories:

- **subclass** (child) - the class that inherits from another class
- **superclass** (parent) - the class being inherited from

To inherit from a class, use the `extends` keyword

```java
class Vehicle {
    
    protected String brand = "Ford";        // Vehicle attribute
    
    public void honk() {                    // Vehicle method
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Vehicle {
    
    private String modelName = "Mustang";    // Car attribute
    
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}
```




# Polymorphism

Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.

Inheritance lets us inherit attributes and methods from another class. Polymorphism uses those methods to perform different tasks. This allows us to perform a single action in different ways.

```java
class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}
```




## `super` Keyword

In Java, the `super` keyword is used to refer to the **parent class** of a subclass

The most common use of the super keyword is to eliminate the confusion between superclasses and subclasses that have methods with the same name. 

It can be used in two main ways:
- To access attributes and methods from the parent class
- To call the parent class constructor

### Access Parent Methods

If a subclass has a method with the same name as one in its parent class, you can use `super` to call the parent version

```java
class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    public void animalSound() {
        super.animalSound(); // Call the parent method
        System.out.println("The dog says: bow wow");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.animalSound();
    }
}
```

### Access Parent Attributes

You can also use `super` to access an attribute from the parent class if they have an attribute with the same name

```java
class Animal {
    String type = "Animal";
}

class Dog extends Animal {
    
    String type = "Dog";

    public void printType() {
        System.out.println(super.type); // Access parent attribute
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.printType();
    }
}
```

### Call Parent Constructor

Use `super()` to call the constructor of the parent class

```java
class Animal {
    Animal() {
        System.out.println("Animal is created");
    }
}

class Dog extends Animal {
    Dog() {
        super(); // Call parent constructor
        System.out.println("Dog is created");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
    }
}
```




## Inner Class

In Java, it is also possible to nest classes (a class within a class). The purpose of nested classes is to group classes that belong together, which makes your code more readable and maintainable

```java
class OuterClass {
   
    int x = 10;

    class InnerClass {
        int y = 21;
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }
}

// Outputs 31 (21 + 10)
```

### Private Inner Class

Unlike a "regular" class, an inner class can be `private` or `protected`. If you don't want outside objects to access the inner class, declare the class as `private`

```java
class OuterClass {
  
    int x = 10;

    private class InnerClass {
        int y = 21;
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }
}
```

> If you try to access a private inner class from an outside class, an error occurs: `Main.java:13: error: OuterClass.InnerClass has private access in OuterClass`

### Static Inner Class

An inner class can also be `static`, which means that you can access it without creating an object of the outer class

```java
class OuterClass {
  
    int x = 10;

    static class InnerClass {
        int y = 21;
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass.InnerClass myInner = new OuterClass.InnerClass();
        System.out.println(myInner.y);
    }
}

// Outputs 21
```

### Access Outer Class From Inner Class

One advantage of inner classes, is that they can access attributes and methods of the outer class

```java
class OuterClass {
  
    int x = 10;

    class InnerClass {
        public int myInnerMethod() {
            return x;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.myInnerMethod());
    }
}

// Outputs 10
```




<!-- # Abstraction -->