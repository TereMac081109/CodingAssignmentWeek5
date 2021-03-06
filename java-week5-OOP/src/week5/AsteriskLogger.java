package week5;

public class AsteriskLogger implements Logger {

	@Override
	public void Log(String textInput) {

		System.out.println("***" + textInput + "***");

	}

	@Override
	public void Error(String textInput) {

		String outputText = "***Error: " + textInput + "***";
		String asteriskBorder = "*".repeat(outputText.length());
		
		System.out.println(asteriskBorder);
		System.out.println(outputText);
		System.out.println(asteriskBorder);
		
	}
}
