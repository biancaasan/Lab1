package Lab1;

public class RandomOutTask implements Task{
    int min = 0;
    int max = 100000;
    int randNr;

    public RandomOutTask() {
        this.randNr = (int)(Math.random()*(max-min+1)+min);
    }

    public void execute(){
        System.out.println("The number generated random is "+randNr);
    }
}
