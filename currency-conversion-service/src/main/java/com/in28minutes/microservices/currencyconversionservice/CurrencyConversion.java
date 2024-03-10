package com.in28minutes.microservices.currencyconversionservice;

public class CurrencyConversion {

    private Long id;
    private String from;
    private String to;
    private int conversionMultiple;
    private int quantity;
    private int totalCalculatedAmount;
    private int environment;

    public CurrencyConversion() {
    }

    public CurrencyConversion(Long id, String from, String to, int conversionMultiple, int quantity, int totalCalculatedAmount, int environment) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
        this.quantity = quantity;
        this.totalCalculatedAmount = totalCalculatedAmount;
        this.environment = environment;
    }

    public Long getId() {
        return id;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public int getConversionMultiple() {
        return conversionMultiple;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getTotalCalculatedAmount() {
        return totalCalculatedAmount;
    }

    public int getEnvironment() {
        return environment;
    }
}
