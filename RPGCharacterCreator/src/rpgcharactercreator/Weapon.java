package rpgcharactercreator;

import javax.swing.Icon;

public class Weapon implements ModifiesStats{
	private int attack;
	private int defense;
	private int speed;
	private int magic;
	private int attackSpeed;
	private int health;
	private String description;

	public Weapon(String name) {
		
		switch(name){
		
		case "Long Sword":
			attack = 15;
			defense = 5;
			 speed = 10 ;
			 magic = 0 ;
			 attackSpeed = 15;
			 health = 10; break;
			 
		case "Oak Bow":
			attack = 10;
			defense = 3;
			 speed = 15 ;
			 magic = 5 ;
			 attackSpeed = 20;
			 health = 5; break;
			 
		case "Staff of Eden":
			attack = 5;
			defense = 5;
			 speed = 15 ;
			 magic = 20 ;
			 attackSpeed = 10;
			 health = 7; break;
			 
		case "Dragon Breaths Dagger":
			attack = 20;
			defense = 5;
			 speed = 10 ;
			 magic = 0 ;
			 attackSpeed = 20;
			 health = 5;
			 break;
			 
		default: System.out.println("failure to create weapon");
		}
		}
	public String getDescription() {
		return description;
	}

	public int getAttack() {
		return attack;
	}
	public int getDefense() {
		return defense;
	}
	public int getSpeed() {
		return speed;
	}
	public int getMagic() {
		return magic;
	}
	public int getAttackSpeed() {
		return attackSpeed;
	}
	public int getHealth() {
		return health;
	}
	@Override
	public int[] getStats() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Icon getPicture() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void select(String name) {
		// TODO Auto-generated method stub
		
	}
}
