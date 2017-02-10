package rpgcharactercreator;

public abstract class Character {
	private int attack;
	private int defense;
	private int speed;
	private int magic;
	private int attackSpeed;
	private int health;
	private String image;

	public Character(int weapon, int armor,int clas, String image){
		String className;
		switch (clas) {
		case 1:
			className = "Warrior";
			break;
		case 2:
			className = "Archer";
			break;
		case 4:
			className = "Assassin";
			break;
		case 3:
			className = "Mage";
			break;

		default:
			className = "N/A";
		}				
	String weaponName;
		switch(weapon){
		case 1:
			weaponName = "Long Sword";
			break;
		case 2:
			weaponName = "Oak Bow";
			break;
		case 3:
			weaponName = "Staff of Eden";
			break;
		case 4:
			weaponName = "Dragon Breaths Dagger";
			break;
		default:
			weaponName = "N/A";
		}
		
	String armorName;
		switch(armor){
		case 1:
			armorName = "Elistans Defender";
			break;
		case 2:
			armorName = "Daedrics Blood";
			break;
		case 3:
			armorName = "Stormcloak";
			break;
		case 4:
			armorName = "Armor of Altair";
			break;
		default:
			armorName = "N/A";
		}
		
		Weapon characterWeapon = new Weapon(weaponName);
		Armor characterArmor = new Armor(armorName);
		CharacterClass characterClass = new CharacterClass(className);
		
		health = characterClass.getHealth()+characterWeapon.getHealth()+characterArmor.getHealth();
		attack = characterClass.getAttack()+characterWeapon.getAttack()+characterArmor.getAttack();
		defense = characterClass.getDefense()+characterWeapon.getDefense()+characterArmor.getDefense();
		speed = characterClass.getSpeed()+characterWeapon.getSpeed()+characterArmor.getSpeed();
		magic = characterClass.getMagic()+characterWeapon.getMagic()+characterArmor.getMagic();
		attackSpeed =  characterClass.getAttackSpeed()+characterWeapon.getAttackSpeed()+characterArmor.getAttackSpeed();
		this.image = image;
	}
		
	public Character(Weapon characterWeapon, Armor characterArmor, CharacterClass characterClass, String image){
		health = characterClass.getHealth()+characterWeapon.getHealth()+characterArmor.getHealth();
		attack = characterClass.getAttack()+characterWeapon.getAttack()+characterArmor.getAttack();
		defense = characterClass.getDefense()+characterWeapon.getDefense()+characterArmor.getDefense();
		speed = characterClass.getSpeed()+characterWeapon.getSpeed()+characterArmor.getSpeed();
		magic = characterClass.getMagic()+characterWeapon.getMagic()+characterArmor.getMagic();
		attackSpeed =  characterClass.getAttackSpeed()+characterWeapon.getAttackSpeed()+characterArmor.getAttackSpeed();
		this.image = image;

	}

	
	public Character(int attack, int defense, int speed, int magic, int attackSpeed, int health, String image){
		this.attack = attack;
		this.defense = defense;
		this.speed = speed;
		this.magic = magic;
		this.attackSpeed = attackSpeed;
		this.health = health;
		this.image = image;
	}
	
	public void attack(Character foe) {
		int damage = 10*attack/foe.getDefense();
		if(Math.random()*100<foe.getSpeed()-speed+20){
			//dodge
			damage = 0;
		}
		else if(Math.random()*100<speed-foe.getSpeed()+20){
			//crit
			damage *= 2;
		}
		damage += magic/10;
		damage += Math.random()*10-5;
		foe.setHealth(foe.getHealth() - damage);
	}
	
	public String toString(){
		
		return "<html>HP: " + health + 
			   "<br>ATK: " + attack + 
			   "<br>DEF: " + defense + 
			   "<br>SPD: " + speed + 
			   "<br>MAG: " + magic +
			   "<br>ATKSPD: " + attackSpeed + "</html>";
		
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
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setMagic(int magic) {
		this.magic = magic;
	}
	public void setAttackSpeed(int attackSpeed) {
		this.attackSpeed = attackSpeed;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
}
