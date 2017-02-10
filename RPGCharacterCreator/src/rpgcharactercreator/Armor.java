package rpgcharactercreator;

public class Armor extends CharacterClass implements ModifiesStats{
	private int attack;
	private int defense;
	private int speed;
	private int magic;
	private int attackSpeed;
	private int health;
	private String description;

	public Armor(String name) {
		super(name);
		
		switch(name){
		
		case "Elistans Defender":
			attack = 10;
			defense = 25;
			 speed =  -5;
			 magic =  -10;
			 attackSpeed = -5;
			 health = 30; break;
			 
		case "Daedrics Blood":
			attack = -10;
			defense = 10;
			 speed = 10 ;
			 magic = 20 ;
			 attackSpeed = 5;
			 health = 5; break;
			 
		case "Stormcloak":
			attack = 15;
			defense = 5;
			 speed = 10 ;
			 magic = 5 ;
			 attackSpeed = 10;
			 health = 5; break;
			 
		case "Armor of Altair":
			attack = 15;
			defense = 5;
			 speed =  15;
			 magic = -10;
			 attackSpeed = 15;
			 health = 5; break;
		default:
			System.out.println("armor error");
		
		}
		
	}
	public String getDescription() {
		return description;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getMagic() {
		return magic;
	}

	public void setMagic(int magic) {
		this.magic = magic;
	}

	public int getAttackSpeed() {
		return attackSpeed;
	}

	public void setAttackSpeed(int attackSpeed) {
		this.attackSpeed = attackSpeed;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

}
