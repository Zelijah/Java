package Shop;

import java.util.ArrayList;
import java.util.Scanner;

public class Programme {

	static myInventory ComputerInventory = new myInventory();
	static ArrayList<Desktop>_CurrentDesktops;
	static ArrayList<Laptop> _CurrentLaptops;
	
	
	public static void main(String[] args) {
		System.out.println("-----------------------------------------------------------");
		System.out.println("                       Main Menu");
		System.out.println("		 C	-	Create New Computer" );
		System.out.println(" 		 N	-	Create A New Customer");
		System.out.println(" 		 S	-	Search");
		System.out.println("-----------------------------------------------------------");
	//	System.out.println("Press 'C' to Create Computer");
		
		Scanner input = new Scanner (System.in);
		char ui = Character.toLowerCase(input.nextLine().charAt(0));
		
		//if(ui == 'C') System.out.println("Press 'D' For Desktop or Press 'L' For Laptop");{
			
		//}
		switch(ui)
		{
		case 'c':
			createComputer(input);
			break;
		case 'd':
			System.out.println("Enter Details");
			break;
			default:
				break;
		}
	}
	
		public static void createComputer(Scanner input) {
			
			System.out.println("Press 'L' For Laptop or Press 'D' For Desktop: ");
			Scanner input1 = new Scanner (System.in);
			char ui = Character.toLowerCase(input1.nextLine().charAt(0));
			
			System.out.println("Enter ScreenSize: ");
			String Screen = input1.nextLine();
			System.out.println("Enter Weight: ");
			String Weight = input1.nextLine();
			System.out.println("Enter Battery Life: ");
			String Battery = input1.nextLine();
			
			
			
			System.out.println("Enter CPU: ");
			String cpu = input1.nextLine();
			System.out.println("Enter HDD: ");
			String hdd = input1.nextLine();
			System.out.println("Enter Graphics: ");
			String graphics = input1.nextLine();
			
			ComputerInventory.createLaptop(Screen, Weight, Battery, cpu, hdd, graphics);
			_CurrentLaptops = ComputerInventory.retrievelaptop();
			
			System.out.println();
		}
		
		
	
}
	

		
		


