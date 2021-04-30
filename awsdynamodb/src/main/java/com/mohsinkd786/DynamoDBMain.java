package com.mohsinkd786;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.document.spec.GetItemSpec;

import java.util.HashMap;
import java.util.Map;

public class DynamoDBMain {

    // default implementation
    //private static AmazonDynamoDB dynamoDBClient = AmazonDynamoDBClientBuilder.standard().build();
    private static AmazonDynamoDB dynamoDBClient = AmazonDynamoDBClientBuilder
            .standard()
            .withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration("dynamodb.ap-southeast-1.amazonaws.com","ap-southeast-1"))
            .withCredentials(new AWSStaticCredentialsProvider(new BasicAWSCredentials("accesskey","secretkey"))).build();

    private static DynamoDB dynamoDB = new DynamoDB(dynamoDBClient);

    public static void main(String[] args) {
        //setItem();
        getItem();
    }

    private static void setItem(){
        Table table = dynamoDB.getTable("Players");
        Item item = new Item()
                .withPrimaryKey("Number",121)
                .withString("MyName","Mohsin");
        table.putItem(item);

    }
    private static void getItem(){
        Table table = dynamoDB.getTable("Players");
        try{
            //Item item = table.getItem("Number",12,"#myname","#myname:name");

            Map<String,String> expValues = new HashMap();
            expValues.put("#ename","name");

            GetItemSpec itemSpec = new GetItemSpec()
                    .withPrimaryKey("Number",12)
                    .withProjectionExpression("#ename").withNameMap(expValues);

            Item item = table.getItem(itemSpec);

            System.out.println(item.toJSON());

        }catch (Exception ex){
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
    }
}
