package com.mohsinkd786.repositories;

import com.mohsinkd786.entities.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product,String> {

    void deleteProductByProductId(String productId);
}
