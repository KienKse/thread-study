package br.com.ucsal.threads.study;

public class NewRunnable implements Runnable {

    private String parametro;
    private Long tempo;

    public NewRunnable(String parametro, Long tempo) {
        this.parametro = parametro;
        this.tempo = tempo;
    }

    @Override
    public void run() {
        try {
            while(true) {
                Thread.sleep(tempo);
                System.out.println(parametro);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(parametro);
    }
}
