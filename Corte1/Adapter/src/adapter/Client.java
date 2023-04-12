package adapter;

public class Client {

    public static void main(String[] args) {
        FahrenheitTemperature fahrenheitTemperature = new FahrenheitTemperature(68.0);
        CelsiusTemperature celsiusTemperature = new FahrenheitToCelsiusAdapter(fahrenheitTemperature);
        System.out.println("Fahrenheit temperature: " + fahrenheitTemperature.getTemperature());
        System.out.println("Celsius temperature: " + celsiusTemperature.getCelsiusTemperature());
    }
    
}
