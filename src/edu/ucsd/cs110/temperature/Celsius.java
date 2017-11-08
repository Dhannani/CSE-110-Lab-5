package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature {
    public Celsius(float t) {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {

        return (new Fahrenheit((float)9/5 * getValue() + 32));
    }

    public String toString()
    {

        return getValue() + " C";
    }
}
