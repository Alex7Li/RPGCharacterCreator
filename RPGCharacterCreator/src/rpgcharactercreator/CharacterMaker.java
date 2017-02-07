package rpgcharactercreator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;


@SuppressWarnings("serial")
public class CharacterMaker extends JFrame {

	private JPanel contentPane;
	private JTextField txtEnterYourName;
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(125, 150, 125, 150));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		txtEnterYourName = new JTextField();
		txtEnterYourName.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterYourName.setText("Enter Your Name:");
		contentPane.add(txtEnterYourName, BorderLayout.CENTER);
		txtEnterYourName.setColumns(10);
	}

}
