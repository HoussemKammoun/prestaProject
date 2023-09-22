package APISuitTest;

import static io.restassured.RestAssured.given;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import Methods.ConfigReader;
import io.restassured.http.ContentType;

public class UpdateMethod {
	
	//Create new record in database
	@Test
	public void updateElement() throws IOException {
		
		// Import The body of the API
			FileInputStream fileinputstream = new FileInputStream(ConfigReader.BodyPutPath());
		// Request to get the response of The API rest
			given()
		// Set the differents headers
			.header("Content-Type","application/json")
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
		// Set the body of the API
			.body(fileinputstream)
			.when()
		// Set the Endpoint of the API update
			.put(ConfigReader.URLUpdate())
			.then()
		// Log All the data response of API
			.log().all()
		// assertion
			.statusCode(200);
	}
}
