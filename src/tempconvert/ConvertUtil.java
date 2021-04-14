package tempconvert;

public class ConvertUtil {
    public static float celsiusFahrenheit(Float fahrenheit) {
        float celsius = ((fahrenheit-32)*5/9);
        return celsius;
    }
    
    public static float fahrenheitCelsius(Float celsius) {
        float fahrenheit = ((celsius*9/5)+32);
        return fahrenheit;
    }
}
