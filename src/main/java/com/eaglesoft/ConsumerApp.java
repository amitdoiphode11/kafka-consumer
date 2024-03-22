package com.eaglesoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class ConsumerApp {

    public static void main(String[] args) throws Exception{
        SpringApplication.run(ConsumerApp.class, args);
    }

}
