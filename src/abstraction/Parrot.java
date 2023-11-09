package abstraction;

public class Parrot extends Animal {
    @Override
    public void eat() {
        System.out.println("Eat grass");
    }

    public void talk() {
        System.out.printf("Hello");
    }
}
