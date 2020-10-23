package Lab1;

public class MyThread extends Thread{

    @Override
    public void run() {
       /* System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(100*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        System.out.println("Hello from MyThread!");
    }
}
