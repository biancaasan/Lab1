package Lab1;

public class CounterOutTask implements Task{
    public static int counter = 0;
    public void execute(){
        counter++;
        System.out.println("The value of counter is: "+counter);
    }
}
