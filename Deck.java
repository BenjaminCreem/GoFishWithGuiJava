package cardGameWithGui;
import java.util.ArrayList;

public class Deck {
	ArrayList<Card> deck = new ArrayList<Card>();
	public Deck()
	{
		for(int i = 2; i <= 14; i++)
		{
			deck.add(new Card(i, "Hearts"));
			deck.add(new Card(i, "Diamonds"));
			deck.add(new Card(i, "Clubs"));
			deck.add(new Card(i, "Spades"));
		}
	}
	
	/**
	 * Runs through the entire deck and swaps each index once. Performs that action 500 times.
	 * 500 times is likely a bit overkill, however it does the job
	 */
	public void shuffle()
	{
		for(int i = 0; i < 500; i++)
		{
			for(int j = 0; j < deck.size(); j++)
			{
				//Random card in specified range formula where a is first number in range and b is second
				//int number = (int) (a + Math.random( ) * (b - a + 1));
				int randomGenCard = (int)(0 + Math.random()*(deck.size() - 0 + 1));
				swap(j, randomGenCard);
			}
		}
	}
	
	/**
	 * Swaps two cards in the deck
	 * @param index of the first card to be swapped
	 * @param index of the second card to be swapped
	 */
	private void swap(int a, int b)
	{
		Card temp = deck.get(a);
		deck.set(a, deck.get(b));
		deck.set(b, temp);
	}
	
	/**
	 * Removes the card at the top of the deck and returns it
	 * @return
	 */
	public Card deal()
	{
		Card c = deck.get(deck.size()-1);
		deck.remove(deck.size()-1);
		return c;
	}
}
