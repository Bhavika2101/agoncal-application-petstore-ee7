// ********RoostGPT********
/*
Test generated by RoostGPT for test java-rest-assued using AI Type Open AI and AI Model gpt-4

Test generated for /categories_get for http method type GET in rest-assured framework

RoostTestHash=8b82be555a



roost_feedback [3/6/2024, 12:30:09 PM]:Format the above code snippet similar to Java formatter or using prettier
Do not remove any code logic
*/

// ********RoostGPT********

public class CategoriesGetTest {

    // The TestDataLoader class might be missing or it might have compilation issues.
    // Make sure the TestDataLoader class is present and it has no compilation issues.
    // Also, make sure the CSV file 'categoriesGetTest.csv' is present in the mentioned path.
    List<Map<String, String>> envList = new ArrayList<>();

    @BeforeEach
    public void setUp() {
        // The TestDataLoader class might be missing or it might have compilation issues.
        // Make sure the TestDataLoader class is present and it has no compilation issues.
        TestDataLoader dataLoader = new TestDataLoader();
        envList = dataLoader.loadData("src/test/java/org/agoncal/application/RoostTest/categoriesGetTest.csv");
    }

    @Test
    public void categoriesGet_Test() {
        for (Map<String, String> map : envList) {
            RestAssured.baseURI = map.get("BASE_URL");

            Response response = given()
                    .pathParam("start", map.get("start") != null ? map.get("start") : "")
                    .pathParam("max", map.get("max") != null ? map.get("max") : "")
                    .when()
                    .get("/categories")
                    .then()
                    .extract().response();

            if (response.statusCode() == 200) {
                System.out.println("Description: successful operation");

                if (response.jsonPath().get("id") != null) {
                    assertThat(response.jsonPath().get("id"), instanceOf(Integer.class));
                }

                if (response.jsonPath().get("version") != null) {
                    assertThat(response.jsonPath().get("version"), instanceOf(Integer.class));
                }

                if (response.jsonPath().get("name") != null) {
                    assertThat(response.jsonPath().get("name"), instanceOf(String.class));
                    assertThat(response.jsonPath().getString("name").length(), lessThanOrEqualTo(30));
                    assertThat(response.jsonPath().getString("name").length(), greaterThanOrEqualTo(1));
                }

                if (response.jsonPath().get("description") != null) {
                    assertThat(response.jsonPath().get("description"), instanceOf(String.class));
                    assertThat(response.jsonPath().getString("description").length(), lessThanOrEqualTo(3000));
                    assertThat(response.jsonPath().getString("description").length(), greaterThanOrEqualTo(0));
                }
            }
        }
    }
}
