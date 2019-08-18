package br.com.ucsal.threads;

public class ThreadK implements Runnable {
	
	Character c1 = new Character("Adolfo", 27, "Human", "Mage", 20);
	Character c2 = new Character("Lena", 9001, "Godness", "BadAss", 20);
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		greetChars(c1, c2);
	}

	private void greetChars(Character c1, Character c2) {
		System.out.println(c1.getName() + ": Saudações, " + c2.getName());
		System.out.println(c2.getName() + ": Foi você quem pediu, " + c1.getName());
	}

	private void fightCharacter(Character c1, Character c2) {
				
	}

}
