
public class C3NrToC2Nr 
{

	public C3Nr c3Instance;
	
    public C3NrToC2Nr(C3Nr instance)
    {
    	this.c3Instance = instance;
    }
	
	public int sum(int n1, int n2)
	{
		return c3Instance.sum3(n1, n2, 0);		
	}
	
	
}	

