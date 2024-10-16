// Abstract class
abstract class Animal {
    // Abstract method
    abstract void sound();

    // Concrete method
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Interface 1
interface Pet {
    void play();
}

// Interface 2
interface Hunter {
    void hunt();
}

// Class kế thừa Abstract class và implement 2 Interface
class Dog extends Animal implements Pet, Hunter {
    @Override
    void sound() {
        System.out.println("Dog barks.");
    }

    @Override
    public void play() {
        System.out.println("Dog loves to play fetch.");
    }

    @Override
    public void hunt() {
        System.out.println("Dog can hunt small animals.");
    }
}

// Class với ví dụ về Overloading
class Calculator {
    // Overloading: cùng tên phương thức, nhưng khác tham số
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// Class kế thừa để minh họa Overriding
class Parent {
    void greet() {
        System.out.println("Hello from Parent class.");
    }
}

class Child extends Parent {
    @Override
    void greet() {
        System.out.println("Hello from Child class.");
    }
}

// Main class để chạy chương trình
public class OOPDemo {
    // Hàm main: Điểm bắt đầu của chương trình
    public static void main(String[] args) {
        // 1. Abstract Class và Interface
        Dog myDog = new Dog();
        myDog.sound();  // Gọi phương thức trừu tượng
        myDog.eat();    // Gọi phương thức thông thường
        myDog.play();   // Gọi từ interface Pet
        myDog.hunt();   // Gọi từ interface Hunter

        System.out.println();

        // 2. Overloading
        Calculator calc = new Calculator();
        System.out.println("Sum of 2 numbers: " + calc.add(5, 10));
        System.out.println("Sum of 3 numbers: " + calc.add(5, 10, 15));

        System.out.println();

        // 3. Overriding
        Parent parent = new Parent();
        parent.greet();  // Gọi greet() từ Parent

        Child child = new Child();
        child.greet();  // Gọi greet() đã được override trong Child
    }
}
