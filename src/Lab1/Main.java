package Lab1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        //Exercitiul 2
    /*
        Biblioteca bibl = new Biblioteca();
        Carte carte = new Carte("Fratii Karamazov","Feodor Dostoievski",1880,1200);
        bibl.addCarte(carte);
        bibl.addCarte(new Carte("Procesul","Kafka",1910,600));
        bibl.addCarte(new Carte("Ender's Game","Orscon Scott Card",1954,350));
        bibl.sort();
        //System.out.println(bibl);
        MyThread t1 = new MyThread();
        System.out.println(Thread.currentThread().getName());

        for(int i=0;i<20;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(100 * 1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName());
                }
            }).start();
        }

        t1.setName("SAA");
        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    */

        //Exercitiul 3
    /*
        OutTask task1 = new OutTask();
        task1.execute();
        RandomOutTask task2 = new RandomOutTask();
        task2.execute();
        CounterOutTask task3 = new CounterOutTask();
        task3.execute();
        CounterOutTask task4 = new CounterOutTask();
        task4.execute();
      */

        /*
        ArrayList<Task> tasks = new ArrayList<Task>();
        tasks.add(new OutTask());
        tasks.add(new OutTask());
        tasks.add(new RandomOutTask());
        tasks.add(new CounterOutTask());


        for(Task j:tasks)  //pentru a itera prin lista de task-uri
            j.execute();

         */

        //Exercitiul 4
        /*
        MyThread myThread = new MyThread();
        myThread.start();
        MyRunnable runn1 = new MyRunnable();
        Thread t = new Thread(runn1);
        t.start();
        //implementare anonima a unui thread

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread anonim care printeaza o chestie ^.^");
            }
        }).start();
         */


    }
}
