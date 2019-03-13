package com.app.tests;

import io.restassured.RestAssured;
import javafx.beans.binding.When;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PathParamExample {
    @BeforeClass
    public static void setUp(){
        RestAssured.baseURI = "https://api.got.show/api";

    }

    @Test
    public void getCityByName(){
        //statement  where we prepare the request
        given()
                //adding param 'name' with value 'Qarth'
                .pathParam("name", "Qarth").
                //send the request
                when().
                ////{name}  ----> will be  replaced by value of the path param
                get("/cities/{name}").prettyPrint();
    }

    @Test
    public void getCharacterByName(){
        given().
                pathParam("name", "Pyp").

                when().get("characters/{name}").
                prettyPrint();
    }

    @Test
    public void getCharacterById(){
        given().
                pathParam("id", "56fa990a01677b0d643827ff").
                when().
                        get("characters/byId/{id}").
                prettyPrint();
    }
}
