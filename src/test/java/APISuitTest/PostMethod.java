package APISuitTest;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import Methods.ConfigReader;
import io.restassured.http.ContentType;

public class PostMethod {
	
	//Create new record in database
	@Test
	public void PostElement() throws IOException {
		
	// Import The body of the API
			FileInputStream fileinputstream = new FileInputStream(ConfigReader.BodyPostPath());
			given()
	// Set the differents headers
			.header("Content-Type","application/json")
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
	// Set The body
			.body(fileinputstream)
			.when()
	// Set The Endpoint
			.post(ConfigReader.URLCreate())
			.then()
			.log().all()
	// Assertion to compare the value of the obtained status code with the expected which equal to 200
			.statusCode(200);
			
			
			
		
	}
}
