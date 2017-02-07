package rpgcharactercreator;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class SelectParametersGUI extends JFrame {
	private JPanel mainPanel;
	private JPanel centerPanel;
	private int index = 0;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectParametersGUI frame = new SelectParametersGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */

	public SelectParametersGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		mainPanel = new JPanel();
		mainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainPanel);
		mainPanel.setLayout(new BorderLayout(0, 0));
		JButton button = new JButton("<<<");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index = (index +2) % 3;
				switchPane();
			}
		});
		mainPanel.add(button, BorderLayout.WEST);

		JButton button_1 = new JButton(">>>");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index = (index + 1) % 3;
				switchPane();
			}
		});
		mainPanel.add(button_1, BorderLayout.EAST);
		switchPane();
	}

	private void switchPane() {
		switch (index) {
		case 0:
			centerPanel = new SelectClass();
			break;
		default:
			System.out.println("Error:panel index not found (SelectParametersGUI)");
		}
		// setContentPane(centerPanel);
		mainPanel.add(centerPanel, BorderLayout.CENTER);
	}
}
