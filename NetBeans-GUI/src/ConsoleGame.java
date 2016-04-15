import java.util.Scanner;

public class ConsoleGame 
{	
	private Scanner kb;
	private Deck deck;
	private Player[] playerArr;
	private Dealer dealer;
	private int NUMBER_OF_PLAYERS;
        
	public ConsoleGame()
	{
		
	}
	
	public void start()
	{		
		this.kb = new Scanner(System.in);
		this.deck = new Deck(4, false);
		this.playerArr = new Player[5];
                this.NUMBER_OF_PLAYERS = 5;
		for (int i = 0; i < playerArr.length; i++)
		{
			this.playerArr[i] = new Player("Player_" + i, i);
		}
		this.dealer = new Dealer();

                // Player draws first card
		for (int i = 0; i < playerArr.length; i++)
		{
			playerGetCard(playerArr[i]);
			System.out.println("\n\n");
		}
		
                // Dealer draws first card
		dealerGetCard(dealer);
		
                // Player draws second card
                for (int i = 0; i < playerArr.length; i++)
		{
			playerGetCard(playerArr[i]);
			System.out.println("\n\n");
		}
		
                // Dealer draws second card
		dealerGetCard(dealer);
                
                // Check for blackjack
                for (int i = 0; i < playerArr.length; i++)
                {
                    playerArr[3].allowCheat();
                    checkBlackJack(playerArr[i], dealer);
                }
                
                // Player choice to draw or not
		for (int i = 0; i < playerArr.length; i++)
		{
                        if (playerArr[i].isAlive())
                        {
                            	choice(playerArr[i]);
                        }
			System.out.println("\n\n");
		}
		
		// Now Dealer gets his card
		dealerCheckDraw(dealer);
		
                dealer.seeCard();
		checkWinner(playerArr, dealer);
	}
	
        private void checkBlackJack(Player a, Dealer b)
        {
            // if player has blackjack and dealer does not
            if (a.hasBlackJack() && (!b.hasBlackJack()))
            {
                System.out.println(a.getName() + " has won the game with blackjack.\n\n");
                removePlayer(a);
            }
            // if there is a tie
            else if (a.hasBlackJack() && b.hasBlackJack())
            {
                System.out.println(a.getName() + " ties the game.\n\n");
                removePlayer(a);
            }
            // if the delaer wins 
            else if ((!a.hasBlackJack()) && b.hasBlackJack())
            {
                System.out.println(a.getName() + " lost the game.\n\n");
                removePlayer(a);
            }
        }
        
        private void removePlayer(Player a)
        {
            for (int i = 0; i < this.playerArr.length; i++)
            {
                if (playerArr[i].getId() == a.getId())
                {
                    a.setAlive(false);
                    this.NUMBER_OF_PLAYERS--;
                }
            }
        }
        
	// TODO checkWinner
	private void checkWinner(Player[] a, Dealer b)
	{
            for (int i = 0; i < a.length; i++)
            {
                
                if (a[i].isAlive() && b.getPoints() < Player.MAX_POINTS)
                {
                    if (a[i].getPoints() > Player.MAX_POINTS)
                    {
                        System.out.println(a[i].getName() + " lost with " + a[i].getPoints() + " points.");
                    }
                    else if (a[i].getPoints() > b.getPoints())
                    {
                        System.out.println(a[i].getName() + " won with " + a[i].getPoints() + " points.");
                    }
                    else if (a[i].getPoints() < b.getPoints())
                    {
                        System.out.println(a[i].getName() + " lost with " + a[i].getPoints() + " points.");
                    }
                    else
                    {
                        System.out.println(a[i].getName() + " tied with " + a[i].getPoints() + " points.");
                    }
                }
                else
                {
                    // if delaer bust
                    if (b.getPoints() > Player.MAX_POINTS)
                    {
                        if (a[i].getPoints() < Player.MAX_POINTS)
                        {
                            System.out.println(a[i].getName() + " won with " + a[i].getPoints() + " points.");
                        }
                    }
                }
            } 
            
            System.out.println("Would you like to play again ? \n1 = Yes\n0 = No");
            if (kb.nextInt() == 1)
            {
                this.start();
            }
	}
	
	private void dealerCheckDraw(Dealer a) 
	{
		if (a.getPoints() < Dealer.DRAW_AGAIN)
		{
			a.getCard(deck);
		}
	}

	private void dealerGetCard(Dealer a)
	{
		a.getCard(deck);
                if (a.getNumberOfCards() != 1)
                {
                    System.out.println(a.getName() + " draws a card and it is " + a.getLastCard().getName());
                }
                else
                {
                    // Just to debug
                    System.out.println("Delaer secret is " + a.getLastCard().getName() + "\n\n"); 
                }
	}
	
	private void playerGetCard(Player a)
	{
		
		a.getCard(deck);
		System.out.println(a.getName() + " draws a card and it is " + a.getLastCard().getName());
		checkAce(a);
	
		/*a.getCard(deck);
		System.out.println(a.getName() + " also draws " + a.getLastCard().getName());
		checkAce(a);*/

		a.seeCard();
		//choice(a);
	}
	
	private void choice(Player a)
	{
                if (a.getPoints() > 21)
                {
                    return;
                }
                a.seeCard();
		System.out.println(a.getName() + " Would you like to pick another card ? \n1 = Yes\n0 = No");
		
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
                                a.seeCard();
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
