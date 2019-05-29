import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameControl extends MouseAdapter {
	private final JLabel exitWindow, minimizeWindow, controlMusic, changeTheme;
	private final JFrame frame;

	public FrameControl(JLabel exitWindow, JLabel minimizeWindow, JLabel controlMusic, JLabel changeTheme,
			JFrame frame) {
		this.exitWindow = exitWindow;
		this.minimizeWindow = minimizeWindow;
		this.controlMusic = controlMusic;
		this.changeTheme = changeTheme;
		this.frame = frame;
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if (e.getSource() == exitWindow) {
			exitWindow.setIcon(new ImageIcon(Main.class.getResource("exitEnter.png")));
		} else if (e.getSource() == minimizeWindow) {
			minimizeWindow.setIcon(new ImageIcon(Main.class.getResource("minimizeEnter.png")));
		} else if (e.getSource() == controlMusic) {
			if (Main.soundControl == false)
				controlMusic.setIcon(new ImageIcon(Main.class.getResource("soundOffEnter.png")));
			else
				controlMusic.setIcon(new ImageIcon(Main.class.getResource("soundOnEnter.png")));
		} else if (e.getSource() == changeTheme) {
			changeTheme.setIcon(new ImageIcon(Main.class.getResource("changeThemeEnter.png")));
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if (e.getSource() == exitWindow) {
			exitWindow.setIcon(new ImageIcon(Main.class.getResource("exitWindow.png")));
		} else if (e.getSource() == minimizeWindow) {
			minimizeWindow.setIcon(new ImageIcon(Main.class.getResource("minimizeWindow.png")));
		} else if (e.getSource() == controlMusic) {
			if (Main.soundControl == false)
				controlMusic.setIcon(new ImageIcon(Main.class.getResource("soundOFF.png")));
			else
				controlMusic.setIcon(new ImageIcon(Main.class.getResource("soundON.png")));
		} else if (e.getSource() == changeTheme) {
			changeTheme.setIcon(new ImageIcon(Main.class.getResource("changeTheme.png")));
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if (e.getSource() == exitWindow) {
			exitWindow.setIcon(new ImageIcon(Main.class.getResource("exitPress.png")));
		} else if (e.getSource() == minimizeWindow) {
			minimizeWindow.setIcon(new ImageIcon(Main.class.getResource("minimizePress.png")));
		} else if (e.getSource() == controlMusic) {
			if (Main.soundControl == false)
				controlMusic.setIcon(new ImageIcon(Main.class.getResource("soundOffPress.png")));
			else
				controlMusic.setIcon(new ImageIcon(Main.class.getResource("soundOnPress.png")));
		} else if (e.getSource() == changeTheme) {
			changeTheme.setIcon(new ImageIcon(Main.class.getResource("changeThemePress.png")));
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if (e.getSource() == exitWindow) {
			exitWindow.setIcon(new ImageIcon(Main.class.getResource("exitWindow.png")));
		} else if (e.getSource() == minimizeWindow) {
			minimizeWindow.setIcon(new ImageIcon(Main.class.getResource("minimizeWindow.png")));
		} else if (e.getSource() == controlMusic) {
			if (Main.soundControl == false)
				controlMusic.setIcon(new ImageIcon(Main.class.getResource("soundOffPress.png")));
			else
				controlMusic.setIcon(new ImageIcon(Main.class.getResource("soundOnPress.png")));
		} else if (e.getSource() == changeTheme) {
			changeTheme.setIcon(new ImageIcon(Main.class.getResource("changeTheme.png")));
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == exitWindow) {
			new ExitConfirmationDialog(frame);
		} else if (e.getSource() == minimizeWindow) {
			frame.setState(JFrame.ICONIFIED);
		} else if (e.getSource() == controlMusic) {
			if (Main.soundControl == false) {
				Main.clip.stop();
				controlMusic.setIcon(new ImageIcon(Main.class.getResource("soundON.png")));
				controlMusic.setToolTipText("Turn on music");
				Main.soundControl = true;
			} else if (Main.soundControl == true) {
				Main.clip.loop(Clip.LOOP_CONTINUOUSLY);
				controlMusic.setIcon(new ImageIcon(Main.class.getResource("soundOFF.png")));
				Main.soundControl = false;
			}
		} else if (e.getSource() == changeTheme) {
			if (Main.themeToggle == 0) {
				Main.frameImage.setIcon(new ImageIcon(Main.class.getResource("frameImage.png")));
				Main.themeToggle = 1;
			} else if (Main.themeToggle == 1) {
				Main.frameImage.setIcon(new ImageIcon(Main.class.getResource("frameImage2.png")));
				Main.themeToggle = 2;
			} else if (Main.themeToggle == 2) {
				Main.frameImage.setIcon(new ImageIcon(Main.class.getResource("frameImage1.png")));
				Main.themeToggle = 0;
			}
		}
	}
}