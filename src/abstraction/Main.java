package abstraction;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        Animal animal;
        animal = new Lion();
        animal.eat();
        //animal.shout();
        ((Lion)animal).shout();
        animal = new Parrot();
        animal.eat();
        ((Parrot)animal).talk();

        /*Animal parrot = new Parrot();
        System.out.println("Cat says ");
        animal.eat();
        System.out.println("Dog says ");
        parrot.eat();

        Employee employee = new SeniorManager();*/
    }
}
