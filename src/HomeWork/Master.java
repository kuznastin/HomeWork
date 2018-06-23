package HomeWork;

public class Master extends TrainerAbs {
    @Override
    public void giveCommand(String nameDog, String nameComm) {
        System.out.println( nameComm + "!");
    }

    @Override
    public void praiseDog() {
        super.praiseDog();
    }

    @Override
    public void breakDog() {
        super.breakDog();
    }
}
