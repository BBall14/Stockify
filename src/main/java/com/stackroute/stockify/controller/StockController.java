package com.stackroute.stockify.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.stockify.model.Stock;
import com.stackroute.stockify.service.StockService;

// Create a Controller class
// Annotate with controller annotation
@RestController
public class StockController {

    // autowire service class
    @Autowired
    private StockService stockService;


    // Create a get mapping method to get country path variable
    // return the response entity
    @GetMapping("/stock/{country}")
    public ResponseEntity<?> getStockByCountry(@PathVariable String country) {
        return new ResponseEntity<>(stockService.getStocks(country), HttpStatus.OK);
    }

    // Create a get mapping method to get symbol path variable
    // return the response entity
    @GetMapping("/timeseries/{symbol}")
    public ResponseEntity<?> getStockBySymbol(@PathVariable String symbol) {
        return new ResponseEntity<>(stockService.getTimeSeries(symbol), HttpStatus.OK);
    }

    // Create a post mapping to save stock details
    // return the response entity
    @PostMapping("/stock")
    public ResponseEntity<?> saveStock(@RequestBody Stock stock) {
        stockService.saveStock(stock);
        return new ResponseEntity<>("Stock saved successfully", HttpStatus.CREATED);
    }

    // Create a get mapping method to get all the stock details
    // return the response entity
    @GetMapping("/stocks")
    public ResponseEntity<?> getAllStocks() {
        return new ResponseEntity<>(stockService.getAllStocks(), HttpStatus.OK);
    }
    
}
