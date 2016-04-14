import java.util.ArrayList;

public class Player
{
	private String name;
	private ArrayList<Card> cardsInHand;
	private int points;
	private final int MAX_POINTS = 21;
	private boolean isAlive;
	private int aceCount;
	
	public static enum Action {STAND, HIT, NOTHING};
	
	public Player(String name)
	{
		this.name = name;
		this.cardsInHand = new ArrayList<Card>();
		this.points = 0;
		this.isAlive = true;
		this.aceCount = 0;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void getCard(Deck deck)
	{
		Card next = deck.getNextCard();
		//System.out.println("Get card = " + next.getName());
		
		if (next instanceof Ace)
		{
			aceCount++;
		}
		
		cardsInHand.add(next);
		
		points += next.getValue();
		
		if (points > MAX_POINTS)
		{
			this.isAlive = false;
		}
	}
	
	public void changeCardValue()
	{
		//Find the Ace
		if (this.hasAce() != -1)
		{
                        
			cardsInHand.get(this.hasAce()).changeValue(1);
			this.points -= 10;
			aceCount--;
		}
	}
	
	public int getAceCount()
	{
		return this.aceCount;
	}
        
        public int getNumberOfCards()
        {
            return this.cardsInHand.size();
        }
	
	public int getPoints()
	{
		return this.points;
	}
	
	public boolean isAlive()
	{
		return this.isAlive;
	}
	
	public Card getLastCard()
	{
		return cardsInHand.get(cardsInHand.size() - 1);
	}
	
	public void seeCard()
	{
		System.out.println(this.name + " has " + cardsInHand.size() + " cards.");
		for (int i = 0; i < cardsInHand.size(); i++)
		{
			System.out.println(cardsInHand.get(i).getName());
		}
		System.out.println(this.name + " has " + this.getPoints() + " points.");
	}
	
	public int hasAce()
	{
            int biggestAce = -1;
		for (int i = 0; i < cardsInHand.size(); i++)
		{
			if (cardsInHand.get(i) instanceof Ace)
			{
                                biggestAce = i;
			}
		}
		
		return biggestAce;
	}
	
	public void decreaseAceCount()
	{
		this.aceCount--;
	}
	
}
