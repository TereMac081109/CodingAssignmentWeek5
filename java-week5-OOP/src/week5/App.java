package week5;

public class App {

	public static void main(String[] args) {
		
		Logger asteriskLogger = new AsteriskLogger();
		
		Logger spacedLogger = new SpacedLogger();
		
		asteriskLogger.Log("Hi there!");
		asteriskLogger.Error("Hi there!");
		
		spacedLogger.Log("Welcome");
		spacedLogger.Error("Welcome");
		
	}

}
