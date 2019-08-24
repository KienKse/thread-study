package br.com.ucsal.threads.study;

public class Pilha {
	
	private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
	
	private static String[] array = new String[6];
	private static int cursor = -1;
		
	private String gerarLetra() {
		int index = (int) (Math.random()*ALPHABET.length());
		return ALPHABET.substring(index, index+1);
	}

//	private void imprimirVetor() {
//		for (int i = 0; i < cursor; i++) {
//			System.out.println(array[i] == null ? "''" : array[i]);
//		}
//		System.out.println("");
//	}
	
	public String pop() {
		String buf = array[cursor] ;
		array[cursor] = null;
		cursor--;
		return buf;
	}
	
	public void push(String c) {
		cursor++;
		array[cursor] = c;
	}

    public synchronized boolean set() {
        try {
            while (cursor >= 5)
                wait();
            String letra = gerarLetra();
            push(letra);
            System.out.println(Thread.currentThread().getName() + ": PRODUCED: " + letra + " -> position: " + cursor);
            notifyAll();
            return true;
        } catch (InterruptedException ex) {
            return false;
        }
    }

    public synchronized boolean reset() {
        try { 
            while (cursor < 0)
                wait();
            System.out.println(Thread.currentThread().getName() + ": CONSUMED: " + array[cursor] + " -> position: " + cursor);
            pop();
            notifyAll();
            return true;
        } catch (InterruptedException ex) {
            return false;
        }
    }
	
    

}


