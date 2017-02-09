package rpgcharactercreator;

import simko.inheritence.ModifiesStats;

public class Defenses extends CharacterClass implements ModifiesStats{
	private int attack;
	private int defense;
	private int speed;
	private int magic;
	private int attackSpeed;
	private int health;

	public Defenses(String name) {
		super(name);
		
		switch(name){
		
		case "Elistans Defender":
			attack = 10;
			defense = 25;
			 speed =  -5;
			 magic =  -10;
			 attackSpeed = -5;
			 health = 30;
			 
		case "Daedrics Blood":
			attack = -10;
			defense = 10;
			 speed = 10 ;
			 magic = 20 ;
			 attackSpeed = 5;
			 health = 5;
			 
		case "Stormcloak":
			attack = 15;
			defense = 5;
			 speed = 10 ;
			 magic = 5 ;
			 attackSpeed = 10;
			 health = 5;
			 
		case "Armor of Altair":
			attack = 15;
			defense = 5;
			 speed =  15;
			 magic = -10;
			 attackSpeed = 15;
			 health = 5;
			 
			 
		
		
		
		
		}
		
	}

	@Override
	public int getStats(int attack, int defense, int speed, int magic, int attackSpeed, int health) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void select() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deselect() {
		// TODO Auto-generated method stub
		
	}

}