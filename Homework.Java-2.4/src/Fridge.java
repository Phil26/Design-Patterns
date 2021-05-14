
public class Fridge extends ElectricDevice 
{
	public Fridge(Source source)
	{
		this.source = source;
	    this.source.Add(this);
	}
	
	public void update()
	{
		System.out.println("Power source conected.The fridge is ON now.");
	}
	
}
