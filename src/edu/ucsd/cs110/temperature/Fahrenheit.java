package edu.ucsd.cs110.temperature;

public class Fahrenheit extends Temperature {
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return (new Fahrenheit((float)5/9 * (getValue() - 32)));
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    public String toString()
    {
        return getValue() + " F";
    }
}
