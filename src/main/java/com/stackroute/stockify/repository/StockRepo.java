package com.stackroute.stockify.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.stockify.model.Stock;

// Create stock repo interface
// Annotate as repository
@Repository
public interface StockRepo extends JpaRepository<Stock, String> {
    
}
