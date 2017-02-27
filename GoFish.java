package cardGameWithGui;
import javax.swing.*;
import java.awt.*;

/**
 * Go fish with gui
 * 
 * Stopping work on this for awhile. Have a ton of work in school that won't allow for continued work on this
 * 
 * @author benjamincreem
 *
 */


public class GoFish extends JFrame{
	private JLabel background;
	public GoFish()
	{
		super("Go Fish");
		setLayout(new FlowLayout());
		background = new JLabel("This game is go fish!");
		background.setToolTipText("GO FISH IS FUN!");
		ImageIcon img = new ImageIcon("BackOfCard.jpg");
		background.setIcon(img);
		
		add(background);
	}
}
