package abstraction;

//Lion is an animal
public class Lion extends Animal {

    public void shout() {
        breath();
        System.out.println("Grrr");
    }

    @Override
    public void eat() {
        System.out.println("Eat meat");
    }

    public void hunt(){
        System.out.println("Hunt");
    }

    public void hunt(int speed){
        System.out.println("Hunt");
    }
}