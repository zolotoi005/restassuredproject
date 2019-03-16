package com.app.tests;

import io.restassured.RestAssured;
import org.junit.Test;

public class RelaxedHttpsValidation {
    @Test
    public void relax(){
        //we are going to to trust connections with bad certifications
        RestAssured.useRelaxedHTTPSValidation();


        RestAssured.get("https://untrusted-root.badssl.com/").
                then().log().all().statusCode(200);
    }
}
