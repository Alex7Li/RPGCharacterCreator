package rpgcharactercreator;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


@SuppressWarnings("serial")
public class CharacterMaker extends JFrame {

	private JPanel contentPane;
	private JTextField txtCharName;
	private JTextField textField;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CharacterMaker frame = new CharacterMaker();
					frame.setVisible(true);
					frame.setTitle("RPG Character Creator");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CharacterMaker() {
		setType(Type.POPUP);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtCharName = new JTextField();
		txtCharName.setBounds(75, 50, 300, 26);
		txtCharName.setHorizontalAlignment(SwingConstants.CENTER);
		txtCharName.setText("Character Name");
		contentPane.add(txtCharName);
		txtCharName.setColumns(10);
		
		JComboBox raceBox = new JComboBox();
		raceBox.setModel(new DefaultComboBoxModel(new String[] {"[Race]", "Human", "Elf", "Dwarf", "Goblin"}));
		raceBox.setToolTipText("");
		raceBox.setBounds(6, 125, 100, 27);
		contentPane.add(raceBox);
		
		JComboBox classBox = new JComboBox();
		classBox.setModel(new DefaultComboBoxModel(new String[] {"[Class]", "Warrior", "Archer", "Mage", "Assassin"}));
		classBox.setToolTipText("");
		classBox.setBounds(118, 125, 100, 27);
		contentPane.add(classBox);
		
		JComboBox weaponBox = new JComboBox();
		weaponBox.setModel(new DefaultComboBoxModel(new String[] {"[Weapon]", "Long Sword", "Oak Bow", "Staff of Eden", "Dragon's Breath Dagger"}));
		weaponBox.setBounds(230, 125, 100, 27);
		contentPane.add(weaponBox);
		
		JComboBox armorBox = new JComboBox();
		armorBox.setModel(new DefaultComboBoxModel(new String[] {"[Armor]", "Elistans Defender", "Daedric's Blood", "Stormcloak", "Armor of Altair"}));
		armorBox.setBounds(344, 125, 100, 27);
		contentPane.add(armorBox);
		//setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{contentPane, txtCharName, btnCreate, raceBox, classBox, weaponBox, armorBox}));

		JButton btnCreate = new JButton("Create Character");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CharacterPage frame = new CharacterPage(txtCharName.getText(), raceBox.getSelectedIndex(),
						classBox.getSelectedIndex(),weaponBox.getSelectedIndex(), armorBox.getSelectedIndex());
				frame.setSize(700, 400);
				frame.setVisible(true);
				frame.setTitle("RPG Character Creator");
			}
		});
		btnCreate.setBounds(75, 200, 300, 29);
		contentPane.add(btnCreate);
	}
}


