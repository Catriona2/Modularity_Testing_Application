package com.rates;
import java.util.HashMap;
import java.util.Map;

public class ExchangeRateProvider {
    private static final Map<String, Double> rates = new HashMap<>();
      static {
            rates.put("USD_TO_EUR", 0.85);
            rates.put("EUR_TO_USD", 1.18);
        }
        public static double getRate(String from, String to) {
            return rates.getOrDefault(from + "_TO_" + to, -1.0);
        }

}
