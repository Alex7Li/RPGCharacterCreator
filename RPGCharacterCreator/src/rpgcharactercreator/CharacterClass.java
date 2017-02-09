package rpgcharactercreator;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class CharacterClass implements ModifiesStats {
	private int health;
	private int attack;
	private int defense;
	private int speed;
	private int magic;
	private int attackSpeed;
	private String description;
	private Icon picture;

	public CharacterClass(String name) {

		select(name);

	}

	public int[] getStats() {
		// int health, int attack, int defense, int speed, int magic, int
		// attackSpeed
		int[] stats = new int[6];
		stats[0] = health;
		return stats;
	}

	@Override
	public void select(String name) {
		switch (name) {
		case "Warrior":
			attack = 50;
			defense = 70;
			speed = 55;
			magic = 40;
			attackSpeed = 50;
			health = 70;
			description = "A fierce fighter who relies on brute force.";
			picture = new ImageIcon("warrior.jpg");
			break;

		case "Archer":
			attack = 30;
			defense = 40;
			speed = 70;
			magic = 50;
			attackSpeed = 75;
			health = 35;
			break;

		case "Mage":
			attack = 25;
			defense = 50;
			speed = 60;
			magic = 80;
			attackSpeed = 40;
			health = 50;
			break;

		case "Assassin":
			attack = 65;
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
	public String getDescription() {
		return description;
	}

	public Icon getPicture() {
		return picture;
	}

}
