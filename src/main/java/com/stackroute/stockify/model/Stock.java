package com.stackroute.stockify.model;

import javax.persistence.Entity;
import javax.persistence.Id;

// annotate as entity
@Entity
public class Stock {
    // Declare private variable for symbol, name, currency, exchange, mic_code, country, type
    // Annotate symbol as id
    @Id
    private String symbol;
    private String name;
    private String currency;
    private String exchange;
    private String mic_code;
    private String country;
    private String type;
    
    // Create a constructor
    public Stock() {
    }

    // Create a constructor with all the variables
    public Stock(String symbol, String name, String currency, String exchange, String mic_code, String country, String type) {
        this.symbol = symbol;
        this.name = name;
        this.currency = currency;
        this.exchange = exchange;
        this.mic_code = mic_code;
        this.country = country;
        this.type = type;
    }

    // Create getters and setters
    // Getter for symbol
    public String getSymbol() {
        return symbol;
    }

    // Setter for symbol
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for currency
    public String getCurrency() {
        return currency;
    }

    // Setter for currency
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    // Getter for exchange
    public String getExchange() {
        return exchange;
    }

    // Setter for exchange
    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    // Getter for mic_code
    public String getMic_code() {
        return mic_code;
    }

    // Setter for mic_code
    public void setMic_code(String mic_code) {
        this.mic_code = mic_code;
    }

    // Getter for country
    public String getCountry() {
        return country;
    }

    // Setter for country
    public void setCountry(String country) {
        this.country = country;
    }

    // Getter for type

    public String getType() {
        return type;
    }

    // Setter for type

    public void setType(String type) {
        this.type = type;
    }


}
