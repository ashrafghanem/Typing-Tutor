import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.BevelBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Main {

	private static JFrame frame;
	public static JButton button, button_1, button_2, button_3, button_4, button_5, button_6, button_7, button_8,
			button_9, button_10, button_11, button_12, button_13, button_14, button_15, button_16, button_17, button_18,
			button_19, button_20, button_21, button_22, button_23, button_24, button_25;
	public static JButton btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM, btnN, btnO,
			btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ;
	public static JButton btnBackspace, btnTab, btnCapslk, btnShift, btnEnter, btnAlt_1, btnAlt, btnCtrl, btnCtrl_1,
			btnWin, btnFn;
	public static JTextArea textArea;
	public static boolean shiftPressed = false;
	public static boolean capsLockPressed = false;
	public static Color originButtonBG;
	public static JTextField textField;
	public static JLabel congrats;
	public static JSpinner spinner;
	public static ArrayList<String> Panagrams;
	public static JLabel score;
	private static JLabel picShowLabel;
	public static boolean soundControl = false;
	public static int themeToggle = 0;
	public static JLabel frameImage;
	private static JLabel dragLabel;
	private static JLabel exitWindow;
	private static JLabel minimizeWindow;
	private static JLabel controlMusic;
	private static JLabel changeTheme;
	public static Clip clip;
	private static JPopupMenu popupMenu;

	public static void main(String[] args) throws LineUnavailableException, URISyntaxException, InterruptedException {

		// Changing the look and feel for the application.
		try {
			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (Exception e) {
			// If Nimbus is not available, you can set the GUI to another look
			// and feel.
		}

		frame = new JFrame("Typing Tutor");
		frame.setResizable(false);
		frame.setSize(900, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		frame.setUndecorated(true);
		frame.setBackground(new Color(0, 0, 0, 0)); // The last zero is to
													// make the frame
													// transparent.
		// To change the border of the frame.
		// frame.getRootPane().setBorder(new LineBorder((Color.BLACK), 2));

		SplashScreen splashScreen = new SplashScreen();
		Thread.sleep(2000);
		splashScreen.setVisible(false);

		clip = AudioSystem.getClip();
		try {
			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("backgroundMusic.wav"));
			clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.loop(Clip.LOOP_CONTINUOUSLY);
		} catch (UnsupportedAudioFileException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		button_1 = new JButton("1");
		button_1.setForeground(Color.BLACK);
		button_1.setBackground(SystemColor.inactiveCaption);
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_1.setBounds(94, 441, 50, 40);
		button_1.setFocusable(false);
		frame.getContentPane().add(button_1);

		button = new JButton("`");
		button.setForeground(Color.BLACK);
		button.setBackground(SystemColor.inactiveCaption);
		button.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button.setBounds(42, 441, 50, 40);
		button.setFocusable(false);
		frame.getContentPane().add(button);

		button_2 = new JButton("2");
		button_2.setForeground(Color.BLACK);
		button_2.setBackground(SystemColor.inactiveCaption);
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_2.setBounds(146, 441, 50, 40);
		button_2.setFocusable(false);
		frame.getContentPane().add(button_2);

		button_3 = new JButton("3");
		button_3.setForeground(Color.BLACK);
		button_3.setBackground(SystemColor.inactiveCaption);
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_3.setBounds(198, 441, 50, 40);
		button_3.setFocusable(false);
		frame.getContentPane().add(button_3);

		button_4 = new JButton("4");
		button_4.setForeground(Color.BLACK);
		button_4.setBackground(SystemColor.inactiveCaption);
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_4.setBounds(250, 441, 50, 40);
		button_4.setFocusable(false);
		frame.getContentPane().add(button_4);

		button_5 = new JButton("5");
		button_5.setForeground(Color.BLACK);
		button_5.setBackground(SystemColor.inactiveCaption);
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_5.setBounds(302, 441, 50, 40);
		button_5.setFocusable(false);
		frame.getContentPane().add(button_5);

		button_6 = new JButton("6");
		button_6.setForeground(Color.BLACK);
		button_6.setBackground(SystemColor.inactiveCaption);
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_6.setBounds(354, 441, 50, 40);
		button_6.setFocusable(false);
		frame.getContentPane().add(button_6);

		button_7 = new JButton("7");
		button_7.setForeground(Color.BLACK);
		button_7.setBackground(SystemColor.inactiveCaption);
		button_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_7.setBounds(406, 441, 50, 40);
		button_7.setFocusable(false);
		frame.getContentPane().add(button_7);

		button_8 = new JButton("8");
		button_8.setForeground(Color.BLACK);
		button_8.setBackground(SystemColor.inactiveCaption);
		button_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_8.setBounds(458, 441, 50, 40);
		button_8.setFocusable(false);
		frame.getContentPane().add(button_8);

		btnBackspace = new JButton("Backspace");
		btnBackspace.setForeground(Color.BLACK);
		btnBackspace.setBackground(SystemColor.inactiveCaption);
		btnBackspace.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnBackspace.setBounds(718, 441, 133, 40);
		btnBackspace.setFocusable(false);
		frame.getContentPane().add(btnBackspace);

		button_12 = new JButton("=");
		button_12.setForeground(Color.BLACK);
		button_12.setBackground(SystemColor.inactiveCaption);
		button_12.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_12.setBounds(666, 441, 50, 40);
		button_12.setFocusable(false);
		frame.getContentPane().add(button_12);

		button_11 = new JButton("-");
		button_11.setForeground(Color.BLACK);
		button_11.setBackground(SystemColor.inactiveCaption);
		button_11.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_11.setBounds(614, 441, 50, 40);
		button_11.setFocusable(false);
		frame.getContentPane().add(button_11);

		button_9 = new JButton("9");
		button_9.setForeground(Color.BLACK);
		button_9.setBackground(SystemColor.inactiveCaption);
		button_9.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_9.setBounds(510, 441, 50, 40);
		button_9.setFocusable(false);
		frame.getContentPane().add(button_9);

		button_10 = new JButton("0");
		button_10.setForeground(Color.BLACK);
		button_10.setBackground(SystemColor.inactiveCaption);
		button_10.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_10.setBounds(562, 441, 50, 40);
		button_10.setFocusable(false);
		frame.getContentPane().add(button_10);

		button_13 = new JButton("\\");
		button_13.setForeground(Color.BLACK);
		button_13.setBackground(SystemColor.inactiveCaption);
		button_13.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_13.setBounds(758, 483, 93, 40);
		button_13.setFocusable(false);
		frame.getContentPane().add(button_13);

		button_14 = new JButton("]");
		button_14.setForeground(Color.BLACK);
		button_14.setBackground(SystemColor.inactiveCaption);
		button_14.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_14.setBounds(706, 483, 50, 40);
		button_14.setFocusable(false);
		frame.getContentPane().add(button_14);

		button_15 = new JButton("[");
		button_15.setForeground(Color.BLACK);
		button_15.setBackground(SystemColor.inactiveCaption);
		button_15.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_15.setBounds(654, 483, 50, 40);
		button_15.setFocusable(false);
		frame.getContentPane().add(button_15);

		btnP = new JButton("p");
		btnP.setForeground(Color.BLACK);
		btnP.setBackground(SystemColor.inactiveCaption);
		btnP.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnP.setBounds(602, 483, 50, 40);
		btnP.setFocusable(false);
		frame.getContentPane().add(btnP);

		btnO = new JButton("o");
		btnO.setForeground(Color.BLACK);
		btnO.setBackground(SystemColor.inactiveCaption);
		btnO.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnO.setBounds(550, 483, 50, 40);
		btnO.setFocusable(false);
		frame.getContentPane().add(btnO);

		btnI = new JButton("i");
		btnI.setForeground(Color.BLACK);
		btnI.setBackground(SystemColor.inactiveCaption);
		btnI.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnI.setBounds(498, 483, 50, 40);
		btnI.setFocusable(false);
		frame.getContentPane().add(btnI);

		btnU = new JButton("u");
		btnU.setForeground(Color.BLACK);
		btnU.setBackground(SystemColor.inactiveCaption);
		btnU.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnU.setBounds(446, 483, 50, 40);
		btnU.setFocusable(false);
		frame.getContentPane().add(btnU);

		btnY = new JButton("y");
		btnY.setForeground(Color.BLACK);
		btnY.setBackground(SystemColor.inactiveCaption);
		btnY.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnY.setBounds(394, 483, 50, 40);
		btnY.setFocusable(false);
		frame.getContentPane().add(btnY);

		btnT = new JButton("t");
		btnT.setForeground(Color.BLACK);
		btnT.setBackground(SystemColor.inactiveCaption);
		btnT.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnT.setBounds(342, 483, 50, 40);
		btnT.setFocusable(false);
		frame.getContentPane().add(btnT);

		btnR = new JButton("r");
		btnR.setForeground(Color.BLACK);
		btnR.setBackground(SystemColor.inactiveCaption);
		btnR.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnR.setBounds(290, 483, 50, 40);
		btnR.setFocusable(false);
		frame.getContentPane().add(btnR);

		btnE = new JButton("e");
		btnE.setForeground(Color.BLACK);
		btnE.setBackground(SystemColor.inactiveCaption);
		btnE.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnE.setBounds(238, 483, 50, 40);
		btnE.setFocusable(false);
		frame.getContentPane().add(btnE);

		btnW = new JButton("w");
		btnW.setForeground(Color.BLACK);
		btnW.setBackground(SystemColor.inactiveCaption);
		btnW.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnW.setBounds(186, 483, 50, 40);
		btnW.setFocusable(false);
		frame.getContentPane().add(btnW);

		btnQ = new JButton("q");
		btnQ.setForeground(Color.BLACK);
		btnQ.setBackground(SystemColor.inactiveCaption);
		btnQ.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnQ.setBounds(134, 483, 50, 40);
		btnQ.setFocusable(false);
		frame.getContentPane().add(btnQ);

		btnTab = new JButton("Tab");
		btnTab.setHorizontalAlignment(SwingConstants.LEFT);
		btnTab.setForeground(Color.BLACK);
		btnTab.setBackground(SystemColor.inactiveCaption);
		btnTab.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnTab.setBounds(42, 483, 90, 40);
		btnTab.setFocusable(false);
		frame.getContentPane().add(btnTab);

		btnCapslk = new JButton("CapsLk");
		btnCapslk.setHorizontalAlignment(SwingConstants.LEFT);
		btnCapslk.setForeground(Color.BLACK);
		btnCapslk.setBackground(SystemColor.inactiveCaption);
		originButtonBG = btnCapslk.getBackground();
		btnCapslk.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCapslk.setBounds(42, 525, 100, 40);
		btnCapslk.setFocusable(false);
		frame.getContentPane().add(btnCapslk);

		btnShift = new JButton("Shift");
		btnShift.setHorizontalAlignment(SwingConstants.LEFT);
		btnShift.setForeground(Color.BLACK);
		btnShift.setBackground(SystemColor.inactiveCaption);
		btnShift.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnShift.setBounds(42, 567, 152, 40);
		btnShift.setFocusable(false);
		frame.getContentPane().add(btnShift);

		btnA = new JButton("a");
		btnA.setForeground(Color.BLACK);
		btnA.setBackground(SystemColor.inactiveCaption);
		btnA.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnA.setBounds(144, 525, 50, 40);
		btnA.setFocusable(false);
		frame.getContentPane().add(btnA);

		btnZ = new JButton("z");
		btnZ.setForeground(Color.BLACK);
		btnZ.setBackground(SystemColor.inactiveCaption);
		btnZ.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnZ.setBounds(196, 567, 50, 40);
		btnZ.setFocusable(false);
		frame.getContentPane().add(btnZ);

		btnS = new JButton("s");
		btnS.setForeground(Color.BLACK);
		btnS.setBackground(SystemColor.inactiveCaption);
		btnS.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnS.setBounds(196, 525, 50, 40);
		btnS.setFocusable(false);
		frame.getContentPane().add(btnS);

		btnD = new JButton("d");
		btnD.setForeground(Color.BLACK);
		btnD.setBackground(SystemColor.inactiveCaption);
		btnD.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnD.setBounds(248, 525, 50, 40);
		btnD.setFocusable(false);
		frame.getContentPane().add(btnD);

		btnX = new JButton("x");
		btnX.setForeground(Color.BLACK);
		btnX.setBackground(SystemColor.inactiveCaption);
		btnX.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnX.setBounds(248, 567, 50, 40);
		btnX.setFocusable(false);
		frame.getContentPane().add(btnX);

		btnC = new JButton("c");
		btnC.setForeground(Color.BLACK);
		btnC.setBackground(SystemColor.inactiveCaption);
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnC.setBounds(300, 567, 50, 40);
		btnC.setFocusable(false);
		frame.getContentPane().add(btnC);

		btnF = new JButton("f");
		btnF.setForeground(Color.BLACK);
		btnF.setBackground(SystemColor.inactiveCaption);
		btnF.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnF.setBounds(300, 525, 50, 40);
		btnF.setFocusable(false);
		frame.getContentPane().add(btnF);

		btnG = new JButton("g");
		btnG.setForeground(Color.BLACK);
		btnG.setBackground(SystemColor.inactiveCaption);
		btnG.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnG.setBounds(352, 525, 50, 40);
		btnG.setFocusable(false);
		frame.getContentPane().add(btnG);

		btnV = new JButton("v");
		btnV.setForeground(Color.BLACK);
		btnV.setBackground(SystemColor.inactiveCaption);
		btnV.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnV.setBounds(352, 567, 50, 40);
		btnV.setFocusable(false);
		frame.getContentPane().add(btnV);

		btnB = new JButton("b");
		btnB.setForeground(Color.BLACK);
		btnB.setBackground(SystemColor.inactiveCaption);
		btnB.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnB.setBounds(404, 567, 50, 40);
		btnB.setFocusable(false);
		frame.getContentPane().add(btnB);

		btnH = new JButton("h");
		btnH.setForeground(Color.BLACK);
		btnH.setBackground(SystemColor.inactiveCaption);
		btnH.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnH.setBounds(404, 525, 50, 40);
		btnH.setFocusable(false);
		frame.getContentPane().add(btnH);

		btnJ = new JButton("j");
		btnJ.setForeground(Color.BLACK);
		btnJ.setBackground(SystemColor.inactiveCaption);
		btnJ.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnJ.setBounds(456, 525, 50, 40);
		btnJ.setFocusable(false);
		frame.getContentPane().add(btnJ);

		btnN = new JButton("n");
		btnN.setForeground(Color.BLACK);
		btnN.setBackground(SystemColor.inactiveCaption);
		btnN.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnN.setBounds(456, 567, 50, 40);
		btnN.setFocusable(false);
		frame.getContentPane().add(btnN);

		btnM = new JButton("m");
		btnM.setForeground(Color.BLACK);
		btnM.setBackground(SystemColor.inactiveCaption);
		btnM.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnM.setBounds(508, 567, 50, 40);
		btnM.setFocusable(false);
		frame.getContentPane().add(btnM);

		btnK = new JButton("k");
		btnK.setForeground(Color.BLACK);
		btnK.setBackground(SystemColor.inactiveCaption);
		btnK.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnK.setBounds(508, 525, 50, 40);
		btnK.setFocusable(false);
		frame.getContentPane().add(btnK);

		btnL = new JButton("l");
		btnL.setForeground(Color.BLACK);
		btnL.setBackground(SystemColor.inactiveCaption);
		btnL.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnL.setBounds(560, 525, 50, 40);
		btnL.setFocusable(false);
		frame.getContentPane().add(btnL);

		button_18 = new JButton(",");
		button_18.setForeground(Color.BLACK);
		button_18.setBackground(SystemColor.inactiveCaption);
		button_18.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_18.setBounds(560, 567, 50, 40);
		button_18.setFocusable(false);
		frame.getContentPane().add(button_18);

		button_19 = new JButton(".");
		button_19.setForeground(Color.BLACK);
		button_19.setBackground(SystemColor.inactiveCaption);
		button_19.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_19.setBounds(612, 567, 50, 40);
		button_19.setFocusable(false);
		frame.getContentPane().add(button_19);

		button_16 = new JButton(";");
		button_16.setForeground(Color.BLACK);
		button_16.setBackground(SystemColor.inactiveCaption);
		button_16.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_16.setBounds(612, 525, 50, 40);
		button_16.setFocusable(false);
		frame.getContentPane().add(button_16);

		button_17 = new JButton("'");
		button_17.setForeground(Color.BLACK);
		button_17.setBackground(SystemColor.inactiveCaption);
		button_17.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_17.setBounds(664, 525, 50, 40);
		button_17.setFocusable(false);
		frame.getContentPane().add(button_17);

		button_20 = new JButton("/");
		button_20.setForeground(Color.BLACK);
		button_20.setBackground(SystemColor.inactiveCaption);
		button_20.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_20.setBounds(664, 567, 50, 40);
		button_20.setFocusable(false);
		frame.getContentPane().add(button_20);

		button_21 = new JButton("\u2191");
		button_21.setForeground(Color.BLACK);
		button_21.setBackground(SystemColor.inactiveCaption);
		button_21.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_21.setBounds(749, 567, 50, 40);
		button_21.setFocusable(false);
		frame.getContentPane().add(button_21);

		btnEnter = new JButton("Enter");
		btnEnter.setForeground(Color.BLACK);
		btnEnter.setBackground(SystemColor.inactiveCaption);
		btnEnter.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnEnter.setBounds(716, 525, 135, 40);
		btnEnter.setFocusable(false);
		frame.getContentPane().add(btnEnter);

		btnAlt_1 = new JButton("Alt");
		btnAlt_1.setForeground(Color.BLACK);
		btnAlt_1.setBackground(SystemColor.inactiveCaption);
		btnAlt_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnAlt_1.setBounds(218, 609, 50, 40);
		btnAlt_1.setFocusable(false);
		frame.getContentPane().add(btnAlt_1);

		btnFn = new JButton("Fn");
		btnFn.setForeground(Color.BLACK);
		btnFn.setBackground(SystemColor.inactiveCaption);
		btnFn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnFn.setBounds(99, 609, 55, 40);
		btnFn.setFocusable(false);
		frame.getContentPane().add(btnFn);

		btnWin = new JButton("Win");
		btnWin.setForeground(Color.BLACK);
		btnWin.setBackground(SystemColor.inactiveCaption);
		btnWin.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnWin.setBounds(156, 609, 60, 40);
		btnWin.setFocusable(false);
		frame.getContentPane().add(btnWin);

		button_25 = new JButton("");
		button_25.setForeground(Color.BLACK);
		button_25.setBackground(SystemColor.inactiveCaption);
		button_25.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_25.setBounds(270, 609, 316, 40);
		button_25.setFocusable(false);
		frame.getContentPane().add(button_25);

		btnAlt = new JButton("Alt");
		btnAlt.setForeground(Color.BLACK);
		btnAlt.setBackground(SystemColor.inactiveCaption);
		btnAlt.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnAlt.setBounds(588, 609, 50, 40);
		btnAlt.setFocusable(false);
		frame.getContentPane().add(btnAlt);

		btnCtrl = new JButton("Ctrl");
		btnCtrl.setForeground(Color.BLACK);
		btnCtrl.setBackground(SystemColor.inactiveCaption);
		btnCtrl.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCtrl.setBounds(640, 609, 55, 40);
		btnCtrl.setFocusable(false);
		frame.getContentPane().add(btnCtrl);

		button_24 = new JButton("\u2190");
		button_24.setForeground(Color.BLACK);
		button_24.setBackground(SystemColor.inactiveCaption);
		button_24.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_24.setBounds(697, 609, 50, 40);
		button_24.setFocusable(false);
		frame.getContentPane().add(button_24);

		button_23 = new JButton("\u2193");
		button_23.setForeground(Color.BLACK);
		button_23.setBackground(SystemColor.inactiveCaption);
		button_23.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_23.setBounds(749, 609, 50, 40);
		button_23.setFocusable(false);
		frame.getContentPane().add(button_23);

		button_22 = new JButton("\u2192");
		button_22.setForeground(Color.BLACK);
		button_22.setBackground(SystemColor.inactiveCaption);
		button_22.setFont(new Font("Tahoma", Font.PLAIN, 13));
		button_22.setBounds(801, 609, 50, 40);
		button_22.setFocusable(false);
		frame.getContentPane().add(button_22);

		btnCtrl_1 = new JButton("Ctrl");
		btnCtrl_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnCtrl_1.setForeground(Color.BLACK);
		btnCtrl_1.setBackground(SystemColor.inactiveCaption);
		btnCtrl_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCtrl_1.setBounds(42, 609, 55, 40);
		btnCtrl_1.setFocusable(false);
		frame.getContentPane().add(btnCtrl_1);

		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setForeground(Color.BLACK);
		textArea.requestFocus();
		textArea.setFocusable(true);
		textArea.getCaret().setVisible(true);
		textArea.setFocusTraversalKeysEnabled(false);

		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setEnabled(false);
		textField.setDisabledTextColor(Color.BLACK);
		textField.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(250, 128, 114), new Color(250, 128, 114),
				new Color(250, 128, 114), new Color(250, 128, 114)));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setForeground(Color.BLACK);
		textField.setBounds(42, 248, 589, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		KeyHandler keyHandler = new KeyHandler();

		textArea.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				try {
					if (KeyEvent.getKeyText(e.getKeyCode()).equals("Back Quote")) {
						if (shiftPressed)
							keyHandler.doAction("~");
						else
							keyHandler.doAction("`");
					} else if (e.getKeyCode() == KeyEvent.VK_1) {
						if (shiftPressed)
							keyHandler.doAction("!");
						else
							keyHandler.doAction("1");
					} else if (e.getKeyCode() == KeyEvent.VK_2) {
						if (shiftPressed)
							keyHandler.doAction("@");
						else
							keyHandler.doAction("2");
					} else if (e.getKeyCode() == KeyEvent.VK_3) {
						if (shiftPressed)
							keyHandler.doAction("#");
						else
							keyHandler.doAction("3");
					} else if (e.getKeyCode() == KeyEvent.VK_4) {
						if (shiftPressed)
							keyHandler.doAction("$");
						else
							keyHandler.doAction("4");
					} else if (e.getKeyCode() == KeyEvent.VK_5) {
						if (shiftPressed)
							keyHandler.doAction("%");
						else
							keyHandler.doAction("5");
					} else if (e.getKeyCode() == KeyEvent.VK_6) {
						if (shiftPressed)
							keyHandler.doAction("^");
						else
							keyHandler.doAction("6");
					} else if (e.getKeyCode() == KeyEvent.VK_7) {
						if (shiftPressed)
							keyHandler.doAction("&");
						else
							keyHandler.doAction("7");
					} else if (e.getKeyCode() == KeyEvent.VK_8) {
						if (shiftPressed)
							keyHandler.doAction("*");
						else
							keyHandler.doAction("8");
					} else if (e.getKeyCode() == KeyEvent.VK_9) {
						if (shiftPressed)
							keyHandler.doAction("(");
						else
							keyHandler.doAction("9");
					} else if (e.getKeyCode() == KeyEvent.VK_0) {
						if (shiftPressed)
							keyHandler.doAction(")");
						else
							keyHandler.doAction("0");
					}

					else if (e.getKeyCode() == KeyEvent.VK_MINUS) {
						if (shiftPressed)
							keyHandler.doAction("_");
						else
							keyHandler.doAction("-");
					} else if (e.getKeyCode() == KeyEvent.VK_EQUALS) {
						if (shiftPressed)
							keyHandler.doAction("+");
						else
							keyHandler.doAction("=");
					} else if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
						keyHandler.doAction("BACK_SPACE");
					} else if (e.getKeyCode() == KeyEvent.VK_BACK_SLASH) {
						if (shiftPressed)
							keyHandler.doAction("|");
						else
							keyHandler.doAction("\\");
					} else if (e.getKeyCode() == KeyEvent.VK_CLOSE_BRACKET) {
						if (shiftPressed)
							keyHandler.doAction("}");
						else
							keyHandler.doAction("]");
					} else if (e.getKeyCode() == KeyEvent.VK_OPEN_BRACKET) {
						if (shiftPressed)
							keyHandler.doAction("{");
						else
							keyHandler.doAction("[");
					} else if (e.getKeyCode() == KeyEvent.VK_P) {
						if (shiftPressed) {
							if (!capsLockPressed)
								keyHandler.doAction("P");
							else
								keyHandler.doAction("p");
						} else
							keyHandler.doAction(btnP.getText());
					} else if (e.getKeyCode() == KeyEvent.VK_O) {
						if (shiftPressed) {
							if (!capsLockPressed)
								keyHandler.doAction("O");
							else
								keyHandler.doAction("o");
						} else
							keyHandler.doAction(btnO.getText());
					} else if (e.getKeyCode() == KeyEvent.VK_I) {
						if (shiftPressed) {
							if (!capsLockPressed)
								keyHandler.doAction("I");
							else
								keyHandler.doAction("i");
						} else
							keyHandler.doAction(btnI.getText());
					} else if (e.getKeyCode() == KeyEvent.VK_U) {
						if (shiftPressed) {
							if (!capsLockPressed)
								keyHandler.doAction("U");
							else
								keyHandler.doAction("u");
						} else
							keyHandler.doAction(btnU.getText());
					} else if (e.getKeyCode() == KeyEvent.VK_Y) {
						if (shiftPressed) {
							if (!capsLockPressed)
								keyHandler.doAction("Y");
							else
								keyHandler.doAction("y");
						} else
							keyHandler.doAction(btnY.getText());
					} else if (e.getKeyCode() == KeyEvent.VK_T) {
						if (shiftPressed) {
							if (!capsLockPressed)
								keyHandler.doAction("T");
							else
								keyHandler.doAction("t");
						} else
							keyHandler.doAction(btnT.getText());
					} else if (e.getKeyCode() == KeyEvent.VK_R) {
						if (shiftPressed) {
							if (!capsLockPressed)
								keyHandler.doAction("R");
							else
								keyHandler.doAction("r");
						} else
							keyHandler.doAction(btnR.getText());
					} else if (e.getKeyCode() == KeyEvent.VK_E) {
						if (shiftPressed) {
							if (!capsLockPressed)
								keyHandler.doAction("E");
							else
								keyHandler.doAction("e");
						} else
							keyHandler.doAction(btnE.getText());
					} else if (e.getKeyCode() == KeyEvent.VK_W) {
						if (shiftPressed) {
							if (!capsLockPressed)
								keyHandler.doAction("W");
							else
								keyHandler.doAction("w");
						} else
							keyHandler.doAction(btnW.getText());
					} else if (e.getKeyCode() == KeyEvent.VK_Q) {
						if (shiftPressed) {
							if (!capsLockPressed)
								keyHandler.doAction("Q");
							else
								keyHandler.doAction("q");
						} else
							keyHandler.doAction(btnQ.getText());
					} else if (e.getKeyCode() == KeyEvent.VK_TAB) {
						keyHandler.doAction("TAB");
					} else if (e.getKeyCode() == KeyEvent.VK_CAPS_LOCK) {
						if (capsLockPressed) {
							keyHandler.doAction("CAPS_LOCK");
						} else {
							keyHandler.doAction("CAPS_LOCK");
						}
					} else if (e.getKeyCode() == KeyEvent.VK_A) {
						if (shiftPressed) {
							if (!capsLockPressed)
								keyHandler.doAction("A");
							else
								keyHandler.doAction("a");
						} else
							keyHandler.doAction(btnA.getText());
					} else if (e.getKeyCode() == KeyEvent.VK_S) {
						if (shiftPressed) {
							if (!capsLockPressed)
								keyHandler.doAction("S");
							else
								keyHandler.doAction("s");
						} else
							keyHandler.doAction(btnS.getText());
					} else if (e.getKeyCode() == KeyEvent.VK_D) {
						if (shiftPressed) {
							if (!capsLockPressed)
								keyHandler.doAction("D");
							else
								keyHandler.doAction("d");
						} else
							keyHandler.doAction(btnD.getText());
					} else if (e.getKeyCode() == KeyEvent.VK_F) {
						if (shiftPressed) {
							if (!capsLockPressed)
								keyHandler.doAction("F");
							else
								keyHandler.doAction("f");
						} else
							keyHandler.doAction(btnF.getText());
					} else if (e.getKeyCode() == KeyEvent.VK_G) {
						if (shiftPressed) {
							if (!capsLockPressed)
								keyHandler.doAction("G");
							else
								keyHandler.doAction("g");
						} else
							keyHandler.doAction(btnG.getText());
					} else if (e.getKeyCode() == KeyEvent.VK_H) {
						if (shiftPressed) {
							if (!capsLockPressed)
								keyHandler.doAction("H");
							else
								keyHandler.doAction("h");
						} else
							keyHandler.doAction(btnH.getText());
					} else if (e.getKeyCode() == KeyEvent.VK_J) {
						if (shiftPressed) {
							if (!capsLockPressed)
								keyHandler.doAction("J");
							else
								keyHandler.doAction("j");
						} else
							keyHandler.doAction(btnJ.getText());
					} else if (e.getKeyCode() == KeyEvent.VK_K) {
						if (shiftPressed) {
							if (!capsLockPressed)
								keyHandler.doAction("K");
							else
								keyHandler.doAction("k");
						} else
							keyHandler.doAction(btnK.getText());
					} else if (e.getKeyCode() == KeyEvent.VK_L) {
						if (shiftPressed) {
							if (!capsLockPressed)
								keyHandler.doAction("L");
							else
								keyHandler.doAction("l");
						} else
							keyHandler.doAction(btnL.getText());
					} else if (e.getKeyCode() == KeyEvent.VK_SEMICOLON) {
						if (shiftPressed)
							keyHandler.doAction(":");
						else
							keyHandler.doAction(";");
					} else if (e.getKeyCode() == KeyEvent.VK_QUOTE) {
						if (shiftPressed)
							keyHandler.doAction("\"");
						else
							keyHandler.doAction("\'");
					} else if (e.getKeyCode() == KeyEvent.VK_ENTER) {
						keyHandler.doAction("ENTER");
					} else if (e.getKeyCode() == KeyEvent.VK_UP) {
						keyHandler.doAction("UP");
					} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
						keyHandler.doAction("DOWN");
					} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
						keyHandler.doAction("LEFT");
					} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
						keyHandler.doAction("RIGHT");
					} else if (e.getKeyCode() == KeyEvent.VK_SLASH) {
						if (shiftPressed)
							keyHandler.doAction("?");
						else
							keyHandler.doAction("/");
					} else if (e.getKeyCode() == KeyEvent.VK_PERIOD) {
						if (shiftPressed)
							keyHandler.doAction(">");
						else
							keyHandler.doAction(".");
					} else if (e.getKeyCode() == KeyEvent.VK_COMMA) {
						if (shiftPressed)
							keyHandler.doAction("<");
						else
							keyHandler.doAction(",");
					} else if (e.getKeyCode() == KeyEvent.VK_M) {
						if (shiftPressed) {
							if (!capsLockPressed)
								keyHandler.doAction("M");
							else
								keyHandler.doAction("m");
						} else
							keyHandler.doAction(btnM.getText());
					} else if (e.getKeyCode() == KeyEvent.VK_N) {
						if (shiftPressed) {
							if (!capsLockPressed)
								keyHandler.doAction("N");
							else
								keyHandler.doAction("n");
						} else
							keyHandler.doAction(btnN.getText());
					} else if (e.getKeyCode() == KeyEvent.VK_B) {
						if (shiftPressed) {
							if (!capsLockPressed)
								keyHandler.doAction("B");
							else
								keyHandler.doAction("b");
						} else
							keyHandler.doAction(btnB.getText());
					} else if (e.getKeyCode() == KeyEvent.VK_V) {
						if (shiftPressed) {
							if (!capsLockPressed)
								keyHandler.doAction("V");
							else
								keyHandler.doAction("v");
						} else
							keyHandler.doAction(btnV.getText());
					} else if (e.getKeyCode() == KeyEvent.VK_C) {
						if (shiftPressed) {
							if (!capsLockPressed)
								keyHandler.doAction("C");
							else
								keyHandler.doAction("c");
						} else
							keyHandler.doAction(btnC.getText());
					} else if (e.getKeyCode() == KeyEvent.VK_X) {
						if (shiftPressed) {
							if (!capsLockPressed)
								keyHandler.doAction("X");
							else
								keyHandler.doAction("x");
						} else
							keyHandler.doAction(btnX.getText());
					} else if (e.getKeyCode() == KeyEvent.VK_Z) {
						if (shiftPressed) {
							if (!capsLockPressed)
								keyHandler.doAction("Z");
							else
								keyHandler.doAction("z");
						} else
							keyHandler.doAction(btnZ.getText());
					} else if (e.getKeyCode() == KeyEvent.VK_SHIFT) {
						shiftPressed = true;
						btnShift.setForeground(Color.white);
						btnShift.setBackground(new Color(250, 128, 114));
					} else if (e.getKeyCode() == KeyEvent.VK_CONTROL) {
						keyHandler.doAction("CONTROL");
					} else if (e.getKeyCode() == KeyEvent.VK_WINDOWS) {
						keyHandler.doAction("WINDOWS");
					} else if (e.getKeyCode() == KeyEvent.VK_ALT) {
						keyHandler.doAction("ALT");
					} else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
						keyHandler.doAction("SPACE");
					}
				} catch (Exception a) {
					a.printStackTrace();
				}
			}

			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_SHIFT)
					keyHandler.releaseButtons("SHIFT");
				else if (e.getKeyCode() == KeyEvent.VK_SPACE)
					keyHandler.releaseButtons("SPACE");
				else if (e.getKeyCode() == KeyEvent.VK_CONTROL)
					keyHandler.releaseButtons("CONTROL");
				else if (e.getKeyCode() == KeyEvent.VK_ALT)
					keyHandler.releaseButtons("ALT");
				else if (e.getKeyCode() == KeyEvent.VK_UP)
					keyHandler.releaseButtons("UP");
				else if (e.getKeyCode() == KeyEvent.VK_DOWN)
					keyHandler.releaseButtons("DOWN");
				else if (e.getKeyCode() == KeyEvent.VK_LEFT)
					keyHandler.releaseButtons("LEFT");
				else if (e.getKeyCode() == KeyEvent.VK_RIGHT)
					keyHandler.releaseButtons("RIGHT");
				else if (e.getKeyCode() == KeyEvent.VK_Z)
					keyHandler.releaseButtons("Z");
				else if (e.getKeyCode() == KeyEvent.VK_X)
					keyHandler.releaseButtons("X");
				else if (e.getKeyCode() == KeyEvent.VK_C)
					keyHandler.releaseButtons("C");
				else if (e.getKeyCode() == KeyEvent.VK_V)
					keyHandler.releaseButtons("V");
				else if (e.getKeyCode() == KeyEvent.VK_B)
					keyHandler.releaseButtons("B");
				else if (e.getKeyCode() == KeyEvent.VK_N)
					keyHandler.releaseButtons("N");
				else if (e.getKeyCode() == KeyEvent.VK_M)
					keyHandler.releaseButtons("M");
				else if (e.getKeyCode() == KeyEvent.VK_COMMA)
					keyHandler.releaseButtons(",");
				else if (e.getKeyCode() == KeyEvent.VK_PERIOD)
					keyHandler.releaseButtons(".");
				else if (e.getKeyCode() == KeyEvent.VK_SLASH)
					keyHandler.releaseButtons("/");
				else if (e.getKeyCode() == KeyEvent.VK_ENTER)
					keyHandler.releaseButtons("ENTER");
				else if (e.getKeyCode() == KeyEvent.VK_QUOTE)
					keyHandler.releaseButtons("'");
				else if (e.getKeyCode() == KeyEvent.VK_SEMICOLON)
					keyHandler.releaseButtons(";");
				else if (e.getKeyCode() == KeyEvent.VK_L)
					keyHandler.releaseButtons("L");
				else if (e.getKeyCode() == KeyEvent.VK_K)
					keyHandler.releaseButtons("K");
				else if (e.getKeyCode() == KeyEvent.VK_J)
					keyHandler.releaseButtons("J");
				else if (e.getKeyCode() == KeyEvent.VK_H)
					keyHandler.releaseButtons("H");
				else if (e.getKeyCode() == KeyEvent.VK_G)
					keyHandler.releaseButtons("G");
				else if (e.getKeyCode() == KeyEvent.VK_F)
					keyHandler.releaseButtons("F");
				else if (e.getKeyCode() == KeyEvent.VK_D)
					keyHandler.releaseButtons("D");
				else if (e.getKeyCode() == KeyEvent.VK_S)
					keyHandler.releaseButtons("S");
				else if (e.getKeyCode() == KeyEvent.VK_A)
					keyHandler.releaseButtons("A");
				else if (e.getKeyCode() == KeyEvent.VK_TAB)
					keyHandler.releaseButtons("TAB");
				else if (e.getKeyCode() == KeyEvent.VK_Q)
					keyHandler.releaseButtons("Q");
				else if (e.getKeyCode() == KeyEvent.VK_W)
					keyHandler.releaseButtons("W");
				else if (e.getKeyCode() == KeyEvent.VK_E)
					keyHandler.releaseButtons("E");
				else if (e.getKeyCode() == KeyEvent.VK_R)
					keyHandler.releaseButtons("R");
				else if (e.getKeyCode() == KeyEvent.VK_T)
					keyHandler.releaseButtons("T");
				else if (e.getKeyCode() == KeyEvent.VK_Y)
					keyHandler.releaseButtons("Y");
				else if (e.getKeyCode() == KeyEvent.VK_U)
					keyHandler.releaseButtons("U");
				else if (e.getKeyCode() == KeyEvent.VK_I)
					keyHandler.releaseButtons("I");
				else if (e.getKeyCode() == KeyEvent.VK_O)
					keyHandler.releaseButtons("O");
				else if (e.getKeyCode() == KeyEvent.VK_P)
					keyHandler.releaseButtons("P");
				else if (e.getKeyCode() == KeyEvent.VK_OPEN_BRACKET)
					keyHandler.releaseButtons("[");
				else if (e.getKeyCode() == KeyEvent.VK_CLOSE_BRACKET)
					keyHandler.releaseButtons("]");
				else if (e.getKeyCode() == KeyEvent.VK_BACK_SLASH)
					keyHandler.releaseButtons("\\");
				else if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE)
					keyHandler.releaseButtons("BACK_SPACE");
				else if (e.getKeyCode() == KeyEvent.VK_EQUALS)
					keyHandler.releaseButtons("=");
				else if (e.getKeyCode() == KeyEvent.VK_MINUS)
					keyHandler.releaseButtons("-");
				else if (e.getKeyCode() == KeyEvent.VK_0)
					keyHandler.releaseButtons("0");
				else if (e.getKeyCode() == KeyEvent.VK_9)
					keyHandler.releaseButtons("9");
				else if (e.getKeyCode() == KeyEvent.VK_8)
					keyHandler.releaseButtons("8");
				else if (e.getKeyCode() == KeyEvent.VK_7)
					keyHandler.releaseButtons("7");
				else if (e.getKeyCode() == KeyEvent.VK_6)
					keyHandler.releaseButtons("6");
				else if (e.getKeyCode() == KeyEvent.VK_5)
					keyHandler.releaseButtons("5");
				else if (e.getKeyCode() == KeyEvent.VK_4)
					keyHandler.releaseButtons("4");
				else if (e.getKeyCode() == KeyEvent.VK_3)
					keyHandler.releaseButtons("3");
				else if (e.getKeyCode() == KeyEvent.VK_2)
					keyHandler.releaseButtons("2");
				else if (e.getKeyCode() == KeyEvent.VK_1)
					keyHandler.releaseButtons("1");
				else if (KeyEvent.getKeyText(e.getKeyCode()).equals("Back Quote"))
					keyHandler.releaseButtons("`");
				else if (e.getKeyCode() == KeyEvent.VK_WINDOWS)
					keyHandler.releaseButtons("WINDOWS");
			}
		});
		JScrollPane scroll = new JScrollPane(textArea);
		textArea.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(250, 128, 114), new Color(250, 128, 114),
				new Color(250, 128, 114), new Color(250, 128, 114)));
		textArea.setFont(new Font("Courier New", Font.PLAIN, 18));
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		scroll.setBounds(42, 285, 806, 145);
		frame.getContentPane().add(scroll);

		Panagrams = new ArrayList<String>();
		Panagrams.add("Brick quiz whangs jumpy veldt fox!");
		Panagrams.add("Quick wafting zephyrs vex bold Jim");
		Panagrams.add("The five boxing wizards jumped quickly");
		Panagrams.add("A large fawn jumped quickly over white zinc boxes");
		Panagrams.add("Five wine experts jokingly quizzed sample Chablis");
		Panagrams.add("Five or six big jet planes zoomed quickly by the tower");
		Panagrams.add("Fred specialized in the job of making very quaint wax toys");
		Panagrams.add("All questions asked by five watch experts amazed the judge.");
		Panagrams.add("The quick brown fox jumps over a lazy dog");
		Panagrams.add("Jaded zombies acted quaintly but kept driving their oxen forward");
		Panagrams.add("Sixty zippers were quickly picked from the woven jute bag.");
		Panagrams.add("My help squeezed in and joined the weavers again before six o'clock");
		Panagrams.add("A quart jar of oil mixed with zinc oxide makes a very bright paint");
		Panagrams.add("We quickly seized the black axle and just saved it from going past him");
		Panagrams.add("A mad boxer shot a quick, gloved jab to the jaw of his dizzy opponent");

		textField.setText(Panagrams.get(0));
		spinner = new JSpinner();
		// Lets the textField of the spinner non editable.
		JSpinner.DefaultEditor editor = new JSpinner.DefaultEditor(spinner);
		spinner.setEditor(editor);
		spinner.setValue(1);
		spinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				textField.setText("" + Panagrams.get((Integer) spinner.getValue() - 1));
			}
		});
		spinner.setForeground(Color.BLACK);
		spinner.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		spinner.setFont(new Font("Tahoma", Font.BOLD, 20));
		spinner.setModel(new SpinnerNumberModel(1, 1, 15, 1));
		spinner.setBounds(42, 202, 60, 35);
		frame.getContentPane().add(spinner);

		JLabel lblChooseAPanagram = new JLabel("Choose a panagram and type it");
		lblChooseAPanagram.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblChooseAPanagram.setForeground(Color.WHITE);
		lblChooseAPanagram.setBounds(109, 212, 254, 19);
		frame.getContentPane().add(lblChooseAPanagram);

		score = new JLabel("0");
		score.setOpaque(true);
		score.setBackground(new Color(50, 205, 50));
		score.setFont(new Font("Tahoma", Font.BOLD, 20));
		score.setHorizontalAlignment(SwingConstants.CENTER);
		score.setForeground(Color.WHITE);
		score.setBounds(801, 250, 47, 35);
		frame.getContentPane().add(score);

		JLabel errorsLabel = new JLabel("Errors:");
		errorsLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		errorsLabel.setForeground(Color.BLACK);
		errorsLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		errorsLabel.setBounds(697, 250, 93, 35);
		frame.getContentPane().add(errorsLabel);

		congrats = new JLabel(/*
								 * new ImageIcon(Main.class.getResource(
								 * "Congrats.png"))
								 */);
		congrats.setBounds(666, 79, 200, 150);
		frame.getContentPane().add(congrats);

		popupMenu = new JPopupMenu();
		addPopup(score, popupMenu);

		JMenuItem resetMenuItem = new JMenuItem("Reset and Clear Text");
		resetMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score.setBackground(new Color(50, 205, 50));
				KeyHandler.i = KeyHandler.errorCount = 0;
				score.setText("0");
				textArea.setText("");
				// A manipulating way to remove the highlighting.
				if ((Integer) Main.spinner.getValue() == 15) {
					textField.setText("" + Panagrams.get((Integer) spinner.getValue() - 2));
					textField.setText("" + Panagrams.get((Integer) spinner.getValue() - 1));
				} else {
					textField.setText("" + Panagrams.get((Integer) spinner.getValue()));
					textField.setText("" + Panagrams.get((Integer) spinner.getValue() - 1));
				}
			}
		});
		resetMenuItem.setBackground(SystemColor.inactiveCaption);
		resetMenuItem.setHorizontalAlignment(SwingConstants.LEFT);
		popupMenu.add(resetMenuItem);

		picShowLabel = new JLabel(new ImageIcon(Main.class.getResource("picShow.gif")));
		picShowLabel.setBounds(354, 79, 194, 153);
		frame.getContentPane().add(picShowLabel);

		frameImage = new JLabel();
		frameImage.setBounds(0, 0, 900, 700);
		frame.getContentPane().add(frameImage);
		frameImage.setIcon(new ImageIcon(Main.class.getResource("frameImage1.png")));

		dragLabel = new JLabel("");
		dragLabel.setBackground(Color.RED);
		dragLabel.setBounds(0, 0, 616, 49);
		frame.getContentPane().add(dragLabel);

		exitWindow = new JLabel();
		exitWindow.setToolTipText("Close");
		exitWindow.setHorizontalAlignment(SwingConstants.CENTER);
		exitWindow.setBounds(811, 3, 53, 60);
		frame.getContentPane().add(exitWindow);
		exitWindow.setIcon(new ImageIcon(Main.class.getResource("exitWindow.png")));

		minimizeWindow = new JLabel();
		minimizeWindow.setToolTipText("Minimize");
		minimizeWindow.setHorizontalAlignment(SwingConstants.CENTER);
		minimizeWindow.setBounds(749, 3, 53, 60);
		frame.getContentPane().add(minimizeWindow);
		minimizeWindow.setIcon(new ImageIcon(Main.class.getResource("minimizeWindow.png")));

		controlMusic = new JLabel();
		controlMusic.setToolTipText("Turn off music");
		controlMusic.setHorizontalAlignment(SwingConstants.CENTER);
		controlMusic.setBounds(690, 2, 53, 60);
		frame.getContentPane().add(controlMusic);
		controlMusic.setIcon(new ImageIcon(Main.class.getResource("soundOFF.png")));

		changeTheme = new JLabel(new ImageIcon(Main.class.getResource("changeTheme.png")));
		changeTheme.setToolTipText("Change the theme");
		changeTheme.setHorizontalAlignment(SwingConstants.CENTER);
		changeTheme.setBounds(630, 3, 53, 60);
		frame.getContentPane().add(changeTheme);

		FrameControl frameControl = new FrameControl(exitWindow, minimizeWindow, controlMusic, changeTheme, frame);

		exitWindow.addMouseListener(frameControl);
		minimizeWindow.addMouseListener(frameControl);
		controlMusic.addMouseListener(frameControl);
		changeTheme.addMouseListener(frameControl);

		// Dragging the frame.
		FrameDrag frameDrag = new FrameDrag(frame);
		dragLabel.addMouseListener(frameDrag);
		dragLabel.addMouseMotionListener(frameDrag);
		frame.setVisible(true);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}