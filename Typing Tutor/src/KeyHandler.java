import java.awt.Color;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import javax.swing.text.Highlighter.HighlightPainter;

public class KeyHandler {
	public static int errorCount;
	public static int i;
	public static char[] panagramArr;
	private static Highlighter highlighter;
	private static HighlightPainter painter;

	public KeyHandler() {
		i = 0;
		errorCount = 0;
		panagramArr = new char[200];
		highlighter = Main.textField.getHighlighter();
		painter = new DefaultHighlighter.DefaultHighlightPainter(Color.PINK);
	}

	public static void Highlighting() {

		try {
			highlighter.addHighlight(0, i, painter);
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
	}

	public static void compareStrings(char c) {
		panagramArr = Main.textField.getText().toCharArray();
		if (i >= panagramArr.length) {
			errorCount = i = 0;
			Main.score.setBackground(new Color(50, 205, 50));
			Main.score.setText(String.valueOf(errorCount));
			return;
		}

		if (c != panagramArr[i]) {
			Main.score.setBackground(Color.RED);
			errorCount++;
			Main.score.setText(String.valueOf(errorCount));
		}
		i++;
	}

	public void doAction(String str)
			throws UnsupportedAudioFileException, IOException, LineUnavailableException, URISyntaxException {
		if (str.equals("~")) {
			Main.button.setForeground(Color.white);
			Main.button.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('~');
			Highlighting();
		} else if (str.equals("`")) {
			Main.button.setForeground(Color.white);
			Main.button.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('`');
			Highlighting();
		} else if (str.equals("!")) {
			Main.button_1.setForeground(Color.white);
			Main.button_1.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('!');
			Highlighting();
		} else if (str.equals("1")) {
			Main.button_1.setForeground(Color.white);
			Main.button_1.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('1');
			Highlighting();
		} else if (str.equals("@")) {
			Main.button_2.setForeground(Color.white);
			Main.button_2.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('@');
			Highlighting();
		} else if (str.equals("2")) {
			Main.button_2.setForeground(Color.white);
			Main.button_2.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('2');
			Highlighting();
		} else if (str.equals("#")) {
			Main.button_3.setForeground(Color.white);
			Main.button_3.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('#');
			Highlighting();
		} else if (str.equals("3")) {
			Main.button_3.setForeground(Color.white);
			Main.button_3.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('3');
			Highlighting();
		} else if (str.equals("$")) {
			Main.button_4.setForeground(Color.white);
			Main.button_4.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('$');
			Highlighting();
		} else if (str.equals("4")) {
			Main.button_4.setForeground(Color.white);
			Main.button_4.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('4');
			Highlighting();
		} else if (str.equals("%")) {
			Main.button_5.setForeground(Color.white);
			Main.button_5.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('%');
			Highlighting();
		} else if (str.equals("5")) {
			Main.button_5.setForeground(Color.white);
			Main.button_5.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('5');
			Highlighting();
		} else if (str.equals("^")) {
			Main.button_6.setForeground(Color.white);
			Main.button_6.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('^');
			Highlighting();
		} else if (str.equals("6")) {
			Main.button_6.setForeground(Color.white);
			Main.button_6.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('6');
			Highlighting();
		} else if (str.equals("&")) {
			Main.button_7.setForeground(Color.white);
			Main.button_7.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('&');
			Highlighting();
		} else if (str.equals("7")) {
			Main.button_7.setForeground(Color.white);
			Main.button_7.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('7');
			Highlighting();
		} else if (str.equals("*")) {
			Main.button_8.setForeground(Color.white);
			Main.button_8.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('*');
			Highlighting();
		} else if (str.equals("8")) {
			Main.button_8.setForeground(Color.white);
			Main.button_8.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('8');
			Highlighting();
		} else if (str.equals("(")) {
			Main.button_9.setForeground(Color.white);
			Main.button_9.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('(');
			Highlighting();
		} else if (str.equals("9")) {
			Main.button_9.setForeground(Color.white);
			Main.button_9.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('9');
			Highlighting();
		} else if (str.equals("0")) {
			Main.button_10.setForeground(Color.white);
			Main.button_10.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('0');
			Highlighting();
		} else if (str.equals(")")) {
			Main.button_10.setForeground(Color.white);
			Main.button_10.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings(')');
			Highlighting();
		} else if (str.equals("_")) {
			Main.button_11.setForeground(Color.white);
			Main.button_11.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('_');
			Highlighting();
		} else if (str.equals("-")) {
			Main.button_11.setForeground(Color.white);
			Main.button_11.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('-');
			Highlighting();
		} else if (str.equals("+")) {
			Main.button_12.setForeground(Color.white);
			Main.button_12.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('+');
			Highlighting();
		} else if (str.equals("=")) {
			Main.button_12.setForeground(Color.white);
			Main.button_12.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('=');
			Highlighting();
		} else if (str.equals("BACK_SPACE")) {
			Main.btnBackspace.setForeground(Color.white);
			Main.btnBackspace.setBackground(new Color(250, 128, 114));

			char[] oldContent = Main.textArea.getText().toCharArray();
			String newContent = "";
			for (int i = 0; i < (oldContent.length) - 1; i++)
				newContent += oldContent[i];
			Main.textArea.setText(newContent);

			i--;
			if (Main.textArea.getText().isEmpty())
				i = 0;
			int count = 0;
			char[] textArr = Main.textArea.getText().toCharArray();
			for (int k = 0; k < i; k++) {
				if (textArr[k] != panagramArr[k])
					count++;
			}
			if (count == 0) {
				Main.score.setText(String.valueOf(count));
				Main.score.setBackground(new Color(50, 205, 50));
				errorCount = 0;
			} else {
				Main.score.setText(String.valueOf(count));
				Main.score.setBackground(Color.RED);
				errorCount = count;
			}
		} else if (str.equals("|")) {
			Main.button_13.setForeground(Color.white);
			Main.button_13.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('|');
			Highlighting();
		} else if (str.equals("\\")) {
			Main.button_13.setForeground(Color.white);
			Main.button_13.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('\\');
			Highlighting();
		} else if (str.equals("}")) {
			Main.button_14.setForeground(Color.white);
			Main.button_14.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('}');
			Highlighting();
		} else if (str.equals("]")) {
			Main.button_14.setForeground(Color.white);
			Main.button_14.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings(']');
			Highlighting();
		} else if (str.equals("{")) {
			Main.button_15.setForeground(Color.white);
			Main.button_15.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('{');
			Highlighting();
		} else if (str.equals("[")) {
			Main.button_15.setForeground(Color.white);
			Main.button_15.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('[');
			Highlighting();
		} else if (str.equals("P")) {
			Main.btnP.setForeground(Color.white);
			Main.btnP.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('P');
			Highlighting();
		} else if (str.equals("p")) {
			Main.btnP.setForeground(Color.white);
			Main.btnP.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('p');
			Highlighting();
		} else if (str.equals("O")) {
			Main.btnO.setForeground(Color.white);
			Main.btnO.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('O');
			Highlighting();
		} else if (str.equals("o")) {
			Main.btnO.setForeground(Color.white);
			Main.btnO.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('o');
			Highlighting();
		} else if (str.equals("I")) {
			Main.btnI.setForeground(Color.white);
			Main.btnI.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('I');
			Highlighting();
		} else if (str.equals("i")) {
			Main.btnI.setForeground(Color.white);
			Main.btnI.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('i');
			Highlighting();
		} else if (str.equals("U")) {
			Main.btnU.setForeground(Color.white);
			Main.btnU.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('U');
			Highlighting();
		} else if (str.equals("u")) {
			Main.btnU.setForeground(Color.white);
			Main.btnU.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('u');
			Highlighting();
		} else if (str.equals("Y")) {
			Main.btnY.setForeground(Color.white);
			Main.btnY.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('Y');
			Highlighting();
		} else if (str.equals("y")) {
			Main.btnY.setForeground(Color.white);
			Main.btnY.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('y');
			Highlighting();
		} else if (str.equals("T")) {
			Main.btnT.setForeground(Color.white);
			Main.btnT.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('T');
			Highlighting();
		} else if (str.equals("t")) {
			Main.btnT.setForeground(Color.white);
			Main.btnT.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('t');
			Highlighting();
		} else if (str.equals("R")) {
			Main.btnR.setForeground(Color.white);
			Main.btnR.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('R');
			Highlighting();
		} else if (str.equals("r")) {
			Main.btnR.setForeground(Color.white);
			Main.btnR.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('r');
			Highlighting();
		} else if (str.equals("E")) {
			Main.btnE.setForeground(Color.white);
			Main.btnE.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('E');
			Highlighting();
		} else if (str.equals("e")) {
			Main.btnE.setForeground(Color.white);
			Main.btnE.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('e');
			Highlighting();
		} else if (str.equals("W")) {
			Main.btnW.setForeground(Color.white);
			Main.btnW.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('W');
			Highlighting();
		} else if (str.equals("w")) {
			Main.btnW.setForeground(Color.white);
			Main.btnW.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('w');
			Highlighting();
		} else if (str.equals("Q")) {
			Main.btnQ.setForeground(Color.white);
			Main.btnQ.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('Q');
			Highlighting();
		} else if (str.equals("q")) {
			Main.btnQ.setForeground(Color.white);
			Main.btnQ.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('q');
			Highlighting();
		} else if (str.equals("TAB")) {
			Main.btnTab.setForeground(Color.white);
			Main.btnTab.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + "\t");
		} else if (str.equals("CAPS_LOCK")) {
			if (!Main.capsLockPressed) {
				Main.btnCapslk.setForeground(Color.white);
				Main.btnCapslk.setBackground(new Color(250, 128, 114));
				Main.btnA.setText("A");
				Main.btnB.setText("B");
				Main.btnC.setText("C");
				Main.btnD.setText("D");
				Main.btnE.setText("E");
				Main.btnF.setText("F");
				Main.btnG.setText("G");
				Main.btnH.setText("H");
				Main.btnI.setText("I");
				Main.btnJ.setText("J");
				Main.btnK.setText("K");
				Main.btnL.setText("L");
				Main.btnM.setText("M");
				Main.btnN.setText("N");
				Main.btnO.setText("O");
				Main.btnP.setText("P");
				Main.btnQ.setText("Q");
				Main.btnR.setText("R");
				Main.btnS.setText("S");
				Main.btnT.setText("T");
				Main.btnU.setText("U");
				Main.btnV.setText("V");
				Main.btnW.setText("W");
				Main.btnX.setText("X");
				Main.btnY.setText("Y");
				Main.btnZ.setText("Z");
				Main.capsLockPressed = true;
			} else if (Main.capsLockPressed) {
				Main.btnCapslk.setForeground(Color.BLACK);
				Main.btnCapslk.setBackground(Main.originButtonBG);
				Main.btnA.setText("a");
				Main.btnB.setText("b");
				Main.btnC.setText("c");
				Main.btnD.setText("d");
				Main.btnE.setText("e");
				Main.btnF.setText("f");
				Main.btnG.setText("g");
				Main.btnH.setText("h");
				Main.btnI.setText("i");
				Main.btnJ.setText("j");
				Main.btnK.setText("k");
				Main.btnL.setText("l");
				Main.btnM.setText("m");
				Main.btnN.setText("n");
				Main.btnO.setText("o");
				Main.btnP.setText("p");
				Main.btnQ.setText("q");
				Main.btnR.setText("r");
				Main.btnS.setText("s");
				Main.btnT.setText("t");
				Main.btnU.setText("u");
				Main.btnV.setText("v");
				Main.btnW.setText("w");
				Main.btnX.setText("x");
				Main.btnY.setText("y");
				Main.btnZ.setText("z");
				Main.capsLockPressed = false;
			}

		} else if (str.equals("A")) {
			Main.btnA.setForeground(Color.white);
			Main.btnA.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('A');
			Highlighting();
		} else if (str.equals("a")) {
			Main.btnA.setForeground(Color.white);
			Main.btnA.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('a');
			Highlighting();
		} else if (str.equals("S")) {
			Main.btnS.setForeground(Color.white);
			Main.btnS.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('S');
			Highlighting();
		} else if (str.equals("s")) {
			Main.btnS.setForeground(Color.white);
			Main.btnS.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('s');
			Highlighting();
		} else if (str.equals("D")) {
			Main.btnD.setForeground(Color.white);
			Main.btnD.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('D');
			Highlighting();
		} else if (str.equals("d")) {
			Main.btnD.setForeground(Color.white);
			Main.btnD.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('d');
			Highlighting();
		} else if (str.equals("F")) {
			Main.btnF.setForeground(Color.white);
			Main.btnF.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('F');
			Highlighting();
		} else if (str.equals("f")) {
			Main.btnF.setForeground(Color.white);
			Main.btnF.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('f');
			Highlighting();
		} else if (str.equals("G")) {
			Main.btnG.setForeground(Color.white);
			Main.btnG.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('G');
			Highlighting();
		} else if (str.equals("g")) {
			Main.btnG.setForeground(Color.white);
			Main.btnG.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('g');
			Highlighting();
		} else if (str.equals("H")) {
			Main.btnH.setForeground(Color.white);
			Main.btnH.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('H');
			Highlighting();
		} else if (str.equals("h")) {
			Main.btnH.setForeground(Color.white);
			Main.btnH.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('h');
			Highlighting();
		} else if (str.equals("J")) {
			Main.btnJ.setForeground(Color.white);
			Main.btnJ.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('J');
			Highlighting();
		} else if (str.equals("j")) {
			Main.btnJ.setForeground(Color.white);
			Main.btnJ.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('j');
			Highlighting();
		} else if (str.equals("K")) {
			Main.btnK.setForeground(Color.white);
			Main.btnK.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('K');
			Highlighting();
		} else if (str.equals("k")) {
			Main.btnK.setForeground(Color.white);
			Main.btnK.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('k');
			Highlighting();
		} else if (str.equals("L")) {
			Main.btnL.setForeground(Color.white);
			Main.btnL.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('L');
			Highlighting();
		} else if (str.equals("l")) {
			Main.btnL.setForeground(Color.white);
			Main.btnL.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('l');
			Highlighting();
		} else if (str.equals(":")) {
			Main.button_16.setForeground(Color.white);
			Main.button_16.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings(':');
			Highlighting();
		} else if (str.equals(";")) {
			Main.button_16.setForeground(Color.white);
			Main.button_16.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings(';');
			Highlighting();
		} else if (str.equals("\"")) {
			Main.button_17.setForeground(Color.white);
			Main.button_17.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('"');
			Highlighting();
		} else if (str.equals("'")) {
			Main.button_17.setForeground(Color.white);
			Main.button_17.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('\'');
			Highlighting();
		} else if (str.equals("ENTER")) {
			Main.btnEnter.setForeground(Color.white);
			Main.btnEnter.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			if (i < panagramArr.length)
				Main.textArea.setText(Main.textArea.getText() + "\n");

			else if (i >= panagramArr.length && Main.score.getText().equals("0")) {
				Main.textArea.setText("");
				i = errorCount = 0;

				// A manipulating way to remove the highlighting.
				if ((Integer) Main.spinner.getValue() == 15) {
					Main.textField.setText("" + Main.Panagrams.get((Integer) Main.spinner.getValue() - 2));
					Main.textField.setText("" + Main.Panagrams.get((Integer) Main.spinner.getValue() - 1));
				} else {
					Main.textField.setText("" + Main.Panagrams.get((Integer) Main.spinner.getValue()));
					Main.textField.setText("" + Main.Panagrams.get((Integer) Main.spinner.getValue() - 1));
				}
			}
		} else if (str.equals("UP")) {
			Main.button_21.setForeground(Color.white);
			Main.button_21.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			if ((Integer) Main.spinner.getValue() != 15) {
				Main.spinner.setValue((Integer) Main.spinner.getValue() + 1);
				Main.textField.setText("" + Main.Panagrams.get((Integer) Main.spinner.getValue() - 1));
			}
		} else if (str.equals("DOWN")) {
			Main.button_23.setForeground(Color.white);
			Main.button_23.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			if ((Integer) Main.spinner.getValue() != 1) {
				Main.spinner.setValue((Integer) Main.spinner.getValue() - 1);
				Main.textField.setText("" + Main.Panagrams.get((Integer) Main.spinner.getValue() - 1));
			}
		} else if (str.equals("RIGHT")) {
			Main.button_22.setForeground(Color.white);
			Main.button_22.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		} else if (str.equals("LEFT")) {
			Main.button_24.setForeground(Color.white);
			Main.button_24.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		} else if (str.equals("?")) {
			Main.button_20.setForeground(Color.white);
			Main.button_20.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('?');
			Highlighting();
		} else if (str.equals("/")) {
			Main.button_20.setForeground(Color.white);
			Main.button_20.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('/');
			Highlighting();
		} else if (str.equals(">")) {
			Main.button_19.setForeground(Color.white);
			Main.button_19.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('>');
			Highlighting();
		} else if (str.equals(".")) {
			Main.button_19.setForeground(Color.white);
			Main.button_19.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('.');
			Highlighting();
		} else if (str.equals("<")) {
			Main.button_18.setForeground(Color.white);
			Main.button_18.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('<');
			Highlighting();
		} else if (str.equals(",")) {
			Main.button_18.setForeground(Color.white);
			Main.button_18.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings(',');
			Highlighting();
		} else if (str.equals("M")) {
			Main.btnM.setForeground(Color.white);
			Main.btnM.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('M');
			Highlighting();
		} else if (str.equals("m")) {
			Main.btnM.setForeground(Color.white);
			Main.btnM.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('m');
			Highlighting();
		} else if (str.equals("N")) {
			Main.btnN.setForeground(Color.white);
			Main.btnN.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('N');
			Highlighting();
		} else if (str.equals("n")) {
			Main.btnN.setForeground(Color.white);
			Main.btnN.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('n');
			Highlighting();
		} else if (str.equals("B")) {
			Main.btnB.setForeground(Color.white);
			Main.btnB.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('B');
			Highlighting();
		} else if (str.equals("b")) {
			Main.btnB.setForeground(Color.white);
			Main.btnB.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('b');
			Highlighting();
		} else if (str.equals("V")) {
			Main.btnV.setForeground(Color.white);
			Main.btnV.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('V');
			Highlighting();
		} else if (str.equals("v")) {
			Main.btnV.setForeground(Color.white);
			Main.btnV.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('v');
			Highlighting();
		} else if (str.equals("C")) {
			Main.btnC.setForeground(Color.white);
			Main.btnC.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('C');
			Highlighting();
		} else if (str.equals("c")) {
			Main.btnC.setForeground(Color.white);
			Main.btnC.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('c');
			Highlighting();
		} else if (str.equals("X")) {
			Main.btnX.setForeground(Color.white);
			Main.btnX.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('X');
			Highlighting();
		} else if (str.equals("x")) {
			Main.btnX.setForeground(Color.white);
			Main.btnX.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('x');
			Highlighting();
		} else if (str.equals("Z")) {
			Main.btnZ.setForeground(Color.white);
			Main.btnZ.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('Z');
			Highlighting();
		} else if (str.equals("z")) {
			Main.btnZ.setForeground(Color.white);
			Main.btnZ.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + str);
			compareStrings('z');
			Highlighting();
		} else if (str.equals("CONTROL")) {
			Main.btnCtrl.setForeground(Color.white);
			Main.btnCtrl.setBackground(new Color(250, 128, 114));
			Main.btnCtrl_1.setForeground(Color.white);
			Main.btnCtrl_1.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		} else if (str.equals("WINDOWS")) {
			Main.btnWin.setForeground(Color.white);
			Main.btnWin.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		} else if (str.equals("SPACE")) {
			Main.button_25.setForeground(Color.white);
			Main.button_25.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Main.textArea.setText(Main.textArea.getText() + " ");
			compareStrings(' ');
			Highlighting();
		} else if (str.equals("ALT")) {
			Main.btnAlt.setForeground(Color.white);
			Main.btnAlt.setBackground(new Color(250, 128, 114));
			Main.btnAlt_1.setForeground(Color.white);
			Main.btnAlt_1.setBackground(new Color(250, 128, 114));

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(Main.class.getResource("Button_Sound.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		}
	}

	public void releaseButtons(String str) {
		if (str.equals("SHIFT")) {
			Main.shiftPressed = false;
			Main.btnShift.setForeground(Color.black);
			Main.btnShift.setBackground(Main.originButtonBG);
		} else if (str.equals("CONTROL")) {
			Main.btnCtrl.setForeground(Color.black);
			Main.btnCtrl.setBackground(Main.originButtonBG);
			Main.btnCtrl_1.setForeground(Color.black);
			Main.btnCtrl_1.setBackground(Main.originButtonBG);
		} else if (str.equals("ALT")) {
			Main.btnAlt.setForeground(Color.black);
			Main.btnAlt.setBackground(Main.originButtonBG);
			Main.btnAlt_1.setForeground(Color.black);
			Main.btnAlt_1.setBackground(Main.originButtonBG);
		} else if (str.equals("SPACE")) {
			Main.button_25.setForeground(Color.black);
			Main.button_25.setBackground(Main.originButtonBG);
		} else if (str.equals("WINDOWS")) {
			Main.btnWin.setForeground(Color.black);
			Main.btnWin.setBackground(Main.originButtonBG);
		} else if (str.equals("UP")) {
			Main.button_21.setForeground(Color.black);
			Main.button_21.setBackground(Main.originButtonBG);
		} else if (str.equals("DOWN")) {
			Main.button_23.setForeground(Color.black);
			Main.button_23.setBackground(Main.originButtonBG);
		} else if (str.equals("LEFT")) {
			Main.button_24.setForeground(Color.black);
			Main.button_24.setBackground(Main.originButtonBG);
		} else if (str.equals("RIGHT")) {
			Main.button_22.setForeground(Color.black);
			Main.button_22.setBackground(Main.originButtonBG);
		} else if (str.equals("A")) {
			Main.btnA.setForeground(Color.black);
			Main.btnA.setBackground(Main.originButtonBG);
		} else if (str.equals("B")) {
			Main.btnB.setForeground(Color.black);
			Main.btnB.setBackground(Main.originButtonBG);
		} else if (str.equals("C")) {
			Main.btnC.setForeground(Color.black);
			Main.btnC.setBackground(Main.originButtonBG);
		} else if (str.equals("D")) {
			Main.btnD.setForeground(Color.black);
			Main.btnD.setBackground(Main.originButtonBG);
		} else if (str.equals("E")) {
			Main.btnE.setForeground(Color.black);
			Main.btnE.setBackground(Main.originButtonBG);
		} else if (str.equals("F")) {
			Main.btnF.setForeground(Color.black);
			Main.btnF.setBackground(Main.originButtonBG);
		} else if (str.equals("G")) {
			Main.btnG.setForeground(Color.black);
			Main.btnG.setBackground(Main.originButtonBG);
		} else if (str.equals("H")) {
			Main.btnH.setForeground(Color.black);
			Main.btnH.setBackground(Main.originButtonBG);
		} else if (str.equals("I")) {
			Main.btnI.setForeground(Color.black);
			Main.btnI.setBackground(Main.originButtonBG);
		} else if (str.equals("J")) {
			Main.btnJ.setForeground(Color.black);
			Main.btnJ.setBackground(Main.originButtonBG);
		} else if (str.equals("K")) {
			Main.btnK.setForeground(Color.black);
			Main.btnK.setBackground(Main.originButtonBG);
		} else if (str.equals("L")) {
			Main.btnL.setForeground(Color.black);
			Main.btnL.setBackground(Main.originButtonBG);
		} else if (str.equals("M")) {
			Main.btnM.setForeground(Color.black);
			Main.btnM.setBackground(Main.originButtonBG);
		} else if (str.equals("N")) {
			Main.btnN.setForeground(Color.black);
			Main.btnN.setBackground(Main.originButtonBG);
		} else if (str.equals("O")) {
			Main.btnO.setForeground(Color.black);
			Main.btnO.setBackground(Main.originButtonBG);
		} else if (str.equals("P")) {
			Main.btnP.setForeground(Color.black);
			Main.btnP.setBackground(Main.originButtonBG);
		} else if (str.equals("Q")) {
			Main.btnQ.setForeground(Color.black);
			Main.btnQ.setBackground(Main.originButtonBG);
		} else if (str.equals("R")) {
			Main.btnR.setForeground(Color.black);
			Main.btnR.setBackground(Main.originButtonBG);
		} else if (str.equals("S")) {
			Main.btnS.setForeground(Color.black);
			Main.btnS.setBackground(Main.originButtonBG);
		} else if (str.equals("T")) {
			Main.btnT.setForeground(Color.black);
			Main.btnT.setBackground(Main.originButtonBG);
		} else if (str.equals("U")) {
			Main.btnU.setForeground(Color.black);
			Main.btnU.setBackground(Main.originButtonBG);
		} else if (str.equals("V")) {
			Main.btnV.setForeground(Color.black);
			Main.btnV.setBackground(Main.originButtonBG);
		} else if (str.equals("W")) {
			Main.btnW.setForeground(Color.black);
			Main.btnW.setBackground(Main.originButtonBG);
		} else if (str.equals("X")) {
			Main.btnX.setForeground(Color.black);
			Main.btnX.setBackground(Main.originButtonBG);
		} else if (str.equals("Y")) {
			Main.btnY.setForeground(Color.black);
			Main.btnY.setBackground(Main.originButtonBG);
		} else if (str.equals("Z")) {
			Main.btnZ.setForeground(Color.black);
			Main.btnZ.setBackground(Main.originButtonBG);
		} else if (str.equals("TAB")) {
			Main.btnTab.setForeground(Color.black);
			Main.btnTab.setBackground(Main.originButtonBG);
		} else if (str.equals("CAPS_LOCK")) {
			Main.btnCapslk.setForeground(Color.black);
			Main.btnCapslk.setBackground(Main.originButtonBG);
		} else if (str.equals("BACK_SPACE")) {
			Main.btnBackspace.setForeground(Color.black);
			Main.btnBackspace.setBackground(Main.originButtonBG);
		} else if (str.equals("`")) {
			Main.button.setForeground(Color.black);
			Main.button.setBackground(Main.originButtonBG);
		} else if (str.equals("1")) {
			Main.button_1.setForeground(Color.black);
			Main.button_1.setBackground(Main.originButtonBG);
		} else if (str.equals("2")) {
			Main.button_2.setForeground(Color.black);
			Main.button_2.setBackground(Main.originButtonBG);
		} else if (str.equals("3")) {
			Main.button_3.setForeground(Color.black);
			Main.button_3.setBackground(Main.originButtonBG);
		} else if (str.equals("4")) {
			Main.button_4.setForeground(Color.black);
			Main.button_4.setBackground(Main.originButtonBG);
		} else if (str.equals("5")) {
			Main.button_5.setForeground(Color.black);
			Main.button_5.setBackground(Main.originButtonBG);
		} else if (str.equals("6")) {
			Main.button_6.setForeground(Color.black);
			Main.button_6.setBackground(Main.originButtonBG);
		} else if (str.equals("7")) {
			Main.button_7.setForeground(Color.black);
			Main.button_7.setBackground(Main.originButtonBG);
		} else if (str.equals("8")) {
			Main.button_8.setForeground(Color.black);
			Main.button_8.setBackground(Main.originButtonBG);
		} else if (str.equals("9")) {
			Main.button_9.setForeground(Color.black);
			Main.button_9.setBackground(Main.originButtonBG);
		} else if (str.equals("0")) {
			Main.button_10.setForeground(Color.black);
			Main.button_10.setBackground(Main.originButtonBG);
		} else if (str.equals("-")) {
			Main.button_11.setForeground(Color.black);
			Main.button_11.setBackground(Main.originButtonBG);
		} else if (str.equals("=")) {
			Main.button_12.setForeground(Color.black);
			Main.button_12.setBackground(Main.originButtonBG);
		} else if (str.equals("\\")) {
			Main.button_13.setForeground(Color.black);
			Main.button_13.setBackground(Main.originButtonBG);
		} else if (str.equals("]")) {
			Main.button_14.setForeground(Color.black);
			Main.button_14.setBackground(Main.originButtonBG);
		} else if (str.equals("[")) {
			Main.button_15.setForeground(Color.black);
			Main.button_15.setBackground(Main.originButtonBG);
		} else if (str.equals(";")) {
			Main.button_16.setForeground(Color.black);
			Main.button_16.setBackground(Main.originButtonBG);
		} else if (str.equals("'")) {
			Main.button_17.setForeground(Color.black);
			Main.button_17.setBackground(Main.originButtonBG);
		} else if (str.equals(",")) {
			Main.button_18.setForeground(Color.black);
			Main.button_18.setBackground(Main.originButtonBG);
		} else if (str.equals(".")) {
			Main.button_19.setForeground(Color.black);
			Main.button_19.setBackground(Main.originButtonBG);
		} else if (str.equals("/")) {
			Main.button_20.setForeground(Color.black);
			Main.button_20.setBackground(Main.originButtonBG);
		} else if (str.equals("ENTER")) {
			Main.btnEnter.setForeground(Color.black);
			Main.btnEnter.setBackground(Main.originButtonBG);
		}
	}
}