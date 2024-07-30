
    // CelsiusTemperature interface
interface CelsiusTemperature {
    double getTemperature();
}

// Concrete implementation of CelsiusTemperature
class CelsiusThermometer implements CelsiusTemperature {
    private double temperature;

    public CelsiusThermometer(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }
}

// FahrenheitThermometer class
class FahrenheitThermometer {
    private double temperature;

    public FahrenheitThermometer(double temperature) {
        this.temperature = temperature;
    }

    public double getFahrenheitTemperature() {
        return temperature;
    }
}

// Adapter class to convert Fahrenheit to Celsius
class FahrenheitToCelsiusAdapter implements CelsiusTemperature {
    private FahrenheitThermometer fahrenheitThermometer;

    public FahrenheitToCelsiusAdapter(FahrenheitThermometer thermometer) {
        this.fahrenheitThermometer = thermometer;
    }

    public double getTemperature() {
        double fahrenheit = fahrenheitThermometer.getFahrenheitTemperature();
        return (fahrenheit - 32) * 5 / 9;
    }
}

// Main class to demonstrate usage
public class Adapter {
    public static void main(String[] args) {
        // Celsius thermometer
        CelsiusTemperature celsiusThermometer = new CelsiusThermometer(25);
        System.out.println("Celsius: " + celsiusThermometer.getTemperature());

        // Fahrenheit thermometer and adapter
        FahrenheitThermometer fahrenheitThermometer = new FahrenheitThermometer(77);
        CelsiusTemperature adapter = new FahrenheitToCelsiusAdapter(fahrenheitThermometer);
        System.out.println("Fahrenheit converted to Celsius: " + adapter.getTemperature());
    }
}
    

