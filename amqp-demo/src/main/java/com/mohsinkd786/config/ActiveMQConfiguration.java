package com.mohsinkd786.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.converter.MessageType;

//@EnableJms
//@Configuration
public class ActiveMQConfiguration {

//    @Bean
//    public MessageConverter messageConverter(){
//        MappingJackson2MessageConverter messageConverter = new MappingJackson2MessageConverter();
//        messageConverter.setTargetType(MessageType.TEXT);
//        messageConverter.setObjectMapper(mapper());
//        return messageConverter;
//    }
//
//    @Bean
//    public ObjectMapper mapper(){
//        ObjectMapper mapper = new ObjectMapper();
//        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
//        return mapper;
//    }

}
