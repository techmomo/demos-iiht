package com.mohsinkd786.services;

import com.mohsinkd786.dtos.ProductDto;
import com.mohsinkd786.entities.Product;
import com.mohsinkd786.mappers.ProductMapper;
import com.mohsinkd786.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ProductService {

    private ProductRepository repository;

    private ProductMapper mapper;

    @Autowired
    public void setMapper(ProductMapper mapper) {
        this.mapper = mapper;
    }

    @Autowired
    public ProductService(ProductRepository repository){
        this.repository =repository;
    }

    public List<ProductDto> findAll(){
        return repository
                .findAll()
                .stream()
                .map(product -> mapper.map(product,ProductDto.class))
                .collect(Collectors.toList());
    }

    public ProductDto createProduct(ProductDto productDto){

        Product entity = mapper.map(productDto,Product.class);
        entity.setProductId(UUID.randomUUID().toString());

        Product savedEntity = repository.save(entity);
        ProductDto savedDto = mapper.map(savedEntity,ProductDto.class);
        return savedDto;
    }

    public boolean deleteProduct(String productId){
        repository.deleteProductByProductId(productId);
        return true;
    }
}
