
public class C2toC1Adapter 
{
  public C2 c2Instance;
   
   
   public C2toC1Adapter(C2 c2Instance)
   {
	   this.c2Instance = c2Instance;
   }
   
   public int getSum()
   {
	  return c2Instance.GetSum(); 
   }
  
   
   	
}
