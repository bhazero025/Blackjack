import java.util.Scanner;

public class ConsoleGame 
{	
	private Scanner kb;
	private Deck deck;
	private Player[] playerArr;
	private Dealer dealer;
	
	public ConsoleGame()
	{
		start();
	}
	
	private void start()
	{		
		this.kb = new Scanner(System.in);
		this.deck = new Deck();
		playerArr = new Player[5];
		for (int i = 0; i < playerArr.length; i++)
		{
			playerArr[i] = new Player("Player_" + i);
		}
		this.dealer = new Dealer();
	
		
		for (int i = 0; i < playerArr.length; i++)
		{
			playerGetCard(playerArr[i]);
			System.out.println("\n\n");
		}
		
		
		//deck.printDeck();

	}
	
	private void playerGetCard(Player a)
	{
		
		a.getCard(deck);
		System.out.println(a.getName() + " draws a card and it is " + a.getLastCard().getName());
		checkAce(a);
	
		a.getCard(deck);
		System.out.println(a.getName() + " also draws " + a.getLastCard().getName());
		
		checkAce(a);

		a.seeCard();
		//choice(a);
	}
	
	private void choice(Player a)
	{
		System.out.println("Would you like to pick another card ? \n1 = Yes\n0 = No");
		
		int choice = kb.nextInt();
		
		if (choice == Player.Action.HIT.ordinal())
		{
			a.getCard(deck);
			a.seeCard();
			checkAce(a);
			choice(a);
		}
		else if (choice == Player.Action.STAND.ordinal())
		{
			System.out.println(a.getName() + " did not pick a card and finished their turn.");
			a.seeCard();
		}
		else
		{
			System.out.println("Wrong option.");
			choice(a);
		}
	}
	
	private void checkAce(Player a)
	{
		if (a.hasAce() != -1)
		{
			if (a.getAceCount() != 0)
			{
				System.out.println(a.getName() + " got an Ace, would you like to change the value from 11 to 1? \n1 = Yes\n0 = No");
				int choice = kb.nextInt();
				
				if (choice == 1)
				{
					a.changeCardValue();
				}
				else
				{
					a.decreaseAceCount();
				}
			}
		}
	}
}
