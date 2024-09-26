// ********RoostGPT********
/*
Test generated by RoostGPT for test java-rest-assued using AI Type Open AI and AI Model gpt-4

Test generated for /categories_get for http method type GET in rest-assured framework

RoostTestHash=8b82be555a


*/

// ********RoostGPT********

package org.agoncal.application.RoostTest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeEach; // changed from org.junit.Before
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

public class categoriesGetTest {

    List<Map<String, String>> envList = new ArrayList<>();

    // Changed annotation from @Before to @BeforeEach to be compatible with Junit 5
    @BeforeEach
    public void setUp() {
      TestdataLoader dataloader = new TestdataLoader();
      String[] envVarsList = {""};
      envList = dataloader.loadData("src/test/java/org/agoncal/application/RoostTest/categoriesGetTest.csv", envVarsList);
    }

    @Test  
    public void categoriesGet_Test() {
        this.setUp();
        for (Map<String, String> testData : envList) {
          RestAssured.baseURI = "http://localhost:8080/applicationPetstore/rest";  
  
                Response response = given()
                .pathParam("start", testData.get("start") != null ? testData.get("start") : "")
                .pathParam("max", testData.get("max") != null ? testData.get("max") : "")
                .when()
                .get("/categories")  
                .then() 
                .extract().response();    
         
                if (response.statusCode() == 200) {
                  System.out.println("Description: successful operation");

                  if (response.jsonPath().get("id") != null) {  
                    MatcherAssert.assertThat(response.jsonPath().get("id"), instanceOf(Integer.class));  
                  }

                  if (response.jsonPath().get("version") != null) {  
                    MatcherAssert.assertThat(response.jsonPath().get("version"), instanceOf(Integer.class));  
                  }

                  if (response.jsonPath().get("name") != null) {  
                    MatcherAssert.assertThat(response.jsonPath().get("name"), instanceOf(String.class));  
                    MatcherAssert.assertThat(response.jsonPath().getString("name").length(), lessThanOrEqualTo(30));
                    MatcherAssert.assertThat(response.jsonPath().getString("name").length(), greaterThanOrEqualTo(1));
                  }

                  if (response.jsonPath().get("description") != null) {  
                    MatcherAssert.assertThat(response.jsonPath().get("description"), instanceOf(String.class));  
                    MatcherAssert.assertThat(response.jsonPath().getString("description").length(), lessThanOrEqualTo(3000));
                    MatcherAssert.assertThat(response.jsonPath().getString("description").length(), greaterThanOrEqualTo(0));
                  }
                }
            }  
    }
}
