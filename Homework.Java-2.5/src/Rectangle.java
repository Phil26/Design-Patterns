
public class Rectangle implements Shape 
{

	public static int noDimensions = 2;
	public float height;
	public float width;
	
	public Rectangle()
	{
		
	}
	
	public Rectangle(float height, float width)
	{
		this.height = height;
		this.width = width;
	}
	
	@Override
	public float computeArea()
	{
		return this.height * this.width;
	}
	
	
}
