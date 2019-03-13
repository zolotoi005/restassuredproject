package com.app.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ExercisePractice {

    @Before
    public static void setUpClass() {
        //baseURI ---> used to save the base url for all resources
        //when we actually make requests, we only provide the path to
        //specific resources
        RestAssured.baseURI = "https://api.got.show/api";

    }

    @Test
    public void continentsTest(){
        Response response = RestAssured.get("/continents/");
        Assert.assertEquals(200, response.statusCode());
        response.prettyPrint();
        Assert.assertTrue(response.asString().contains("Westeros"));

    }

    @Test
    public void episodesTest2(){
        Response response = RestAssured.get("/episodes/");
        Assert.assertEquals(200, response.statusCode());
        response.prettyPrint();
        Assert.assertTrue(response.asString().contains("Rains of Castamere"));

    }
}
