import java.util.Scanner;
public class CelsiusFahrenheit{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
			System.out.print("Enter temperature in Celsius: ");
			float celsius = scanner.nextFloat();
			float fahrenheit = (celsius * 9/5) + 32;
			System.out.println("The " + celsius + " celsius is " + fahrenheit + " fahrenheit" );
			scanner.close();
			
		}
	}
	

      