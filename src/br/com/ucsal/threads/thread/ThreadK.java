package br.com.ucsal.threads.thread;

import br.com.ucsal.threads.model.Character;
import br.com.ucsal.threads.quotes.Quote;

public class ThreadK implements Runnable {
	
	private Character c1;
	private Character c2;
	
	public ThreadK (Character character1 , Character character2) {
		this.c1 = character1;
		this.c2 = character2;
	}

	@Override
	public void run() {
		System.out.println(c1.getName() + Quote.getQuoteOPhrase((int) (Math.random()*Quote.length())) + c2.getName());
		System.out.println(c2.getName() + Quote.getQuoteOPhrase((int) (Math.random()*Quote.length())) + c1.getName());
	}


}
