package inheritance;

public class JuniorManager extends Manager {

    @Override
    public void work() {
        System.out.printf("Specific tasks to do");
    }


    public void goOnSaboticalLeave(){
        System.out.println("TakeLeave");
    }
}
