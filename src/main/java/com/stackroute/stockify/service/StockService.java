package com.stackroute.stockify.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.stackroute.stockify.model.Stock;
import com.stackroute.stockify.repository.StockRepo;

// Create a StockService class
// Annotate as service
@Service
public class StockService {

    // Autowire StockRepo class
    @Autowired
    private StockRepo stockRepo;
    
    // Create a method to make a call https://api.twelvedata.com/stocks?country=" + country
    // Use RestTemplate to make the call
    // Return the response
    public Object getStocks(String country) {
        // Create RestTemplate object
        RestTemplate restTemplate = new RestTemplate();
        // Make the call and return the response
        return restTemplate.getForObject("https://api.twelvedata.com/stocks?country=" + country, Object.class);
    }

    // Create a method to make a call https://api.twelvedata.com/time_series?symbol=" + symbol + "&interval=1min&apikey=<<api_key>>&outputsize=20
    // Use RestTemplate to make the call
    // Return the response
    public Object getTimeSeries(String symbol) {
        // Create RestTemplate object
        RestTemplate restTemplate = new RestTemplate();
        // Make the call and return the response
        return restTemplate.getForObject("https://api.twelvedata.com/time_series?symbol=" + symbol + "&interval=1min&apikey=0975893c35e04bc59419ad713796a678&outputsize=20", Object.class);
    }

    // Create a method that stores stock details into database
    // Use StockRepo to save the stock details
    public void saveStock(Stock stock) {
        // Save the stock details
        stockRepo.save(stock);
    }

    // Create a method to get all the stock details from database
    // Use StockRepo to get all the stock details
    public Iterable<Stock> getAllStocks() {
        // Return all the stock details
        return stockRepo.findAll();
    }
}
