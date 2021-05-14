import java.util.Scanner;


public class Main
{
    public static void main(String[] args)
    {
    	Source sursa = new Source();
        new Fridge(sursa);
    	new Radio(sursa);
    	new Computer(sursa);
    	
    	Scanner myscan = new Scanner(System.in);
    	System.out.println("Enter a source state: ");
    	sursa.setState(myscan.next());
    	
    }
	
}
