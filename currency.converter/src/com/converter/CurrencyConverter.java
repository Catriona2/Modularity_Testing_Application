package com.converter;
import com.rates.ExchangeRateProvider;
import java.util.Scanner;
public class CurrencyConverter {

    public static double convert(String from, String to, double amount) {
        Scanner money= new Scanner(System.in);
        System.out.println("Enter your Amount to change in dollars");
       // double moneyIndor=money.nextDouble();
       // moneyIndor =amount;

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
