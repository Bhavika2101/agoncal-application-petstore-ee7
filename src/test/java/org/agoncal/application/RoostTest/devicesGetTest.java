// ********RoostGPT********
/*
Test generated by RoostGPT for test java-rest-assued using AI Type Open AI and AI Model gpt-4

Test generated for /api/customer/devices_get for http method type GET in rest-assured framework

RoostTestHash=ef0e120435


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

public class devicesGetTest {

    List<Map<String, String>> envList = new ArrayList<>();


    @Before
    public void setUp() {
      TestdataLoader dataloader = new TestdataLoader();
      envList = dataloader.loadData("src/test/java/org/agoncal/application/RoostTest/devicesGetTest.csv");
    }

  
    @Test  
    public void devicesGet_Test() {
        this.setUp();
        for (Map<String, String> map : envList) {
          RestAssured.baseURI = map.get("BASE_URL");  
  
                Response response = given()
				.pathParam("company", map.get("company") != null ? map.get("company") : "")
				.pathParam("from", map.get("from") != null ? map.get("from") : "")
				.pathParam("offset", map.get("offset") != null ? map.get("offset") : "")
				.pathParam("limit", map.get("limit") != null ? map.get("limit") : "")
				.header("Authorization", "Bearer " + map.get("AUTH_TOKEN"))
                .when()
                .get("/api/customer/devices")  
                .then() 
                .extract().response();    
         
                if (response.statusCode() == 200) {
					System.out.println("Description: Get Customer Devices");
				}
  
            }  
    }
}
