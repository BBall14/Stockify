package com.stackroute.stockify;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.stackroute.stockify.service.StockService;

@SpringBootTest
class StockifyApplicationTests {

	@Autowired
	StockService stockService;

	@Test
	void contextLoads() {
	}

}
