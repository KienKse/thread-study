package br.com.ucsal.threads.thread;

import br.com.ucsal.threads.model.Character;

public class ThreadDamage implements Runnable {

    private Character atacante;
    private Character alvo;

    public ThreadDamage(Character character1 , Character character2) {
        this.atacante = character1;
        this.alvo = character2;
    }

    private void reduceDamage() {
        while(atacante.isAlive() && alvo.isAlive()) {
        	int dmg = atacante.getDamage();
            System.out.println(atacante.getName() + " atingiu " + alvo.getName() + " com " + dmg + " de dano.");
            alvo.getLifeReduce(dmg);
        }
        System.out.println(atacante.getName() + " -> " + atacante.getLife() + "\n" + alvo.getName() + " -> " + alvo.getLife());
        if(atacante.isAlive()) {
        	System.out.println("\nO personagem " + alvo.getName() + " foi nocauteado!");
        }
    }

    @Override
    public void run() {
        reduceDamage();
    }
}
