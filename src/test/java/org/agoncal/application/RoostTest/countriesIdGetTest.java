// ********RoostGPT********
/*
Test generated by RoostGPT for test java-rest-assued using AI Type Open AI and AI Model gpt-4

Test generated for /countries/{id}_get for http method type GET in rest-assured framework

RoostTestHash=49a6fdda39


*/

// ********RoostGPT********
package org.agoncal.application.RoostTest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import org.hamcrest.MatcherAssert;
import static org.hamcrest.Matchers.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class countriesIdGetTest {

    List<Map<String, String>> envList = new ArrayList<>();


    @Before
    public void setUp() {
      TestdataLoader dataloader = new TestdataLoader();
      envList = dataloader.loadData("src/test/java/org/agoncal/application/RoostTest/countries_idGetTest.csv", {"id"});
    }

  
    @Test  
    public void countriesIdGet_Test() {
        this.setUp();
        for (Map<String, String> testData : envList) {
          RestAssured.baseURI = "http://localhost:8080/applicationPetstore/rest";  
  
                Response response = given()
				.pathParam("id", testData.get("id") != null ? testData.get("id") : "")
                .when()
                .get("/countries/{id}")  
                .then() 
                .extract().response();    
         
                if (response.statusCode() == default) {
					System.out.println("Description: successful operation");
				}
  
            }  
    }
}
