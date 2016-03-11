package Shop;

public class Laptop extends Desktop {
	private String ScreenSize;
	private String Weight;
	private String BatteryLife;
	
	//Constructor From Desktop
	Laptop(String ScreenSize, String Weight, String BatteryLife, String CPU, String HardDrive, String GraphicCard) {
		super(CPU, HardDrive, GraphicCard);
		this.ScreenSize = ScreenSize;
		this.Weight = Weight;
		this.BatteryLife = BatteryLife;
		
	}
	//Declare Variables Of Laptop


	//Get All The Values 
	public String getScreenSize () {
		return ScreenSize;
	}
	public String getWeight () { 
		return Weight;
	}
	public String BatteryLife () { 
		return BatteryLife;
	}
	
	
	
}
	

