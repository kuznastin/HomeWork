package HomeWork;

public abstract class TrainerAbs implements TrainerInt {
    @Override
    public void giveCommand(String nameDog, String nameComm) {
        System.out.println(nameDog +" "+ nameComm+"!" );
    }

    @Override
    public void praiseDog() {
        System.out.println("Good dog!");

    }

    @Override
    public void breakDog() {

        System.out.println("Bad dog!");
    }
}
