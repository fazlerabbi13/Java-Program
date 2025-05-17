// Abstract class
abstract class Animal {
    // Abstract method (no body)
    public abstract void makeSound();

    // Regular method
    public void sleep() {
        System.out.println("Sleeping...");
    }
}

// Subclass (inherits from Animal)
class Dog extends Animal {
    // Implement the abstract method
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow!");
    }
}
public class Abstruct {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();  // Output: Woof!
        myDog.sleep();      // Output: Sleeping...

        Animal myCat = new Cat();
        myCat.makeSound();  // Output: Meow!
    }
}



