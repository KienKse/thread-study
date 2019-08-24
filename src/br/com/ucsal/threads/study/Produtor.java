package br.com.ucsal.threads.study;

public class Produtor implements Runnable{

    private SharedObject shared;
    private Pilha objeto;
    private static final int TENTATIVAS = 26;

    Produtor (SharedObject shared) {
        this.shared = shared;
    }
    
    Produtor (Pilha objeto) {
        this.objeto = objeto;
    }

    @Override
    public void run() {
        for (int i = 0; i < TENTATIVAS; i++) {
            if(!objeto.set())
                break;
        }
        System.out.println(Thread.currentThread().getName()  + " Producer DONE.");
    }
}
