package rpgcharactercreator;

public class Player extends Character{
	String name;
	
	public Player(int attack, int defense, int speed, int magic, int attackSpeed, int health, String image) {
		super(attack, defense, speed, magic, attackSpeed, health, image);
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
}
