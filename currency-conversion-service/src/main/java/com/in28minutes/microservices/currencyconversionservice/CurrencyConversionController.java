package com.in28minutes.microservices.currencyconversionservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConversionController {

    @GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversion calculateCurrencyConversion(String from, String to, int quantity) {
        return new CurrencyConversion(1000L, from, to, 65, quantity, quantity * 65, 0);
    }
}
