package rpgcharactercreator;

import java.awt.BorderLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class CharacterPage extends JFrame {

	private int health;
	private int attack;
	private int defense;
	private int speed;
	private int magic;
	private int attackSpeed;
	private String description;
	private Icon picture;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 * @param m 
	 * @param l 
	 * @param k 
	 * @param j 
	 */
	public CharacterPage(int race, int clas, int weapons, int armor) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout());
		
		JLabel classPicture = new JLabel("");
		classPicture.setHorizontalAlignment(SwingConstants.CENTER);
		classPicture.setIcon(new ImageIcon("archer.jpg"));
		contentPane.add(classPicture, BorderLayout.CENTER);
		
		JLabel classLabel = new JLabel("Class Info");
		classLabel.setVerticalAlignment(SwingConstants.TOP);
		contentPane.add(classLabel, BorderLayout.NORTH);
		
		JLabel raceLabel = new JLabel("Race Info");
		raceLabel.setVerticalAlignment(SwingConstants.TOP);
		contentPane.add(raceLabel, BorderLayout.WEST);
		
		JLabel equpimentLabel = new JLabel("Gear");
		equpimentLabel.setHorizontalAlignment(SwingConstants.CENTER);
		equpimentLabel.setVerticalAlignment(SwingConstants.TOP);
		contentPane.add(equpimentLabel, BorderLayout.EAST);
		
		
		String className;
			switch (clas) {
			case 1:
				className = "Warrior";
				break;
			case 2:
				className = "Archer";
				break;
			case 3:
				className = "Assassin";
				break;
			case 4:
				className = "Mage";
				break;
	
			default:
				className = "N/A";
			}				
		String weaponName;
			switch(weapons){
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
		classPicture.setIcon(characterClass.getPicture());
		classLabel.setText(characterClass.getDescription());
		equpimentLabel.setText(characterArmor.getDescription() + "/n" + characterWeapon.getDescription());
		
		StringBuilder text = new StringBuilder();
		text.append("STATS:");
		health = characterClass.getHealth()+characterWeapon.getHealth()+characterArmor.getHealth();
		attack = characterClass.getAttack()+characterWeapon.getAttack()+characterArmor.getAttack();
		defense = characterClass.getDefense()+characterWeapon.getDefense()+characterArmor.getDefense();
		speed = characterClass.getSpeed()+characterWeapon.getSpeed()+characterArmor.getSpeed();
		magic = characterClass.getMagic()+characterWeapon.getMagic()+characterArmor.getMagic();
		attackSpeed =  characterClass.getAttackSpeed()+characterWeapon.getAttackSpeed()+characterArmor.getAttackSpeed();
		text.append("\nHealth " + health);
		text.append("\nAttack " + attack);
		text.append("\nDefense " + defense);
		text.append("\nSpeed " + speed);
		text.append("\nMagic " + magic);
		text.append("\nAttackSpeed " + attackSpeed);
		JLabel lblStats = new JLabel(text.toString());
		contentPane.add(lblStats, BorderLayout.SOUTH);
		}	
	}

}
