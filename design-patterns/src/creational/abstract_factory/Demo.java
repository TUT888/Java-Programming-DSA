package creational.abstract_factory;

import creational.IOUtils;
import creational.abstract_factory.factory.GUIFactory;
import creational.abstract_factory.factory.MacFactory;
import creational.abstract_factory.factory.WinFactory;

public class Demo {
	public static void main(String[] args) {
		// Get input
		OSType selectedType = IOUtils.readUserInput(OSType.values());
		if (selectedType == null) {
			System.out.println("Invalid type, exiting application.");
			return;
		}

		// Process input
		GUIFactory factory = null;
		switch (selectedType) {
			case OSType.MAC:
				factory = new MacFactory();
				break;
			case OSType.WIN:
				factory = new WinFactory();
				break;
			default:
				System.out.println("Option not found");
				return;
		}

		// Display result
		CrossPlatformApp app = new CrossPlatformApp(factory);
		if (app != null) {
			app.createUI();
			app.renderUI();
		}
	}
}
