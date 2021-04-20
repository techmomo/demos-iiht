package com.mohsinkd786;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class UserTest {

    @BeforeEach
    void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @AfterEach
    void tearDown(){

    }

    @Test
    public void testUser(){

        User user = new User();

        // mock the inner dependencies
        Address address = Mockito.mock(Address.class);
        user.setAddresses(List.of(address));
        // mock the expected behavior
        Mockito.when(address.getCity()).thenReturn("London");

        Assertions.assertEquals(user.getAddresses().get(0).getCity(),"London");
    }
}
