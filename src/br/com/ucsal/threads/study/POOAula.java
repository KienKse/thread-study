package br.com.ucsal.threads.study;
import java.util.concurrent.ThreadLocalRandom;

public class POOAula {
    public static void main(String[] args) throws InterruptedException {
//        methodRandomTimeExecution();
//        interruptedExample();
//        threadTest();
//        joinExample();
//        exercicio3();
        SharedObjectProdutorConsumidor();
    }

    private static void SharedObjectProdutorConsumidor() {
        SharedObject o = new SharedObject();
        String[] names = {"C1","C2","P1","P2",};
        Thread[] threads = {
                new Thread(new Consumidor(o)),
                new Thread(new Consumidor(o)),
                new Thread(new Produtor(o)),
                new Thread(new Produtor(o))};
        for (int i = 0; i < threads.length; i++) {
            threads[i].setName(names[i]);
            threads[i].start();
        }
        System.out.println("Main is Done.");
    }

    private static void exercicio3() {
        new Thread(new ThreadRaizImpar()).start();
        new Thread(new ThreadRaizCubicaPar()).start();
    }

    private static void joinExample() throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i < 20; i++) {
                try {
                    Thread.sleep(150L);
                    System.out.println("|"+i+"|");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        System.out.println("Esperando por " + t1.getName());
        t1.join();
        System.out.println("Thread main is done");
    }

    private static void interruptedExample() throws InterruptedException {
        Thread t =  new Thread(new ThreadInterrupted());
        t.start();
        Thread.sleep(3000L);
        t.interrupt();
    }

    private static void methodRandomTimeExecution() {
        new Thread(new NewRunnable("Primeiro", 1000L)).start();
        new Thread(new NewRunnable("Segundo", 2000L)).start();
        new Thread(new NewRunnable("Terceiro", 3000L)).start();
    }

    private static void threadTest() {
        Thread t1 = new Thread(() -> System.out.println(randomNum() + " 1 " + Thread.currentThread().getName()));
        Thread t2 = new Thread(() -> System.out.println(randomNum() + " 2 " + Thread.currentThread().getName()));
        new Thread(() -> System.out.println(randomNum() + " 3 " + Thread.currentThread().getName())).start();
        new Thread(() -> System.out.println(randomNum() + " 4 " + Thread.currentThread().getName())).start();
        t1.start();
        t2.start();
    }

    private static int randomNum() {
        return ThreadLocalRandom.current().nextInt(50, 100 + 1);
    }

}
