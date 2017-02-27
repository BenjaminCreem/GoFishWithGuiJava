package cardGameWithGui;

import java.awt.*;
import javax.swing.*;

/**
 * Basic card class. Values are ranged from 2 to 14, where 11 is a Jack,
 * 12 is a Queen, 13 is a King and 14 is an Ace. Suits are Hearts, Diamonds,
 * Clubs, and Spades. 
 * @author Benjamin Creem
 *
 */
public class Card extends JFrame{
	private ImageIcon back = new ImageIcon("BackOfCard.jpg");
	private ImageIcon front;
	private int value;
	private String suit;
	public Card(int v, String s)
	{
		value = v;
		suit = s;
		front = new ImageIcon(toString());
	}
	public int Value()
	{
		return value;
	}
	public String Suit()
	{
		return suit;
	}
	public String toString()
	{
		//If the value is between 2 and 10, we can return the value + string
		if(value >= 2 && value <= 10)
		{
			return value + " of " + suit;
		}
		//If card is a jack or queen or king or ace
		else if(value == 11)
		{
			return "Jack of " + suit;
		}
		else if(value == 12)
		{
			return "Queen of " + suit;
		}
		else if(value == 13)
		{
			return "King of " + suit;
		}
		else if(value == 14)
		{
			return "Ace of " + suit;
		}
		else
		{
			return "Not a possible card";
		}
	}
	public ImageIcon back()
	{
		return back;
	}
}








