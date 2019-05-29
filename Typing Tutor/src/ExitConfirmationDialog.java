import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ExitConfirmationDialog extends JFrame {
	public static JFrame mainFrame;

	public ExitConfirmationDialog(JFrame mainFrame) {
		ExitConfirmationDialog.mainFrame = mainFrame;
		mainFrame.setEnabled(false);
		setUndecorated(true);
		setSize(400, 200);
		setLocationRelativeTo(mainFrame);
		setBackground(new Color(0, 0, 0, 0));
		getContentPane().setLayout(null);

		JLabel background = new JLabel(
				new ImageIcon(ExitConfirmationDialog.class.getResource("Exit_Confirmation.png")));
		background.setBounds(0, 0, 400, 200);
		getContentPane().add(background);

		JLabel exit = new JLabel(new ImageIcon(ExitConfirmationDialog.class.getResource("exitDialog.png")));
		exit.setBounds(344, 4, 38, 38);
		getContentPane().add(exit);

		JLabel minimize = new JLabel(new ImageIcon(ExitConfirmationDialog.class.getResource("minimizeDialog.png")));
		minimize.setBounds(293, 4, 38, 38);
		getContentPane().add(minimize);

		JLabel Yes = new JLabel(new ImageIcon(ExitConfirmationDialog.class.getResource("Yes.png")));
		Yes.setBounds(121, 103, 75, 66);
		getContentPane().add(Yes);

		JLabel No = new JLabel(new ImageIcon(ExitConfirmationDialog.class.getResource("No.png")));
		No.setBounds(267, 103, 75, 66);
		getContentPane().add(No);

		JLabel dragLabel = new JLabel("");
		dragLabel.setBounds(0, 0, 289, 45);
		getContentPane().add(dragLabel);
		FrameDrag frameDrag = new FrameDrag(this);
		dragLabel.addMouseListener(frameDrag);
		dragLabel.addMouseMotionListener(frameDrag);

		DialogControl dialogControl = new DialogControl(exit, minimize, Yes, No, this);
		exit.addMouseListener(dialogControl);
		minimize.addMouseListener(dialogControl);
		Yes.addMouseListener(dialogControl);
		No.addMouseListener(dialogControl);

		setVisible(true);
	}
}