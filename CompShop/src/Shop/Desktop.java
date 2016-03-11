package Shop;

import java.util.ArrayList;

public class Desktop extends Computer  {
	
			
			//Declare Properties Of A Desktop
			String CPU;
			String HardDrive; 
			String GraphicCard;
			
			//Constructor
			Desktop(String CPU, String HardDrive, String GraphicCard) {
				
		
				this.CPU =  CPU;
				this.HardDrive = HardDrive;
				this.GraphicCard = GraphicCard;

			}

			public String getCPU () { 
				return CPU;
			}
			public String getHardDrive () {
				return HardDrive;
			}
			public String getGraphicCard () {
				return GraphicCard;
			}

			public static void add(ArrayList<Laptop> laptop) {
				
				
			}
			

	}



