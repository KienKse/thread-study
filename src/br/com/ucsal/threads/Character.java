package br.com.ucsal.threads;

public class Character {
	
	private String name;
	private Integer age;
	private String breed;
	private String cClass;
	
	private Integer life;
	private Integer damage;
	
	public Character(String name, Integer age, String breed, String cClass, Integer life) {
		super();
		this.name = name;
		this.age = age;
		this.breed = breed;
		this.cClass = cClass;
		this.life = life;
		this.damage = getDamage();
	}
	
	// FIX BUG VALUE DAMAGE EQUAL
	
	private Integer getDamage() {
		return (int) (Math.random()*10) + 1;
	}
	
	public String getName() {
		return this.name;
	}

	public Integer getAge() {
		return this.age;
	}

	public String getBreed() {
		return this.breed;
	}

	public String getcClass() {
		return this.cClass;
	}

	public Integer getLife() {
		return this.life;
	}
	
	public Integer getDamageR() {
		return this.damage;
	}

	public Integer getLifeReduce(Integer damage) {
		return this.life -= damage;
	}
	
	
	

}
