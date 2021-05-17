package com.mohsinkd786.mapper;

import com.mohsinkd786.dtos.EmployeeDto;
import com.mohsinkd786.dtos.UserDto;
import com.mohsinkd786.repositories.User;
import com.mohsinkd786.repositories.mongo.Employee;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper extends ConfigurableMapper {

    @Override
    protected void configure(MapperFactory factory) {
        factory.registerClassMap(factory.classMap(EmployeeDto.class, Employee.class)
                .byDefault());
    }
}
