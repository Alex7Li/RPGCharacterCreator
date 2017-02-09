package rpgcharactercreator;

import java.awt.BorderLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

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
		classPicture.setIcon(new ImageIcon("mario.jpg"));
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


		JLabel lblStats = new JLabel("STATS:");
		contentPane.add(lblStats, BorderLayout.SOUTH);
		
		
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
				weaponName = "Warrior";
				break;
			case 2:
				weaponName = "Archer";
				break;
			case 3:
				weaponName = "Assassin";
				break;
			case 4:
				weaponName = "Mage";
				break;
			default:
				weaponName = "N/A";
			
			
		String armorName;
			switch(armor){
			case 1:
				armorName = "Warrior";
				break;
			case 2:
				armorName = "Archer";
				break;
			case 3:
				armorName = "Assassin";
				break;
			case 4:
				armorName = "Mage";
				break;
			default:
				armorName = "N/A";
			}
	
		CharacterClass characterClass = new CharacterClass(className);
		classPicture.setIcon(characterClass.getPicture());
		classLabel.setText(characterClass.getDescription());
		}	
	}
}
