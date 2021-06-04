package com.mohsinkd786.mappers;

import com.mohsinkd786.dtos.ProductDto;
import com.mohsinkd786.entities.Product;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper extends ConfigurableMapper {
    @Override
    protected void configure(MapperFactory factory) {
        factory.classMap(ProductDto.class, Product.class)
                .field("id","productId")
                .byDefault()
                .register();
    }
}
