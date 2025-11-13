package h3;

public class H3_main {
	public static void main(String[] args) {
	float celsiusFloat=14.2f, fahrenheitFloat=35.0f;
	double celsiusDouble=14.2, fahrenheitDouble=10.4;
	
	fahrenheitFloat=celsiusFloat* 9/5 +32;
	fahrenheitDouble=celsiusDouble* 9/5 +32;
	
	
	System.out.println("Mit den Float Variablen werden "+celsiusFloat+" Celsius zu "+fahrenheitFloat+" Fahrenheit.");
	System.out.println("Mit den Double Variablen werden "+celsiusDouble+" Celsius zu "+fahrenheitDouble+" Fahrenheit.");
	
	}
	
}
