package br.com.ucsal.threads.study;

import java.util.Random;

public class Consumidor implements Runnable{

    private SharedObject shared;
    private static final int TENTATIVAS = 3;

    Consumidor(SharedObject shared) {
        this.shared = shared;
    }

    @Override
    public void run() {
        for (int i = 0; i < TENTATIVAS; i++) {
            if(!shared.reset())
                break;
        }
        System.out.println(Thread.currentThread().getName()  + " Consumer DONE.");
    }
}
