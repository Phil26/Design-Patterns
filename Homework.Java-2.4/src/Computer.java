
public class Computer extends ElectricDevice 
{
	public Computer(Source source)
	{
		this.source = source;
		this.source.Add(this);
	}
	
	public void update()
	{
		System.out.println("The computer is power On.");
	}
	
	
}
