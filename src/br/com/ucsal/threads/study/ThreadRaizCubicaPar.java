package br.com.ucsal.threads.study;

public class ThreadRaizCubicaPar implements Runnable{

    private static Integer contador = 2;
    private static Integer decimo = 0;

    @Override
    public void run() {
        try {
            while(contador <= 2000) {
                if(contador%2==0) {
                    decimo++;
                    if(decimo == 10) {
                        System.out.println("Número: " + contador + " -> " + Math.cbrt(contador));
                        decimo = 0;
                    }
                }
                Thread.sleep(10L);
                contador++;
            }
            System.out.println("Fim");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
