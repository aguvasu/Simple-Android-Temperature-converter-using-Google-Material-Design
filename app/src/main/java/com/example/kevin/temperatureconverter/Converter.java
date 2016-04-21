package com.example.kevin.temperatureconverter;
/**
 * Created by kevin on 21/04/16.
 */
public class Converter {
    public static double fahrenheit(double f) {

        return (32 + f) * 9/5;
    }

    public  static  double celcius(double c) {

        return (c - 32) * 5/9;
    }
}