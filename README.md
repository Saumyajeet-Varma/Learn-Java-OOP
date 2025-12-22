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
