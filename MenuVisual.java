import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Got some INSIGHT ON HOW a GUI functions from  Michael Layzell and Emad Fawzi!
 */
public class MenuVisual extends JFrame {


	private static final int SCORE_HORIZ_SPACING = 10;


	private MainMenu mainMenu;


	private JLabel lifeDisplay;
	private double spaw;


	public MenuVisual(MainMenu mainMenu, String nexusName, double spawnRate) {
		super("Trip Trip Hooray Menu");
		// Make this frame dispose upon closing
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.spaw=spawnRate;
		this.mainMenu = mainMenu;
		JPanel headerPanel = new JPanel();
		headerPanel.setLayout(new BorderLayout());
		headerPanel.setBackground(Color.DARK_GRAY);
		updateDisplay();
		JButton quitButton = new JButton("Main Menu");
		quitButton.setBackground(Color.RED);
		quitButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int selection = JOptionPane.showConfirmDialog(null, 
						"Back to Main Menu?", 
						"Exit Confirmation", 
						JOptionPane.YES_NO_OPTION);

				if (selection == JOptionPane.YES_OPTION) {
					MenuVisual.this.setVisible(false);
					MenuVisual.this.dispose();
				} 
			}
		});
		headerPanel.add(quitButton, BorderLayout.SOUTH);
		JPanel scorePanel = new JPanel();
		scorePanel.setBackground(Color.DARK_GRAY);
		GridLayout scorePanelLayout = new GridLayout(20,20);
		scorePanelLayout.setHgap(SCORE_HORIZ_SPACING);
		scorePanel.setLayout(scorePanelLayout);
		headerPanel.add(scorePanel, BorderLayout.CENTER);
		add(headerPanel, BorderLayout.NORTH);
		pack();
		setLocationRelativeTo(null); // Center in screen
	}
	private void updateDisplay() {
		if (spaw==1) {
			//will be further implemented in the future
			String b = CurrencyConversion.curcov();
			JOptionPane.showMessageDialog(null, 
					b,
					"Link to Your Conversion!", JOptionPane.INFORMATION_MESSAGE);
		}
		else if (spaw==2) {
			//will be further implemented in the future

			JOptionPane.showMessageDialog(null, 
					"Additional Covid Policies Can Be Found at: https://www.who.int/emergencies/diseases/novel-coronavirus-2019/covid-19-policy-briefs",
					"", JOptionPane.INFORMATION_MESSAGE);
		}
		else if (spaw==3) {
			//will be further implemented in the future

			JOptionPane.showMessageDialog(null, 
					"If you don't have a car, you have these wonderful options!\n"+" Public Transport:\nFor public transportation, UMD uses an app called Transit.\n"+" Download Here: https://transitapp.com/ \n"+" For private transport, download Uber: \\n"+" On Google PlayStore: https://play.google.com/store/apps/details?id=com.ubercab&hl=en_US&gl=US \n"+" On App Store: https://apps.apple.com/us/app/uber-request-a-ride/id368677368 \n"+" or Lyft: \n "+"On Google PlayStore: https://play.google.com/store/apps/details?id=me.lyft.android&hl=en_US&gl=US \n"+" On App Store: https://apps.apple.com/us/app/lyft/id529379082\\n",
					"", JOptionPane.INFORMATION_MESSAGE);
		}
		else if (spaw == 4) {
			//will be further implemented in the future

			JOptionPane.showMessageDialog(null, 
					"Determined by your location, here are some accomodations.",
					"", JOptionPane.INFORMATION_MESSAGE);
		}
		else if(spaw == 5) {
			//will be further implemented in the future
			JOptionPane.showMessageDialog(null, 
					"Here's some tips to get with the culture!",
					"", JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			lifeDisplay.setForeground(Color.GREEN);
		}
	}
	/**
	 * Destroys the window and returns the user to the main menu
	 */
	@Override
	public void dispose() {
		super.dispose();		
		mainMenu.setVisible(true);
	}


}