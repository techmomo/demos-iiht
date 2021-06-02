package com.mohsinkd786.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ProducerClient {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Value("${external.service.producer.url}")
    private String producerServiceUrl;

    @Autowired
    private RestTemplate restTemplate;

    public String getMessage(){
        ServiceInstance serviceInstance = loadBalancerClient.choose(producerServiceUrl);
        ResponseEntity<String> responseEntity= restTemplate.exchange(serviceInstance.getUri().toString()+"/health/", HttpMethod.GET,null,String.class);

        // get url - just for logging
        System.out.println(serviceInstance.getUri());

        return responseEntity.getBody();
    }
}
