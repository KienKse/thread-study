package br.com.ucsal.threads.study;

public class Consumidor implements Runnable{

    private SharedObject shared;
    private Pilha objeto;
    private static final int TENTATIVAS = 26;

    Consumidor(SharedObject shared) {
        this.shared = shared;
    }
    
    Consumidor(Pilha objeto) {
        this.objeto = objeto;
    }

    @Override
    public void run() {
        for (int i = 0; i < TENTATIVAS; i++) {
            if(!objeto.reset())
                break;
        }
        System.out.println(Thread.currentThread().getName()  + " Consumer DONE.");
    }
}
