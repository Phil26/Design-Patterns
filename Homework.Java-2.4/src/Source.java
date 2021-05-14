import java.util.List;
import java.util.ArrayList;

public class Source 
{
    private List<ElectricDevice> devices = new ArrayList<ElectricDevice>();
    
    private String state;
    
    public void Add(ElectricDevice device)
    {
    	devices.add(device);
    }
    
    public String getState()
    {
    	return this.state;
    }
	
	private void NotifyDevices()
	{
		for(ElectricDevice device: devices)
		{
			device.update();
		}
	}
	
	public void setState(String State)
	{
		this.state = State;
		NotifyDevices();
	}
	
	
	
}
