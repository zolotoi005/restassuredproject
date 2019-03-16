package com.app.tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.*;

public class PathAndQueryParamAPIHomework {

    @BeforeClass
    public static void setUpClass(){
        RestAssured.baseURI = "https://api.github.com";
    }

    @Test
    public void getASingleUser(){

            given().pathParam("username","zolotoi").queryParam("type", "member").

            when().get("/users/{username}/repos").prettyPrint();

    }



    @Test
    public void reverseString(){
        String str = "sergius";

        for(int i = str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
    }




}
