package com.mohsinkd786;

import com.mohsinkd786.aws.AwsS3Client;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//@SpringBootApplication
//public class AwsS3DemoApplication {
//
//    public static void main(String[] args) {
//        SpringApplication.run(AwsS3DemoApplication.class, args);
//    }
//
//    @Bean
//    public ApplicationRunner runner(AwsS3Client awsS3Client){
//        return args -> {
////                awsS3Client.createBucket();
////                awsS3Client.listBuckets();
////                awsS3Client.createObject();
////                awsS3Client.listObjects();
//            awsS3Client.downloadObject();
////            awsS3Client.deleteBucket();
////            awsS3Client.listBuckets();
//        };
//    }
//}
