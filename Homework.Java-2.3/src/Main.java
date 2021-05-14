
public class Main 
{

	public static void main(String[] args)
	{
		C2Nr c2 = new C2Nr();
		System.out.println(c2.sum2(1, 2));
		
		C3Nr c3 = new C3Nr();
		System.out.println(c3.sum3(1,2,3));
		
		C3NrToC2Nr adapter = new C3NrToC2Nr(c3);
		System.out.println(adapter.sum(1, 2));
	
	}
	
	
}
