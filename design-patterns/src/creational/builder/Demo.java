package creational.builder;

import creational.IOUtils;
import creational.builder.builder.HouseBuilder;
import creational.builder.builder.HousePlanBuilder;
import creational.builder.director.Director;
import creational.builder.house.House;
import creational.builder.house.HousePlan;
import creational.builder.house.HouseType;

public class Demo {
	public static void main(String[] args) {
		Director director = new Director();
		HouseBuilder houseBuilder = new HouseBuilder();
		HousePlanBuilder housePlanBuilder = new HousePlanBuilder();
		
		// Get input
		HouseType selectedType = IOUtils.readUserInput(HouseType.values());
		if (selectedType == null) {
			System.out.println("Invalid type, exiting application.");
			return;
		}
		
		// Process input
		House newHouse = null;
		HousePlan newHousePlan = null;
		switch (selectedType) {
			case HouseType.TINY_HOUSE:
				director.constructTinyHouse(houseBuilder);
				newHouse = houseBuilder.getResult();
				
				director.constructTinyHouse(housePlanBuilder);
				newHousePlan = housePlanBuilder.getResult();
				break;
			case HouseType.STANDARD_HOUSE:
				director.constructStandardHouse(houseBuilder);
				newHouse = houseBuilder.getResult();
				
				director.constructStandardHouse(housePlanBuilder);
				newHousePlan = housePlanBuilder.getResult();
				break;
			case HouseType.LUXURY_HOUSE:
				director.constructLuxuryHouse(houseBuilder);
				newHouse = houseBuilder.getResult();
				
				director.constructLuxuryHouse(housePlanBuilder);
				newHousePlan = housePlanBuilder.getResult();
				break;
			default:
				System.out.println("Option not found");
		}
		
		// Display result
		System.out.println("House: " + newHouse.getHouseType());
		System.out.println("--- House Plan ---");
		newHousePlan.display();
	}
}
