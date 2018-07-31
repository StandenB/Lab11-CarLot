package lab11Cars;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
	
		ArrayList<Cars> inventory = new ArrayList<>();
		// ArrayList<UsedCar> usedcars = new ArrayList<>();
		
		inventory.add( new Cars("Ford", "Focus", 2018, 34213) );
		inventory.add( new Cars("Chevy", "Malibu", 2018, 32321) );
		inventory.add( new Cars("Dodge", "Ram", 2018, 45789) );
		
		inventory.add ( new UsedCar("Ford", "Fiesta", 2011, 6545, 56149) );
		inventory.add ( new UsedCar("Jeep", "Cherokee", 2002, 2599, 201234) );
		inventory.add ( new UsedCar("Saturn", "Sedan", 2006, 1459, 184231) );
		inventory.add ( new UsedCar("Buick", "Skylark", 1970, 3421, 158234) );
		inventory.add ( new UsedCar("Honda", "Preelude", 1978, 879, 212823) );
		
		
		System.out.println("Welcome to Facebook Java Auto Lot!");
		System.out.println("Our Automotive Inventory Today:");
		
		System.out.println("\n   Make \tModel \tYear \tPrice \t\t Mileage");
		System.out.println("   ===== \t===== \t===== \t=========== \t =======");
		
//		for (int i = 0; i < inventory.size(); i++) {
//			System.out.println((i+1) + ". " + inventory.get(i));
//		}
		printInventory(inventory);
		
		
		
		while (true) {
			System.out.print("\nWhat can I do for you? (list, add, remove, find, quit) ");
			String userChoice = scnr.next();
			
			if ("quit".equalsIgnoreCase(userChoice)) {
				break;
			} 
			else if ("list".equalsIgnoreCase(userChoice)) {
				printInventory(inventory);
			} 
			else if ("add".equalsIgnoreCase(userChoice)) {
				System.out.println("Enter make:");
				String makeTemp = scnr.next();
				System.out.println("Enter model:");
				String modelTemp = scnr.next();
				System.out.println("Enter year:");
				int yearTemp = scnr.nextInt();
				System.out.println("Enter suggested price:");
				double priceTemp = scnr.nextDouble();
				System.out.println("Enter 'new' or 'used':");
				String typeTemp = scnr.next();
					if (typeTemp.equalsIgnoreCase("new")) {
						inventory.add( new Cars(makeTemp, modelTemp, yearTemp, priceTemp));
					}
					else {
						System.out.println("Enter mileage:");
						double mileageTemp = scnr.nextDouble();
						inventory.add( new UsedCar(makeTemp, modelTemp, yearTemp, priceTemp, mileageTemp));
					}
				System.out.println("Added to inventory:");
				System.out.println("A " + yearTemp + " " + makeTemp + " " + modelTemp + "listed for $" + priceTemp);
				//doAdd(scnr, inventory);
			}
			else if ("remove".equalsIgnoreCase(userChoice)) {
				System.out.println("Which lot # vehicle do you want to remove?");
				int lotOut = scnr.nextInt();
				inventory.remove(lotOut - 1);
			} 
			else if ("find".equalsIgnoreCase(userChoice)) {
				System.out.println("Which lot # vehicle do you want to look up?");
				int lotOut = scnr.nextInt();
				System.out.println(inventory.get(lotOut - 1));
			} 
//			else if ("update".equalsIgnoreCase(userChoice)) {
//				System.out.println("What lot # vehicle are you interested in updating?");
//				int lotUpdate = scnr.nextInt();
//				Cars modelTemp = Cars.get(lotUpdate - 1);
//				String modelTemp = inventory.getModel(0);
//				System.out.println("What field do you want to update (price or mileage)?");
//					String fieldUpdate = scnr.next();
//					if (fieldUpdate.equalsIgnoreCase("price")) {
//						System.out.println("Enter new suggested price:");
//						double newPrice = scnr.nextDouble();
//						inventory.set((lotUpdate - 1), newPrice);
//					}
//					else {
//						System.out.println("Enter new mileage:");
//						double mileageTemp = scnr.nextDouble();
//						inventory.set((lotUpdate - 1), UsedCar.setMileage());
//					}
//				System.out.println(inventory.get(lotUpdate - 1));
//			} 
			else {
				System.out.println("Sorry. That's an invalid option.");
			}		
		}
		System.out.println("\nGoodbye.");
		scnr.close();
	}
	
public static void printInventory (ArrayList<Cars> inventory) {
	for (int i = 0; i < inventory.size(); i++) {
		System.out.println((i+1) + ". " + inventory.get(i));
	}
}

}
