import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class Main 
{

	public static void main(String[] args)
	{
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
        String json = "{\"num1\":10,\"num2\":15}";
        
        C2 c2 = gson.fromJson(json, C2.class);
        C2toC1Adapter adapter = new C2toC1Adapter(c2);
        System.out.println("Sum of num1 and num2 is " +  adapter.getSum() + ".");
	
    }

}
