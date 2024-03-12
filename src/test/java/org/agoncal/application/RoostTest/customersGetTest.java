// ********RoostGPT********
/*
Test generated by RoostGPT for test java-rest-assued using AI Type Open AI and AI Model gpt-4

Test generated for /customers_get for http method type GET in rest-assured framework

RoostTestHash=757c7bf7d8


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

public class customersGetTest {

    List<Map<String, String>> envList = new ArrayList<>();


    @Before
    public void setUp() {
      TestdataLoader dataloader = new TestdataLoader();
      envList = dataloader.loadData("src/test/java/org/agoncal/application/RoostTest/customersGetTest.csv", {""});
    }

  
    @Test  
    public void customersGet_Test() {
        this.setUp();
        for (Map<String, String> testData : envList) {
          RestAssured.baseURI = "http://localhost:8080/applicationPetstore/rest";  
  
                Response response = given()
				.pathParam("start", testData.get("start") != null ? testData.get("start") : "")
				.pathParam("max", testData.get("max") != null ? testData.get("max") : "")
                .when()
                .get("/customers")  
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
      
              if (response.jsonPath().get("firstName") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("firstName"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("firstName").length(), lessThanOrEqualTo(50));
  
                MatcherAssert.assertThat(response.jsonPath().getString("firstName").length(), greaterThanOrEqualTo(2));
  
          }
      
              if (response.jsonPath().get("lastName") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("lastName"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("lastName").length(), lessThanOrEqualTo(50));
  
                MatcherAssert.assertThat(response.jsonPath().getString("lastName").length(), greaterThanOrEqualTo(2));
  
          }
      
              if (response.jsonPath().get("telephone") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("telephone"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("email") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("email"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("login") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("login"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("password") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("password"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("password").length(), lessThanOrEqualTo(256));
  
                MatcherAssert.assertThat(response.jsonPath().getString("password").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.jsonPath().get("uuid") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("uuid"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("uuid").length(), lessThanOrEqualTo(256));
  
                MatcherAssert.assertThat(response.jsonPath().getString("uuid").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.jsonPath().get("role") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("role"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("role"), anyOf(equalTo("USER"), equalTo("ADMIN")));
  
          }
      
              if (response.jsonPath().get("dateOfBirth") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("dateOfBirth"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("age") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("age"), instanceOf(Integer.class));  
          }
      
              if (response.jsonPath().get("homeAddress") != null) {      
              if (response.jsonPath().get("homeAddress.street1") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("homeAddress.street1"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("homeAddress.street1").length(), lessThanOrEqualTo(50));
  
                MatcherAssert.assertThat(response.jsonPath().getString("homeAddress.street1").length(), greaterThanOrEqualTo(5));
  
          }
      
              if (response.jsonPath().get("homeAddress.street2") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("homeAddress.street2"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("homeAddress.city") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("homeAddress.city"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("homeAddress.city").length(), lessThanOrEqualTo(50));
  
                MatcherAssert.assertThat(response.jsonPath().getString("homeAddress.city").length(), greaterThanOrEqualTo(2));
  
          }
      
              if (response.jsonPath().get("homeAddress.state") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("homeAddress.state"), instanceOf(String.class));  
          }
      
              if (response.jsonPath().get("homeAddress.zipcode") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("homeAddress.zipcode"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("homeAddress.zipcode").length(), lessThanOrEqualTo(10));
  
                MatcherAssert.assertThat(response.jsonPath().getString("homeAddress.zipcode").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.jsonPath().get("homeAddress.country") != null) {      
              if (response.jsonPath().get("homeAddress.country.id") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("homeAddress.country.id"), instanceOf(Integer.class));  
          }
      
              if (response.jsonPath().get("homeAddress.country.version") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("homeAddress.country.version"), instanceOf(Integer.class));  
          }
      
              if (response.jsonPath().get("homeAddress.country.isoCode") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("homeAddress.country.isoCode"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("homeAddress.country.isoCode").length(), lessThanOrEqualTo(2));
  
                MatcherAssert.assertThat(response.jsonPath().getString("homeAddress.country.isoCode").length(), greaterThanOrEqualTo(2));
  
          }
      
              if (response.jsonPath().get("homeAddress.country.name") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("homeAddress.country.name"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("homeAddress.country.name").length(), lessThanOrEqualTo(80));
  
                MatcherAssert.assertThat(response.jsonPath().getString("homeAddress.country.name").length(), greaterThanOrEqualTo(2));
  
          }
      
              if (response.jsonPath().get("homeAddress.country.printableName") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("homeAddress.country.printableName"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("homeAddress.country.printableName").length(), lessThanOrEqualTo(80));
  
                MatcherAssert.assertThat(response.jsonPath().getString("homeAddress.country.printableName").length(), greaterThanOrEqualTo(2));
  
          }
      
              if (response.jsonPath().get("homeAddress.country.iso3") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("homeAddress.country.iso3"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("homeAddress.country.iso3").length(), lessThanOrEqualTo(3));
  
                MatcherAssert.assertThat(response.jsonPath().getString("homeAddress.country.iso3").length(), greaterThanOrEqualTo(3));
  
          }
      
              if (response.jsonPath().get("homeAddress.country.numcode") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("homeAddress.country.numcode"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.jsonPath().getString("homeAddress.country.numcode").length(), lessThanOrEqualTo(3));
  
                MatcherAssert.assertThat(response.jsonPath().getString("homeAddress.country.numcode").length(), greaterThanOrEqualTo(3));
  
          }
  
          }
  
          }
      
              if (response.jsonPath().get("fullName") != null) {  
                MatcherAssert.assertThat(response.jsonPath().get("fullName"), instanceOf(String.class));  
          }
				}
  
            }  
    }
}
