package APISuitTest;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import org.testng.annotations.Test;

import Methods.ConfigReader;
import io.restassured.http.ContentType;

public class DeleteMethod {

	//Delete an employee record
	@Test
	 public void deleteEmployee() throws IOException {
		// Request to get the response of The API rest
			given()
			.when()
		// Set the Endpoint of the URL
			.delete(ConfigReader.URLDelete())
			.then()
		// Log all the data of the API response
			.log()
			.all()
		// Assertion to compare the expected status code with the obtained
			.statusCode(200);
		 }
}
