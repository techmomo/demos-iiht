package com.mohsinkd786.mapper;

import com.mohsinkd786.dtos.UserDto;
import com.mohsinkd786.repositories.User;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;
import org.springframework.stereotype.Component;

@Component
public class UserMapper extends ConfigurableMapper {

    @Override
    protected void configure(MapperFactory factory) {
        //super.configure(factory);
        factory.registerClassMap(factory.classMap(UserDto.class, User.class)
                .field("id","userId")
                .field("name","name"));
    }
}
