
public class Select 
{
	private int shapeSelect;
	
	public Select(int shapeSelect)
	{
		super();
		this.shapeSelect = shapeSelect;	
	}
	
    public Shape selection()
    {
    	if(shapeSelect == Rectangle.noDimensions)
    	{
    		return new Rectangle(2,3);
    	}
    	else
    	{
    		return new Circle(4);
    	}
    }
	
}
