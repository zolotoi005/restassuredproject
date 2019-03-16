package com.app.tests;

import io.restassured.RestAssured;
import org.junit.Test;
import io.restassured.response.Response;



import static io.restassured.RestAssured.given;

public class TestAssuredLoggingExample {

    @Test
    public void loggingTest(){
        //log request
        //log ----> provides logging options for request
        //
        given().log().all().
                when().get("https://uinames.com/api/");
        System.out.println("******************\n");



        //LOG REQUEST

        Response response = RestAssured.get("https://uinames.com/api/");

        response.then().log().all();

    }
}
