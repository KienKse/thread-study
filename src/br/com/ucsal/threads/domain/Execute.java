package br.com.ucsal.threads.domain;

import br.com.ucsal.threads.model.Character;
import br.com.ucsal.threads.thread.ThreadDamage;
import br.com.ucsal.threads.thread.ThreadK;

public class Execute {

	private static final Integer BASE_LIFE = 5;

	public static void main(String[] args) throws InterruptedException {

		/** Panda's universe */
		Character adolfo = new Character("Adolfo", 27, "Human", "Mage", BASE_LIFE);
		Character lena = new Character("Lena", 9001, "Godness", "BadAss", BASE_LIFE);

		/** Scarlet's universe */
		Character coeiu = new Character("Ragnus", 16, "Anthro", "Mage Cleric", BASE_LIFE);
		Character briiu = new Character("Bright Aurora", 23 , "Human", "Swordsman Warrior", BASE_LIFE);
		Character kent = new Character("Kent", 28 , "Dragokin", "Swordsman Warrior", BASE_LIFE);

		//new Thread(new ThreadK(coeiu, briiu)).start();
		new Thread(new ThreadDamage(coeiu, briiu)).start();
		new Thread(new ThreadDamage(briiu, coeiu)).start();
	}
	
}
