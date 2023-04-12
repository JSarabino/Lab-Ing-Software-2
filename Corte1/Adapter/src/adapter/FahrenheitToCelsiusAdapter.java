package adapter;

public class FahrenheitToCelsiusAdapter implements CelsiusTemperature {
    private FahrenheitTemperature fahrenheitTemperature;

    public FahrenheitToCelsiusAdapter(FahrenheitTemperature fahrenheitTemperature) {
        this.fahrenheitTemperature = fahrenheitTemperature;
    }

    @Override
    public double getCelsiusTemperature() {
        double fahrenheitTemp = fahrenheitTemperature.getTemperature();
        return (fahrenheitTemp - 32) * 5 / 9;
    }
}
