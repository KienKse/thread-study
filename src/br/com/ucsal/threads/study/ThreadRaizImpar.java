package br.com.ucsal.threads.study;

public class ThreadRaizImpar implements Runnable{

    private static Integer contador = 1;

    @Override
    public void run() {
        try {
            while(contador <= 99) {
                if(contador%2!=0) {
                    System.out.println("Número: " + contador + " -> " + Math.sqrt(contador));
                }
                Thread.sleep(50L);
                contador++;
            }
            System.out.println("Fim");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
