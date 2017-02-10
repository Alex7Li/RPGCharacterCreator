package Useless;

import java.awt.BorderLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import rpgcharactercreator.CharacterClass;

@SuppressWarnings("serial")
public class SelectClass extends JPanel{
	private JLabel myPictureLbl;
	private JTextField description;
	private Panel panel;
	private JButton btnNewButton;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private static final int classes = 4;
	private CharacterClass characterClass;
	/**
	 * Create the panel.
	 */
	public SelectClass() {
		
		description = new JTextField();
		this.add(description, BorderLayout.SOUTH);
		description.setColumns(10);

		panel = new Panel();
		this.add(panel, BorderLayout.NORTH);

		for (int i = 0; i < classes; i++) {
			final String name;

			switch (i) {
			case 0:
				name = "Warrior";
				break;
			case 1:
				name = "Archer";
				break;
			case 2:
				name = "Mage";
				break;
			case 3:
				name = "Assassin";
				break;
			default:
				name = "N/A";
			}
			btnNewButton = new JButton(name);
			buttonGroup.add(btnNewButton);
			panel.add(btnNewButton);
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					characterClass = new CharacterClass(name);
					myPictureLbl.setIcon(characterClass.getPicture());
					description.setText(characterClass.getDescription());
				}
			});
		}
		
	}

}
