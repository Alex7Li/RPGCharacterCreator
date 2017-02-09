package simko.inheritence;

import javax.swing.Icon;

import simko.inheritence.ModifiesStats;

public class CharacterClass implements ModifiesStats{
	private int attack;
	private int defense;
	private int speed;
	private int magic;
	private int attackSpeed;
	private int health;
	private String description;
	private Icon picture;
	@Override
	public int getStats(int attack, int defense, int speed, int magic, int attackSpeed, int health) {
		
		return 0;
	}

	@Override
	public void select() {
		
		
	}

	@Override
	public void deselect() {
		
		
	}
	public CharacterClass(String name){
		
		switch(name){
		
		case "Warrior":
			attack = 50;
			defense = 60;
			speed = 55 ;
			magic = 25;
			attackSpeed = 40;
			health = 70;
			break;
			
		case "Archer":
			attack = 30 ;
			defense = 40;
			speed = 70;
			magic = 50;
			attackSpeed = 75;
			health = 35;
			break;
			
		case "Mage":
			attack = 20;
			defense = 50;
			speed = 60;
			magic = 80;
			attackSpeed = 40;
			health = 50;
			break;
			
		case "Assassin":
			attack = 70;
			defense = 30;
			speed = 80;
			magic = 20;
			attackSpeed = 60;
			health = 40;
			break;
			
			
		default:
			System.out.println("Error.");
				break;
		
		}
		
	}

}
