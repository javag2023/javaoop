package abstraction;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        Animal cat = new Cat();
        Animal dog = new Dog();
        System.out.println("Cat says ");
        cat.shout();
        System.out.println("Dog says ");
        dog.shout();
    }
}
