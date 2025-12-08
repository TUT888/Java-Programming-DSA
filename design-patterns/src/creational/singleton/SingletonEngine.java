package creational.singleton;

public class SingletonEngine {
	private static SingletonEngine instance;
	private String name;
	private boolean isRunning;
	
	private SingletonEngine() {
		this.setName("SINGLETON");
		this.isRunning = false;
	}
	
	public static SingletonEngine getInstance() {
		if (instance == null) {
			instance = new SingletonEngine();
		}
		return instance;
	}

	public boolean isRunning() {
		return isRunning;
	}

	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}
	
	public void toggle() {
		this.isRunning = !isRunning;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name + " - running: " + this.isRunning;
	}
}
