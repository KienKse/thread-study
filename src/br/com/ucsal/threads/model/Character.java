package br.com.ucsal.threads.model;

public class Character {
	
	private static final Integer MAX_DAMAGE = 5;
	
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
		return (int) (Math.random()*MAX_DAMAGE) + 1;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Integer getLife() {
		return this.life;
	}

	public boolean isAlive() {
		return this.life > 1;
	}

	public void getLifeReduce(Integer damage) {
		this.life -= damage;
		alive = isAlive();
	}
	
	
	

}
