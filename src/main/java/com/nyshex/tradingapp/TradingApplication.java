package com.nyshex.tradingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TradingApplication {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        SpringApplication.run(TradingApplication.class, args);
    }

}
