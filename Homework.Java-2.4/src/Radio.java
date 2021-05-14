
public class Radio extends ElectricDevice
{
	public Radio(Source source)
	{
		this.source = source;
		this.source.Add(this);
	}
	
	public void update()
	{
		System.out.println("The radio is ON.");
	}
	
	
}
