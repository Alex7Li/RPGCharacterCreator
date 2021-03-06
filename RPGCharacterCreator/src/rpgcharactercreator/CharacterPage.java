package rpgcharactercreator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


@SuppressWarnings("serial")
public class CharacterPage extends JFrame {

	private int health;
	private int attack;
	private int defense;
	private int speed;
	private int magic;
	private int attackSpeed;
	Player player;

	private JPanel contentPane;
	JLabel lblStats = new JLabel("Stats: ");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CharacterPage frame = new CharacterPage("joe",1,4,1,1);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param m 
	 * @param l 
	 * @param k 
	 * @param j 
	 */
	public CharacterPage(String name, int race, int clas, int weapons, int armor) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
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
		
		JLabel classPicture = new JLabel(new ImageIcon(CharacterPage.class.getResource("/" + characterClass.getPicture())));
		classPicture.setBounds(98, 71, 306, 189);
		classPicture.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(classPicture);
		
//		JLabel raceLabel = new JLabel("Race Info"  + characterRace.getDescription());
//		raceLabel.setBounds(5, 180, 195, 93);
//		raceLabel.setVerticalAlignment(SwingConstants.TOP);
//		contentPane.add(raceLabel);
		
		JLabel equpimentLabel = new JLabel("<html> Armor: " + characterArmor.getDescription() + "<br> Weapon: " 
									+characterWeapon.getDescription() + "</html>");
		equpimentLabel.setBounds(22, 285, 180, 1170);
		equpimentLabel.setHorizontalAlignment(SwingConstants.CENTER);
		equpimentLabel.setVerticalAlignment(SwingConstants.TOP);
		contentPane.add(equpimentLabel);
		
		JLabel classLabel = new JLabel("Class Info: " + characterClass.getDescription());
		classLabel.setBounds(162, 6, 655, 152);
		classLabel.setVerticalAlignment(SwingConstants.TOP);
		contentPane.add(classLabel);
		
		StringBuilder text = new StringBuilder();
		text.append("<html>STATS:");
		health = characterClass.getHealth()+characterWeapon.getHealth()+characterArmor.getHealth();
		attack = characterClass.getAttack()+characterWeapon.getAttack()+characterArmor.getAttack();
		defense = characterClass.getDefense()+characterWeapon.getDefense()+characterArmor.getDefense();
		speed = characterClass.getSpeed()+characterWeapon.getSpeed()+characterArmor.getSpeed();
		magic = characterClass.getMagic()+characterWeapon.getMagic()+characterArmor.getMagic();
		attackSpeed =  characterClass.getAttackSpeed()+characterWeapon.getAttackSpeed()+characterArmor.getAttackSpeed();
		text.append("<br>Health " + health);
		text.append("<br>Attack " + attack);
		text.append("<br>Defense " + defense);
		text.append("<br>Speed " + speed);
		text.append("<br>Magic " + magic);
		text.append("<br>Attack Speed " + attackSpeed + "</html>");
		player = new Player(attack, defense, speed, magic, attackSpeed, health, "/" + characterClass.getPicture());
		lblStats.setText(text.toString());
		lblStats.setBounds(5, 50, 500, 85);
		contentPane.add(lblStats, BorderLayout.SOUTH);
		
		JLabel namelbl = new JLabel(name);
		namelbl.setBounds(10, 10, 80, 30);
		contentPane.add(namelbl);
		
		JButton btnBattle = new JButton("Battle!");
		btnBattle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							FightPage frame = new FightPage(player);
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnBattle.setBounds(388, 280, 117, 29);
		contentPane.add(btnBattle);
	}
}
