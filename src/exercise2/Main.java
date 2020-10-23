package exercise2;

public class Main {
    //Exercitiul 5
    /*Create a new package called Exercise2. Inside the package, create a class
    with a main method and print the name of the current thread. Then create a loop (from 0 to 9) and
    inside the loop create 10 threads
    having the name of their index inside the loop (thread number one will be called „1”).
    Print the name of each thread.
     */
    public static void main(String[] args){
        Thread t = Thread.currentThread();
        String threadName = t.currentThread().getName();
        System.out.println("The name of the current thread is "+ threadName);

        for(int i=0;i<10;i++){
            Thread th = new Thread();
            String j =Integer.toString(i);
            th.setName(j);
            System.out.println("The name is "+ th.getName());
        }
    }
}
