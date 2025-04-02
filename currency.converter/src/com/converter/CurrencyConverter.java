package com.converter;
import com.rates.ExchangeRateProvider;
public class CurrencyConverter {
    public static double convert(String from, String to, double amount) {
        double rate = ExchangeRateProvider.getRate(from, to);
        if (rate < 0) {
            throw new IllegalArgumentException("Exchange rate not found for " + from + " to " + to);
        }
        System.out.println("Converting " + amount + " " + from + " to " + to + " → " + rate);
        double amont =rate*amount;
        System.out.println("the euros is "+amont);

        return amont;
    }
}
