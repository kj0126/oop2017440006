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
			return "�����ֽ��ϴ�. ";
		else
			return "�����ֽ��ϴ�. ";
					
	}
}