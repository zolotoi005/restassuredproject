package com.app.tests;

import io.restassured.RestAssured;
import org.junit.Test;

public class AuthenticationExamples {
    @Test
    public void usingApiKey(){
        RestAssured.given().log().all().
                queryParam("t","Kung Fury").
                queryParam("apikey","349db2da").
                when().get("http://www.omdbapi.com/").
                then().log().all().assertThat().statusCode(200);
    }
}
