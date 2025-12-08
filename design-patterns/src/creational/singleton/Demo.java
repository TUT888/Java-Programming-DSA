package creational.singleton;

public class Demo {
	public static void main(String[] args) {
		SingletonEngine instance1 = SingletonEngine.getInstance();
		System.out.println("Instance 1 created: " + instance1.toString());
		instance1.toggle();
		System.out.println("Toggled instance 1: " + instance1.toString());
		instance1.setName("RENAMED");
		System.out.println("Renamed instance 1: " + instance1.toString());
		
		System.out.println();
		SingletonEngine instance2 = SingletonEngine.getInstance();
		System.out.println("Instance 2 created: " + instance2.toString());
		instance2.toggle();
		System.out.println("Toggled instance 2: " + instance2.toString());
		System.out.println("Instance 1: " + instance1.toString());
	}
}
