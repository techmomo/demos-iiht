package com.mohsinkd786.aws;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

@Component
public class AwsS3Client {

    @Autowired
    private AmazonS3 aws3Client;


    public void createBucket(){
        String bucketName = "awssdk-java-test";
        // check is bucket already exists
        if(!aws3Client.doesBucketExistV2(bucketName)){
            aws3Client.createBucket(bucketName);
        }
    }

    public void listBuckets(){
        aws3Client.listBuckets().forEach(bucket -> {
            System.out.println(bucket.getName() +"--- "+bucket.getOwner());
        });
    }

    public void deleteBucket(){
        String bucketName = "awssdk-java-test";
        aws3Client.deleteBucket(bucketName);
    }

    // upload object into s3 bucket
    public void createObject(){
        String bucketName = "awssdk-java-test";
        aws3Client.putObject(bucketName,"hello.txt",new File("hello.txt"));

    }

    public void listObjects(){
        String bucketName = "awssdk-java-test";
        ObjectListing listing = aws3Client.listObjects(bucketName);
        listing.getObjectSummaries().forEach(s3ObjectSummary -> System.out.println(s3ObjectSummary.getKey()));
    }

    public void downloadObject() throws IOException {
        String bucketName = "awssdk-java-test";
        S3Object object = aws3Client.getObject(bucketName,"hello.txt");
        S3ObjectInputStream inputStream = object.getObjectContent();

        // write stream to file
        FileUtils.copyInputStreamToFile(inputStream,new File("hello1.txt"));
    }
    public void deleteObject(){

    }
}
