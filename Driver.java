package cardGameWithGui;
import javax.swing.*;
import java.awt.*;

public class Driver extends JFrame{
	public static void main(String[] args)
	{
		GoFish goFish = new GoFish();
		goFish.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		goFish.setSize(500, 500);
		goFish.setVisible(true);
	}
}
