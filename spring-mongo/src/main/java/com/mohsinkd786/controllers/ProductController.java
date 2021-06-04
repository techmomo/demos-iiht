package com.mohsinkd786.controllers;

import com.mohsinkd786.dtos.ProductDto;
import com.mohsinkd786.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/products")
@RestController
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping
    public List<ProductDto> findAll(){
        return productService.findAll();
    }

    @PostMapping
    public ProductDto createProduct(@RequestBody ProductDto product){
        return productService.createProduct(product);
    }

    @DeleteMapping("{id}")
    public boolean deleteProduct(@PathVariable String id){
        productService.deleteProduct(id);
        return true;
    }
}
