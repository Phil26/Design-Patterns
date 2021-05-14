
public class Main {

	public static void main(String[] args)
	{
		int noDimensions;
		Select selector;
		Shape shape;
		noDimensions = 1;
		// the selection of the shape is done using noDimensions parameter
		
		selector = new Select(noDimensions);
		shape = selector.selection();
		shape.computeArea();
		System.out.println("Aria formei geometrice selectate este: " + shape.computeArea());
		
		
	}
	
}
