package com.mohsinkd786.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


public class UserTest {

    User user;

    @BeforeEach
    public void setup(){
        user = new User();
        user.setId(1);
        user.setName("User1");
    }

    // Grouped Assertions
    @Test
    @DisplayName("should return the correct User properties ")
    public void testUser(){
        Assertions.assertAll("Assert User Bean ",
                ()-> Assertions.assertEquals(1,user.getId()),
                ()-> Assertions.assertEquals("User1",user.getName()));
    }

//    public static String[][] getMsgs(){
//        String[][] strs = new String[][]{{""}};
//        return strs;
//    }
//    //
//    @ParameterizedTest
//    @MethodSource(value ="getMsgs" )
//    public void testWithParamObj(String[] msgs){
//
////        Assertions.assertAll("Assert Param User ",
////                ()-> Assertions.assertEquals(1,user.getId()),
////                ()-> Assertions.assertEquals("User11",user.getName()));
//        Assertions.assertEquals("",msgs[0]);
//    }


//    public static int[][] data(){
//        return new int[][] {{1,2}};
//    }
//
//    @ParameterizedTest
//    @MethodSource(value = "data")
//    public void testWithParams(int[] nums){
//        Assertions.assertEquals(1,nums[0]);
//    }
}
