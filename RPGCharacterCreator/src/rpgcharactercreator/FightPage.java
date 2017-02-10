package rpgcharactercreator;

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
public class FightPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//FightPage frame = new FightPage();
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param player 
	 */
	public FightPage(Player player) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//player
		JLabel classPicture = new JLabel(new ImageIcon(CharacterPage.class.getResource(player.getImage())));
		classPicture.setBounds(107, 10, 184, 178);
		classPicture.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(classPicture);

		JLabel lblStats = new JLabel();
		lblStats.setText(player.toString());
		lblStats.setBounds(10, 52, 257, 69);
		contentPane.add(lblStats);

		JLabel namelbl = new JLabel(player.getName());
		namelbl.setBounds(10, 10, 80, 30);
		contentPane.add(namelbl);
		//enemy
		Enemy foe = new Enemy((int)(Math.random()*4)+1,(int)(Math.random()*4)+1,(int)(Math.random()*4)+1,Enemy.getRandImage());

		JLabel enemyClassPicture = new JLabel(new ImageIcon(CharacterPage.class.getResource(foe.getImage())));
		enemyClassPicture.setBounds(231, 198, 201, 180);
		enemyClassPicture.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(enemyClassPicture);

		JLabel EnemylblStats = new JLabel();
		EnemylblStats.setText(foe.toString());
		EnemylblStats.setBounds(444, 249, 105, 98);
		contentPane.add(EnemylblStats);

		JLabel Enemynamelbl = new JLabel("Evil-der");
		Enemynamelbl.setBounds(444, 194, 50, 46);
		contentPane.add(Enemynamelbl);
		
		JButton btnNewButton = new JButton("Fight!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(player.getAttackSpeed()>foe.getAttackSpeed()){
					player.attack(foe);
					foe.attack(player);
				}
				else{
					foe.attack(player);
					player.attack(foe);
				}
				lblStats.setText(player.toString());
				EnemylblStats.setText(foe.toString());
			}
		});
		btnNewButton.setBounds(293, 136, 117, 29);
		contentPane.add(btnNewButton);

	}

}
