package creational.factory_method;

import creational.IOUtils;
import creational.factory_method.creator.Logistic;
import creational.factory_method.creator.RoadLogistic;
import creational.factory_method.creator.SeaLogistic;

public class Demo {
	public static void main(String[] args) {
		// Select choice
		DeliveryType selectedType = IOUtils.readUserInput(DeliveryType.values());
		if (selectedType == null) {
			System.out.println("Invalid type, exiting application.");
			return;
		}
		
		// Process input
		Logistic logistic = null;
		switch (selectedType) {
			case DeliveryType.ROAD:
				logistic = new RoadLogistic();
				break;
			case DeliveryType.SEA:
				logistic = new SeaLogistic();
				break;
			default:
				System.out.println("Option not found");
				return;
		}
		
		// Display result
		if (logistic != null) {
			logistic.planDelivery();
		}
	}
}
