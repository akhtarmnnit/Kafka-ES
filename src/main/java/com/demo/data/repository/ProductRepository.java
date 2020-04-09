package com.demo.data.repository;

import com.demo.data.model.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface ProductRepository extends ElasticsearchCrudRepository<Product, Long> {

    List<Product> findById(String Id);
    List<Product> findBySellerId(String sellerId);
    List<Product> findByTitle(String title);

}
