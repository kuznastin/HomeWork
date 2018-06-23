package HomeWork;

public abstract class AnimalAbs implements AnimalInt{

   public String animalType;
   public String animalName;

    @Override
    public boolean notDoCommand(String nameComm) {
        return false;
    }

    @Override
    public boolean doCommand(String nameComm) {
        return false;
    }
}
