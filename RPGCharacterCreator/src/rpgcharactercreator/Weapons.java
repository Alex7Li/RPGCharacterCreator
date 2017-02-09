package rpgcharactercreator;


public class Weapons extends CharacterClass implements ModifiesStats{
	private int attack;
	private int defense;
	private int speed;
	private int magic;
	private int attackSpeed;
	private int health;

	public Weapons(String name) {
		super(name);
		
		switch(name){
		
		case "Long Sword":
			attack = 15;
			defense = 5;
			 speed = 10 ;
			 magic = 0 ;
			 attackSpeed = 15;
			 health = 10;
			 
		case "Oak Bow":
			attack = 10;
			defense = 3;
			 speed = 15 ;
			 magic = 5 ;
			 attackSpeed = 20;
			 health = 5;
			 
		case "Staff of Eden":
			attack = 5;
			defense = 5;
			 speed = 15 ;
			 magic = 20 ;
			 attackSpeed = 10;
			 health = 7;
			 
		case "Dragon Breaths Dagger":
			attack = 20;
			defense = 5;
			 speed = 10 ;
			 magic = 0 ;
			 attackSpeed = 20;
			 health = 5;
		}
		}
}
