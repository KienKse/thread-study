package br.com.ucsal.threads;

public class Execute {

	public static void main(String[] args) {
		new Thread(new ThreadK()).start();
		new Thread(new ThreadFight()).start();
	}
	
}
