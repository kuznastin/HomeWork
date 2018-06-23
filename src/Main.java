import HomeWork.Trainer;

public class Main {
    public static void main(String[] args) {
   String dogName="Lucky";
   String callComm="to me";
   String sitComm="sit";
   String lieComm="lie";

   Trainer dogTrainer;
   dogTrainer = new Trainer();
   dogTrainer.giveCommand(dogName,callComm);
   dogTrainer.praiseDog();
   dogTrainer.giveCommand(dogName,sitComm);
   dogTrainer.praiseDog();
   dogTrainer.giveCommand(dogName,lieComm);
   dogTrainer.breakDog();
   dogTrainer.giveCommand(dogName,lieComm);
   dogTrainer.praiseDog();
    }
}
