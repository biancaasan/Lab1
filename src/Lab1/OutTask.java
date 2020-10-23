package Lab1;

public class OutTask implements Task {
    String mesaj;

    public OutTask() {
        this.mesaj = "Hello from OutTask";
    }

    @Override
    public void execute(){
        System.out.println(mesaj);
    }
}
