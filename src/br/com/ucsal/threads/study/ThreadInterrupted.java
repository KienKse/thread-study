package br.com.ucsal.threads.study;

public class ThreadInterrupted implements Runnable {
    @Override
    public void run() {
        boolean interrupted = false;
        while(!interrupted) {
            interrupted = Thread.interrupted();
            System.out.println("INTERRUPTED: " + interrupted);
        }
        System.out.println("INTERRUPTED: " + interrupted);
        System.out.println("Thread: " + Thread.currentThread().getName() + " is Done!");
    }
}
