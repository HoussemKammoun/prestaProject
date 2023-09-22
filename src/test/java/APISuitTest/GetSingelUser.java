package APISuitTest;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.IOException;

import org.testng.annotations.Test;

import Methods.ConfigReader;
public class GetSingelUser {

	//Get a single employee data & the status code value
	@Test
	public void getOneUser() throws IOException {
		// Request to get the response of The API rest
		 given() 
		// Enpoint to get the user
		 .get(ConfigReader.URLGetSingle())
	    .then()
	    // Log all the data of the response : status code, Time response...
	    .log().all()
	    // Assertion to compare the value obtained with the expected one
	    .statusCode(200)
	    // Compare the value of the id , employee_name, employee_salary with the expected values
	    .body("data.id", equalTo(1),"data.employee_name",equalTo("Tiger Nixon"),"data.employee_salary",equalTo(320800));
	}
}
