package com.demo.controllers;



import com.demo.data.model.Product;
import com.demo.data.repository.ProductRepository;
import com.demo.engine.ProductProducer;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/product")
public class ApplicationController {
    @Autowired
    ProductRepository repository;

    private static final Logger logger = LoggerFactory.getLogger(ApplicationController.class);

    private final ProductProducer producer;

    @Autowired
    ApplicationController(ProductProducer producer) {
        this.producer = producer;
    }

    @PostMapping(path= "/", consumes = "application/json")
    public ResponseEntity<Object> addProduct(@RequestBody Product product)  throws Exception

    {
        logger.info(product.toString());
        this.producer.send(new Gson().toJson(product));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    @PutMapping(path= "/", consumes = "application/json")
    public ResponseEntity<Object> updateProduct(@RequestBody Product product)  throws Exception

    {
        this.producer.send(new Gson().toJson(product));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    @GetMapping("/{Id}")
    public List<Product> findById(@PathVariable("Id") String Id) {
        return repository.findById(Id);
    }

    @GetMapping("/seller/{Id}")
    public List<Product> findBySellerId(@PathVariable("sellerId") String sellerId) {
        return repository.findBySellerId(sellerId);
    }

    @GetMapping("/organization/{title}")
    public List<Product> findByTitle(@PathVariable("title") String title) {
        return repository.findByTitle(title);
    }
}
