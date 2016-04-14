public class Card
{
	private String name = "NAME_NOT_SET";
	private volatile int value = -1;
	
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
	
        //TODO fix this.
        public String getImageString()
        {
            //return "C:\\Users\\bruno\\Documents\\NetBeansProjects\\GUI\\card" + this.value + ".png";
            
            return "E:\\GUI\\card" + this.value + ".png" ;
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
			this.value = newValue;
                        //System.out.println("Inside changeValue \n" + "C:\\Users\\bruno\\Documents\\NetBeansProjects\\GUI\\card" + this.value + ".png");
		}
		else
		{
			System.out.println("Can't change value.");
		}
	}
	
	
}
