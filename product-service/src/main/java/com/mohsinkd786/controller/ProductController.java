package com.mohsinkd786.controller;

import com.mohsinkd786.vo.Product;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private List<Product> products = new ArrayList<>();

    public ProductController(){
        products.add(new Product(1,"10001",120));
        products.add(new Product(2,"10002",230));
        products.add(new Product(3,"10003",799));
    }

    @GetMapping("/{id}")
    public List<Product> getProducts(@PathVariable String id, HttpServletRequest rq, HttpServletResponse rs) {
        String token = rq.getHeader("token") !=null ? rq.getHeader("token") : "";

        System.out.println("::::: "+token);
        return products;
    }

    @PostMapping
    public void createProduct(@RequestBody Product product) {
        products.add(product);
    }
}
