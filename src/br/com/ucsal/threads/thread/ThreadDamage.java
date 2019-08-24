package br.com.ucsal.threads.thread;

import br.com.ucsal.threads.model.Character;

public class ThreadDamage implements Runnable {

    private Character c1;
    private Character c2;

    public ThreadDamage(Character character1 , Character character2) {
        this.c1 = character1;
        this.c2 = character2;
    }

    private void reduceDamage() {
        while(c1.isAlive() && c2.isAlive()) {
            System.out.println("> Atacante " + c1.getName() + " => Atacado vivo = " + c2.isAlive());
            if (c1.isAlive() && c2.isAlive()) {
                System.out.println("> Atacante " + c1.getName() + " => Atacado vivo = " + c2.isAlive());
                System.out.println(c1.getName() + " atingiu " + c2.getName() + " com " + c1.getDamage() + " de dano.");
                c2.getLifeReduce(c2.getDamage());
                System.out.println("> Atacante " + c1.getName() + " => Atacado vivo = " + c2.isAlive());
            }
        }
        System.out.println("\nO personagem " + c2.getName() + " foi nocauteado!");
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        reduceDamage();
    }
}
