import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DialogControl extends MouseAdapter {
	private final JLabel exit, minimize, Yes, No;
	private final JFrame frame;

	public DialogControl(JLabel exit, JLabel minimize, JLabel Yes, JLabel No, JFrame frame) {
		this.exit = exit;
		this.minimize = minimize;
		this.Yes = Yes;
		this.No = No;
		this.frame = frame;
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if (e.getSource() == exit) {
			exit.setIcon(new ImageIcon(Main.class.getResource("exitDialogEntered.png")));
		} else if (e.getSource() == minimize) {
			minimize.setIcon(new ImageIcon(Main.class.getResource("minimizeDialogEntered.png")));
		} else if (e.getSource() == Yes) {
			Yes.setIcon(new ImageIcon(Main.class.getResource("YesEntered.png")));
		} else
			No.setIcon(new ImageIcon(Main.class.getResource("NoEntered.png")));
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if (e.getSource() == exit) {
			exit.setIcon(new ImageIcon(Main.class.getResource("exitDialog.png")));
		} else if (e.getSource() == minimize) {
			minimize.setIcon(new ImageIcon(Main.class.getResource("minimizeDialog.png")));
		} else if (e.getSource() == Yes) {
			Yes.setIcon(new ImageIcon(Main.class.getResource("Yes.png")));
		} else
			No.setIcon(new ImageIcon(Main.class.getResource("No.png")));
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if (e.getSource() == exit) {
			exit.setIcon(new ImageIcon(Main.class.getResource("exitDialogPress.png")));
		} else if (e.getSource() == minimize) {
			minimize.setIcon(new ImageIcon(Main.class.getResource("minimizeDialogPress.png")));
		} else if (e.getSource() == Yes) {
			Yes.setIcon(new ImageIcon(Main.class.getResource("YesPress.png")));
		} else
			No.setIcon(new ImageIcon(Main.class.getResource("NoPress.png")));
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if (e.getSource() == exit) {
			exit.setIcon(new ImageIcon(Main.class.getResource("exitDialog.png")));
		} else if (e.getSource() == minimize) {
			minimize.setIcon(new ImageIcon(Main.class.getResource("minimizeDialog.png")));
		} else if (e.getSource() == Yes) {
			Yes.setIcon(new ImageIcon(Main.class.getResource("Yes.png")));
		} else
			No.setIcon(new ImageIcon(Main.class.getResource("No.png")));
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == exit || e.getSource() == No) {
			frame.setVisible(false);
			ExitConfirmationDialog.mainFrame.setVisible(true);
			ExitConfirmationDialog.mainFrame.setEnabled(true);
		} else if (e.getSource() == minimize) {
			frame.setState(JFrame.ICONIFIED);
		} else if (e.getSource() == Yes) {
			System.exit(0);
		}
	}
}