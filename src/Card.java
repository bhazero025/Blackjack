public class Card
{
	private String name = "NAME_NOT_SET";
	private int value = -1;
	
	public Card(String name, int value)
	{
		this.name = name;
		this.value = value;
	}
	
	public Card(int value)
	{
		this.name = "CARD_NAME: " + Integer.toString(value);
		this.value = value;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getValue()
	{
		return this.value;
	}
	
	public void changeValue(int newValue)
	{
		if (this instanceof Ace)
		{
			value = newValue;
		}
		else
		{
			System.out.println("Can't change value.");
		}
	}
	
	
}
