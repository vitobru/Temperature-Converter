// Temp Converter
package tempconvert;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.print("Temperature Converter v0.0.7 by Vitobru\n\nPick an operation:\n[1] Fahrenheit to Celsius\n[2] Celsius to Fahrenheit\n\n");
        
        String exitChoice = new String("");
        Scanner input = new Scanner(System.in);
        
        while (!exitChoice.equals("Exit")) {
            
            System.out.print("Enter operation: ");
            int operation = input.nextInt();
            
            if (operation == 1) {
                System.out.print("Degrees Fahrenheit: ");
                float fahrenheit = input.nextFloat();
                float celsius = ConvertUtil.celsiusFahrenheit(fahrenheit);
                System.out.println(fahrenheit+" degrees Fahrenheit is "+celsius+" degrees in Celsius.");
            }

            else if (operation == 2) {
                System.out.print("Degrees Celsius: ");
                float celsius = input.nextFloat();
                float fahrenheit = ConvertUtil.fahrenheitCelsius(celsius);
                System.out.println(celsius+" degrees Celsius is "+fahrenheit+" degrees in Fahrenheit.");
            }

            else {
                System.out.println("Please input a valid choice");
            }
            
            String reset = new String(input.nextLine());
            System.out.println("Type 'Exit' to quit the converter, or enter anything else to perform another operation.");
            System.out.println("Response: ");
            exitChoice = input.nextLine();
        }
        input.close();
    }
    
}