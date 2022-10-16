import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class MainMenu extends JFrame {

	private static final int DEFAULT_VERTICAL_PADDING = 20;

	private static final Color bgColor = new Color(255, 53, 151);
	
		private JTextField MenuOptions;
	
	public MainMenu() {
		super("Trip Trip Hooray - Main Menu");
	
		// Configure the JFrame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBackground(bgColor);
		
		// Create the image header for the MainMenu
		JPanel headerPanel = new JPanel();
		headerPanel.setLayout(new FlowLayout());
		headerPanel.setBackground(Color.BLACK);
		
		JLabel nexusIcon = new JLabel("");
		headerPanel.add(nexusIcon);
		
		add(headerPanel, BorderLayout.NORTH);
		
		JPanel stretchPanel = new JPanel();
		stretchPanel.setLayout(new BorderLayout());
		
		// Create the panel containing the controls
		JPanel buttonsPanel = new JPanel();
		GridLayout buttonsLayout = new GridLayout(0,1);
		buttonsLayout.setVgap(5);
		buttonsPanel.setLayout(buttonsLayout);
		buttonsPanel.setBackground(Color.BLACK);
		stretchPanel.add(buttonsPanel, BorderLayout.NORTH);
		
		// Create the text field which contains the nexus' name
		MenuOptions = new JTextField("Trip Trip Hooray!");
		MenuOptions.setBackground(Color.DARK_GRAY);
		MenuOptions.setForeground(Color.WHITE);
		MenuOptions.setBorder(null);
		MenuOptions.setHorizontalAlignment(JTextField.CENTER);
		buttonsPanel.add(MenuOptions);
		
		// Create the play game label
		JLabel play = new JLabel("Welcome!");
		play.setFont(new Font(Font.MONOSPACED, Font.BOLD, 18));
		play.setHorizontalAlignment(JLabel.CENTER);
		play.setForeground(Color.WHITE);
		buttonsPanel.add(play);
		
		// Create the play game button
		JButton playE = new JButton("Currency Conversion");
		playE.addActionListener(new InputListener(1));
		playE.setBackground(Color.GREEN);
		buttonsPanel.add(playE);
		
		JButton playM = new JButton("Covid Policies");
		playM.addActionListener(new InputListener(2));
		playM.setBackground(Color.CYAN);
		buttonsPanel.add(playM);
		
		JButton playH = new JButton("Transport");
		playH.addActionListener(new InputListener(3));
		playH.setBackground(Color.ORANGE);
		buttonsPanel.add(playH);
		
		JButton playI = new JButton("Accomodations");
		playI.addActionListener(new InputListener(4));
		playI.setBackground(Color.RED);
		buttonsPanel.add(playI);
		
		JButton playF = new JButton("Culture!");
		playF.addActionListener(new InputListener(5));
		playF.setBackground(Color.MAGENTA);
		buttonsPanel.add(playF);
		
		// Create the padding below the play game buttons
		JPanel basePadding = new JPanel();
		basePadding.setBackground(Color.BLACK);
		basePadding.setPreferredSize(new Dimension(DEFAULT_VERTICAL_PADDING, DEFAULT_VERTICAL_PADDING));
		stretchPanel.add(basePadding, BorderLayout.CENTER);
		
		add(stretchPanel, BorderLayout.CENTER);
		
		// Create the quit button
		JButton quit = new JButton("Exit");
		quit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Quit the program
				System.exit(0);
			}
		});
		quit.setBackground(Color.LIGHT_GRAY);
		add(quit, BorderLayout.SOUTH);
		
		pack();
		setLocationRelativeTo(null); // Center in screen
	}
	
	private class InputListener implements ActionListener {
		
		private double inputNumber;
		public InputListener(double inputNumber) {
			this.inputNumber = inputNumber;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			setVisible(false);
			// Create the game's window and display it
			new MenuVisual(MainMenu.this, MenuOptions.getText(), inputNumber)
					.setVisible(true);
		}
		
	}
}