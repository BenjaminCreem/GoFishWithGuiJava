package cardGameWithGui;
import java.util.ArrayList;

/**
 * Hand for a player. Similar to deck class
 * @author benjamincreem
 */
public class Hand {
	private ArrayList<Card> hand = new ArrayList<Card>();
	public Hand()
	{
		//All hands are empty upon creation
	}
	
	/**
	 * Adds a card to the hand
	 * @param c - card to be added to hand
	 */
	public void add(Card c)
	{
		hand.add(c);
	}
	
	/**
	 * Removes the card at the specified index and returns it 
	 * @param i index that the card is at
	 * @return the card that is removed
	 */
	public Card removeAtIndex(int i)
	{
		Card c = hand.get(i);
		hand.remove(i);
		return c;
	}
	
	/**
	 * If a hand has 2 cards of the same value (3 of hearts and 3 of spades), then this method will remove those cards
	 * @return - the number of cards removed divided by 2
	 */
	public int removeIfSame()
	{
		int i = 0;
		int numRemoved = 0;
		boolean found;
		int j;
		//Continue to go through the hand until all matches are found and removed
		while(i < hand.size()-1 && hand.size() > 0)
		{
			found = false;
			j = i + 1;
			while((!found && j < hand.size()) && hand.size() != 0)
			{
				if(hand.get(i).Value() == hand.get(j).Value())
				{
					found = true;
					hand.remove(i);
					hand.remove(j-1);
					numRemoved++;
					i = -1;
				}
				j++;
			}
			i++;
		}
		return numRemoved;
	}
	
	/**
	 * Returns the card at the specified index
	 * @param i - the specified index
	 * @return
	 */
	public Card cardAt(int i)
	{
		return hand.get(i);
	}
	
	/**
	 * Returns the size of the arraylist hand
	 * @return
	 */
	public int size()
	{
		return hand.size();
	}
}








