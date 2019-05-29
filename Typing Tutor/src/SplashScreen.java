import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SplashScreen extends JFrame {

	public SplashScreen() {
		setUndecorated(true);
		setBackground(new Color(255, 255, 255, 0));
		setBounds(432, 177, 405, 405);

		JLabel splashLabel = new JLabel(new ImageIcon(SplashScreen.class.getResource("Splash.png")));
		splashLabel.setSize(405, 405);
		add(splashLabel);
		setVisible(true);
	}
}