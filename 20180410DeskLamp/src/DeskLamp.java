public class DeskLamp {

	private boolean isOn;
	
	public void turnOn() {
		
		isOn = true;
		
	}
	
	public void turnOff() {
		
		isOn = false;
		
	}
	
	public String toString() {
		
		if(isOn)
			return "켜져있습니다. ";
		else
			return "꺼져있습니다. ";
					
	}
}