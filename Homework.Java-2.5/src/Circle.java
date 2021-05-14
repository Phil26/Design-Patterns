import java.lang.Math;


public class Circle implements Shape 
{

	public int noDimensions = 1;
	public float radius;
	
	public Circle()
	{
		
	}
	
	public Circle(float radius)
	{
		this.radius = radius;
	}
	
	@Override
	public float computeArea()
	{
		return (float) (Math.PI * Math.pow(radius, 2));
	}
	
	
}
