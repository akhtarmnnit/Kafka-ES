package com.demo.engine;

import com.demo.data.model.Product;
import com.demo.data.repository.ProductRepository;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Service
public class ProductConsumer {
    @Autowired
    ProductRepository repository;

    private final Logger logger = LoggerFactory.getLogger(ProductConsumer.class);

    @KafkaListener(topics = "users", groupId = "group_id")
    public void consume(String message) throws IOException {
        logger.info(String.format("#### -> Consumed message -> %s", message));
        logger.info("Processing to store data in ES");
        // Creating a Gson Object
        Gson gson = new Gson();

        // Converting json to object
        // first parameter should be prpreocessed json
        // and second should be mapping class
        Product product
                = gson.fromJson(message,
                Product.class);
        repository.save(product);

    }
}
