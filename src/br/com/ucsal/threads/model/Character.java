package br.com.ucsal.threads.model;

public class Character {
	
	private String name;
	private Integer age;
	private String breed;
	private String cClass;

	//TODO: LIVES CONTROL
	private boolean alive;

	private Integer life;
	
	public Character(String name, Integer age, String breed, String cClass, Integer life) {
		super();
		this.name = name;
		this.age = age;
		this.breed = breed;
		this.cClass = cClass;
		this.life = life;
		this.alive = true;
	}
	
	public Integer getDamage() {
		return (int) (Math.random()*10) + 1;
	}
	
	public String getName() {
		return this.name;
	}

	public boolean isAlive() {
		alive = this.life < 1 ? false : true;
		return alive;
	}

	public void getLifeReduce(Integer damage) {
		this.life -= damage;
		isAlive();
	}
	
	
	

}
