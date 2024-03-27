// ********RoostGPT********
/*
Test generated by RoostGPT for test java-rest-assued using AI Type Open AI and AI Model gpt-4

Test generated for /customers_get for http method type GET in rest-assured framework

RoostTestHash=757c7bf7d8


*/

// ********RoostGPT********
package org.agoncal.application.RoostTest;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
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
import org.json.JSONObject;
import org.json.XML;
import org.json.JSONException;
import org.json.JSONArray;

public class customersGetTest {

    List<Map<String, String>> envList = new ArrayList<>();


    @Before
    public void setUp() {
      TestdataLoader dataloader = new TestdataLoader();
      String[] envVarsList = {""};
      envList = dataloader.load("src/test/java/org/agoncal/application/RoostTest/customersGetTest.csv", envVarsList);
    }

  
    @Test  
    public void customersGet_Test() {
        this.setUp();
        for (Map<String, String> testData : envList) {
          RestAssured.baseURI = (testData.get("BASE_URL") != null && !testData.get("BASE_URL").isEmpty()) ? testData.get("BASE_URL"): "http://localhost:8080/applicationPetstore/rest";  
  
                Response responseObj = given()
				.queryParam("start", testData.get("start") != null ? testData.get("start") : "")
				.queryParam("max", testData.get("max") != null ? testData.get("max") : "")
                .when()
                .get("/customers")  
                .then() 
                .extract().response(); 
              JsonPath response;
              String contentType = responseObj.getContentType();
              if (contentType.contains("application/xml") || contentType.contains("text/xml")) {
                String xmlResponse = responseObj.asString();
                JSONObject jsonResponse = XML.toJSONObject(xmlResponse);
                JSONObject jsonData = jsonResponse.getJSONObject("xml");
                String jsonString = jsonData.toString();
                response = new JsonPath(jsonString);
        
              } else {  
                response = responseObj.jsonPath(); 
              }  
         
                if (responseObj.statusCode() == 200) {  
            JSONArray respoJsonArray = new JSONArray(responseObj.asString());  
  
            for (int it = 0; it < respoJsonArray.length(); it++) {  
              response = new JsonPath(respoJsonArray.getJSONObject(it).toString());  
                    
              if (response.get("id") != null) {  
                MatcherAssert.assertThat(response.get("id"), instanceOf(Integer.class));  
          }
      
              if (response.get("version") != null) {  
                MatcherAssert.assertThat(response.get("version"), instanceOf(Integer.class));  
          }
      
              if (response.get("firstName") != null) {  
                MatcherAssert.assertThat(response.get("firstName"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.getString("firstName").length(), lessThanOrEqualTo(50));
  
                MatcherAssert.assertThat(response.getString("firstName").length(), greaterThanOrEqualTo(2));
  
          }
      
              if (response.get("lastName") != null) {  
                MatcherAssert.assertThat(response.get("lastName"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.getString("lastName").length(), lessThanOrEqualTo(50));
  
                MatcherAssert.assertThat(response.getString("lastName").length(), greaterThanOrEqualTo(2));
  
          }
      
              if (response.get("telephone") != null) {  
                MatcherAssert.assertThat(response.get("telephone"), instanceOf(String.class));  
          }
      
              if (response.get("email") != null) {  
                MatcherAssert.assertThat(response.get("email"), instanceOf(String.class));  
          }
      
              if (response.get("login") != null) {  
                MatcherAssert.assertThat(response.get("login"), instanceOf(String.class));  
          }
      
              if (response.get("password") != null) {  
                MatcherAssert.assertThat(response.get("password"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.getString("password").length(), lessThanOrEqualTo(256));
  
                MatcherAssert.assertThat(response.getString("password").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.get("uuid") != null) {  
                MatcherAssert.assertThat(response.get("uuid"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.getString("uuid").length(), lessThanOrEqualTo(256));
  
                MatcherAssert.assertThat(response.getString("uuid").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.get("role") != null) {  
                MatcherAssert.assertThat(response.get("role"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.getString("role"), anyOf(equalTo("USER"), equalTo("ADMIN")));
  
          }
      
              if (response.get("dateOfBirth") != null) {  
                MatcherAssert.assertThat(response.get("dateOfBirth"), instanceOf(String.class));  
          }
      
              if (response.get("age") != null) {  
                MatcherAssert.assertThat(response.get("age"), instanceOf(Integer.class));  
          }
      
              if (response.get("homeAddress") != null) {      
              if (response.get("homeAddress.street1") != null) {  
                MatcherAssert.assertThat(response.get("homeAddress.street1"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.getString("homeAddress.street1").length(), lessThanOrEqualTo(50));
  
                MatcherAssert.assertThat(response.getString("homeAddress.street1").length(), greaterThanOrEqualTo(5));
  
          }
      
              if (response.get("homeAddress.street2") != null) {  
                MatcherAssert.assertThat(response.get("homeAddress.street2"), instanceOf(String.class));  
          }
      
              if (response.get("homeAddress.city") != null) {  
                MatcherAssert.assertThat(response.get("homeAddress.city"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.getString("homeAddress.city").length(), lessThanOrEqualTo(50));
  
                MatcherAssert.assertThat(response.getString("homeAddress.city").length(), greaterThanOrEqualTo(2));
  
          }
      
              if (response.get("homeAddress.state") != null) {  
                MatcherAssert.assertThat(response.get("homeAddress.state"), instanceOf(String.class));  
          }
      
              if (response.get("homeAddress.zipcode") != null) {  
                MatcherAssert.assertThat(response.get("homeAddress.zipcode"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.getString("homeAddress.zipcode").length(), lessThanOrEqualTo(10));
  
                MatcherAssert.assertThat(response.getString("homeAddress.zipcode").length(), greaterThanOrEqualTo(1));
  
          }
      
              if (response.get("homeAddress.country") != null) {      
              if (response.get("homeAddress.country.id") != null) {  
                MatcherAssert.assertThat(response.get("homeAddress.country.id"), instanceOf(Integer.class));  
          }
      
              if (response.get("homeAddress.country.version") != null) {  
                MatcherAssert.assertThat(response.get("homeAddress.country.version"), instanceOf(Integer.class));  
          }
      
              if (response.get("homeAddress.country.isoCode") != null) {  
                MatcherAssert.assertThat(response.get("homeAddress.country.isoCode"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.getString("homeAddress.country.isoCode").length(), lessThanOrEqualTo(2));
  
                MatcherAssert.assertThat(response.getString("homeAddress.country.isoCode").length(), greaterThanOrEqualTo(2));
  
          }
      
              if (response.get("homeAddress.country.name") != null) {  
                MatcherAssert.assertThat(response.get("homeAddress.country.name"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.getString("homeAddress.country.name").length(), lessThanOrEqualTo(80));
  
                MatcherAssert.assertThat(response.getString("homeAddress.country.name").length(), greaterThanOrEqualTo(2));
  
          }
      
              if (response.get("homeAddress.country.printableName") != null) {  
                MatcherAssert.assertThat(response.get("homeAddress.country.printableName"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.getString("homeAddress.country.printableName").length(), lessThanOrEqualTo(80));
  
                MatcherAssert.assertThat(response.getString("homeAddress.country.printableName").length(), greaterThanOrEqualTo(2));
  
          }
      
              if (response.get("homeAddress.country.iso3") != null) {  
                MatcherAssert.assertThat(response.get("homeAddress.country.iso3"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.getString("homeAddress.country.iso3").length(), lessThanOrEqualTo(3));
  
                MatcherAssert.assertThat(response.getString("homeAddress.country.iso3").length(), greaterThanOrEqualTo(3));
  
          }
      
              if (response.get("homeAddress.country.numcode") != null) {  
                MatcherAssert.assertThat(response.get("homeAddress.country.numcode"), instanceOf(String.class));  
                MatcherAssert.assertThat(response.getString("homeAddress.country.numcode").length(), lessThanOrEqualTo(3));
  
                MatcherAssert.assertThat(response.getString("homeAddress.country.numcode").length(), greaterThanOrEqualTo(3));
  
          }
  
          }
  
          }
      
              if (response.get("fullName") != null) {  
                MatcherAssert.assertThat(response.get("fullName"), instanceOf(String.class));  
          }

            }  
          }
  
            }  
    }
}
