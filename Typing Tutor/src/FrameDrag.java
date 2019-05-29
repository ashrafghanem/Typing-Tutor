import java.awt.Cursor;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class FrameDrag extends MouseAdapter implements MouseMotionListener {
	private final JFrame frame;
	private Point mouseDownCompCoords = null;

	public FrameDrag(JFrame frame) {
		this.frame = frame;
	}

	public void mouseEntered(MouseEvent e) {
		frame.getRootPane().setCursor(new Cursor(Cursor.HAND_CURSOR));
	}

	public void mouseExited(MouseEvent e) {
		frame.getRootPane().setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	}

	public void mouseDragged(MouseEvent e) {
		Point currCoords = e.getLocationOnScreen();
		frame.setLocation(currCoords.x - mouseDownCompCoords.x, currCoords.y - mouseDownCompCoords.y);
	}

	public void mouseReleased(MouseEvent e) {
		mouseDownCompCoords = null;
	}

	public void mousePressed(MouseEvent e) {
		mouseDownCompCoords = e.getPoint();
	}
}
