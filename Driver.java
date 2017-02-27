package cardGameWithGui;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Driver {
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Card Games");
		frame.setSize(1280, 720);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
