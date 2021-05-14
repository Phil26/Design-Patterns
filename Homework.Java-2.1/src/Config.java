

public class Config {

	private static String               color;
	private static String                weight;
	private static Config        configInstance;
	
	private Config()
	{
		System.out.println("A config instance was created!");
	}
	
	public static Config getConfigInstance()
	{
		if(configInstance == null)
		{
			configInstance = new Config();
		}
		return configInstance;
		
	}

	
    public static String getColor()
   {
	  return configInstance.color;
   }
    
    public void setColor(String color)
    {
    	configInstance.color = color;
    }
	
    public static String getWeight()
   {
	   return configInstance.weight;
   }

    public void setWeight(String weight)
    {
    	configInstance.weight = weight;
    }
	
}
