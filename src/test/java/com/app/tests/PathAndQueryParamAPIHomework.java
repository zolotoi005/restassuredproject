package com.app.tests;

import io.restassured.RestAssured;
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

            given().pathParam("username","zolotoi").

            when().get("/users/{username}").prettyPrint();











    }




}
