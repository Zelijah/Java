package Shop;

import java.awt.List;
import java.util.ArrayList;

public class myInventory {
	
		//ArrayList<Computer> CompList = new ArrayList<Computer>();
		
		ArrayList<Laptop> laptop = new ArrayList<Laptop>();
		
		ArrayList<Desktop> desktop = new ArrayList<Desktop>();
		
						
		//create laptop
		public void createLaptop(String ScreenSize, String Weight,String BatteryLife, String CPU, String HardDrive, String GraphicCard) {
			//System.out.print(laptop.size());		
			laptop.add(new Laptop(ScreenSize, Weight, BatteryLife,CPU, HardDrive, GraphicCard));
			//System.out.print(laptop);
		}
		
		
		public ArrayList<Laptop> retrievelaptop() {
			return laptop;
		}
		
		public void createDesktop(String CPU, String Hardware, String GraphicCard ) {
			
			Desktop dsk = new Desktop(CPU, Hardware, GraphicCard);
			desktop.add(dsk);
		}
		
		/*public ArrayList<Desktop> retrieveComputer(){
			for (Computer c : CompList)
				if(c instanceof Desktop) {
					desktop.add((Desktop) c);
					return desktop;
				}
			return null;
				}
		*/
		}
		



