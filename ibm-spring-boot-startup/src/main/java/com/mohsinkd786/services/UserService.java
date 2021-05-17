package com.mohsinkd786.services;

import com.mohsinkd786.dtos.UserDto;
import com.mohsinkd786.mapper.UserMapper;
import com.mohsinkd786.repositories.UserRepository;
import com.mohsinkd786.repositories.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private UserRepository userRepository;

    private UserMapper userMapper;

    @Autowired
    private void setUserMapper(UserMapper userMapper){
        this.userMapper = userMapper;
    }

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<UserDto> findAll(){
        return userRepository
                .findAll()
                .stream()
                .map(user-> userMapper.map(user,UserDto.class)).collect(Collectors.toList());

    }

    public UserDto createUser(UserDto userDto){
        User entity = userMapper.map(userDto,User.class);
        // set created date time
        entity.setCreatedOn(new Date());
        User savedEntity = userRepository.save(entity);
        return userMapper.map(savedEntity,UserDto.class);
    }
}
