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
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CharacterPage frame = new CharacterPage();
					frame.setVisible(true);
					frame.setTitle("Character Information Page");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CharacterPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout());
		
		JLabel lblNewLabel = new JLabel("Race Info");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		contentPane.add(lblNewLabel, BorderLayout.WEST);
		
		JLabel lblNewLabel_1 = new JLabel("Gear");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		contentPane.add(lblNewLabel_1, BorderLayout.EAST);
		
		JLabel label = new JLabel("");
		contentPane.add(label, BorderLayout.CENTER);
		
		JLabel lblStats = new JLabel("STATS:");
		contentPane.add(lblStats, BorderLayout.SOUTH);
	}
	public int[] getStats() {
		// int health, int attack, int defense, int speed, int magic, int
		// attackSpeed
		int[] stats = new int[6];
		stats[0] = health;
		stats[1] = attack;
		stats[2] = defense;
		stats[3] = speed;
		stats[4] = magic;
		stats[5] = attackSpeed;

		return stats;
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
