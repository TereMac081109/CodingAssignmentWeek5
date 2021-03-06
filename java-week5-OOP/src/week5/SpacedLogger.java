package week5;

public class SpacedLogger implements Logger {

	@Override
	public void Log(String textInput) {
	
		System.out.println(buildTextInput(textInput));
	}
	
	private String buildTextInput(String textInput) {
		
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0; i < textInput.length(); i += 1) {
			builder.append(textInput.charAt(i)).append(" ");
		}
		
		builder.deleteCharAt(builder.length() - 1);
		return builder.toString();
	}
	
	@Override
	public void Error(String textInput) {

		System.out.println("ERROR: " + buildTextInput(textInput));
	}
	
}
