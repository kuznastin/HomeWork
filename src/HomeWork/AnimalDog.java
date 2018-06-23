package HomeWork;



public class AnimalDog extends AnimalAbs {


    @Override
    public boolean notDoCommand(String nameComm) {
        return true;
    }

    @Override
    public boolean doCommand(String nameComm) {
        return true;
    }
}
