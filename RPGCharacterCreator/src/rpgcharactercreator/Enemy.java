package rpgcharactercreator;

public class Enemy extends Character{

	public Enemy(int weapon, int armor, int clas, String image) {
		super(weapon, armor, clas, image);
		
	}
	public static String getRandImage(){
		int rand = (int) ((Math.random()*4)+1);
		switch (rand) {
		case 1:
			return "/warrior.jpg";

		case 2:
			return "/archer.jpeg";

		case 3:
			return "/mage.jpeg";

		case 4:
			return "/assassin.jpeg";

		default:
			System.out.println("Enemy Class error.");
			return "/warrior.jpg";
		}
	}
}
