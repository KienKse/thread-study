package br.com.ucsal.threads;

public class ThreadFight implements Runnable {

	private boolean morte = false;
	
	@Override
	public void run() {
		ThreadK k = new ThreadK();
	
		fightCharacters(k.c1, k.c2);
	}

	private void fightCharacters(Character c1, Character c2) {
		System.out.println("!Embate começou!");
		while(!morte) {
			reduceDamage(c1, c2);
			if(!morte)
			reduceDamage(c2, c1);
		}
	}
	
	private void reduceDamage(Character c1, Character c2) {
		System.out.println(c1.getName() + " atingiu " + c2.getName() + " com " + c1.getDamageR());
		c2.getLifeReduce(c2.getDamageR());
		if(c1.getLife() == 0 || c2.getLife() == 0) {
			System.out.println(c1.getLife() == 0 ? personagemMorto(c1) : personagemMorto(c2));
		}
	}
	
	private String personagemMorto(Character c1) {
		morte = true;
		return c1.getName() + " morreu!";
	}
	
	

}
