// Temp Converter
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Temperature Converter v0.0.1 by Vitobru");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter degrees Fahrenheit:");
        float fahrenheit = input.nextFloat();
        float result = fahrenheitCelsius(fahrenheit);
        System.out.println(result);

        input.close();
    }

    public static float fahrenheitCelsius(Float fahrenheit) {
        float celsius = ((fahrenheit-32)*5/9);
        return celsius;
    }
}
