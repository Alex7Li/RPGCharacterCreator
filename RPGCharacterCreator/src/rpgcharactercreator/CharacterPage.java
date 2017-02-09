package rpgcharactercreator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JTextArea;
import javax.swing.DropMode;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

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
	public CharacterPage(int race, int clas, int weapons, int armorm) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout());
		
		JLabel classLabel = new JLabel("Race Info");
		classLabel.setVerticalAlignment(SwingConstants.TOP);
		contentPane.add(classLabel, BorderLayout.WEST);
		
		JLabel raceLabel = new JLabel("Race Info");
		raceLabel.setVerticalAlignment(SwingConstants.TOP);
		contentPane.add(raceLabel, BorderLayout.WEST);
		
		JLabel equpimentLabel = new JLabel("Gear");
		equpimentLabel.setHorizontalAlignment(SwingConstants.CENTER);
		equpimentLabel.setVerticalAlignment(SwingConstants.TOP);
		contentPane.add(equpimentLabel, BorderLayout.EAST);

		JLabel lblStats = new JLabel("STATS:");
		contentPane.add(lblStats, BorderLayout.SOUTH);
		
		for (int i = 0; i < 5; i++) {
			final String name;

			switch (i) {
			case 0:
				name = "Warrior";
				break;
			default:
				name = "N/A";
			}
		CharacterClass characterClass = new CharacterClass(name);
		//classPicture.setIcon(characterClass.getPicture(name));
		classLabel.setText(characterClass.getDescription(name));
		}
	}

	public String getDescription(String name) {
		switch (name) {
		case "Warrior":
			return "A fierce fighter who relies on brute force.";
		default:
			return "Error.";
		}
	}

	public Icon getPicture(String name) {
		// TODO Auto-generated method stub
		return null;
	}
}
