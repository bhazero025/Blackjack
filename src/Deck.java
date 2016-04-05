import java.util.ArrayList;
import java.util.Collections;

public class Deck 
{
	private ArrayList<Card> DECK = new ArrayList<Card>();
	
	public Deck()
	{
		DECK = createDeck();
	}
	
	public Deck(int debug)
	{
		DECK = createDeckCheat(debug);
	}
	
	public int getDeckSize()
	{
		return this.DECK.size();
	}
	
	public Card getNextCard()
	{
		// TODO Check if we are on the last card.
		Card giveToPlayer = DECK.get(0);
		
		DECK.remove(0);
		
		return giveToPlayer;
	}
	
	public void printDeck()
	{
		for (int i = 0; i < DECK.size(); i++)
		{
			System.out.println(DECK.get(i).getName());
		}
	}

	private ArrayList<Card> shuffle(ArrayList<Card> deck)
	{
		Collections.shuffle(deck); // No need to re invent the wheel.
		return deck;
	}
	
	private ArrayList<Card> createDeck()
	{
		ArrayList<Card> deck = new ArrayList<Card>();
		
		for (int i = 0; i < 4; i++)
		{
			deck.add(new Card(2));
		}
		for (int i = 0; i < 4; i++)
		{
			deck.add(new Card(3));
		}
		for (int i = 0; i < 4; i++)
		{
			deck.add(new Card(4));
		}
		for (int i = 0; i < 4; i++)
		{
			deck.add(new Card(5));
		}
		for (int i = 0; i < 4; i++)
		{
			deck.add(new Card(6));
		}
		for (int i = 0; i < 4; i++)
		{
			deck.add(new Card(7));
		}
		for (int i = 0; i < 4; i++)
		{
			deck.add(new Card(8));
		}
		for (int i = 0; i < 4; i++)
		{
			deck.add(new Card(9));
		}
		for (int i = 0; i < 16; i++)
		{
			deck.add(new Card(10));
		}
		for (int i = 0; i < 4; i++)
		{
			deck.add(new Ace(11));
		}
		
		return shuffle(deck);
	}
	
	private ArrayList<Card> createDeckCheat(int num)
	{
		ArrayList<Card> deck = new ArrayList<Card>();
		
		if (num == 11)
		{
			for (int i = 0; i < 52; i++)
			{
				deck.add(new Ace(num));
			}
		}
		else
		{
			for (int i = 0; i < 52; i++)
			{
				deck.add(new Card(num));
			}
		}

		return shuffle(deck);
	}
}
