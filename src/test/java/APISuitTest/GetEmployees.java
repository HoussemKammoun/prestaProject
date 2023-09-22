package APISuitTest;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.IOException;

import org.testng.annotations.Test;

import Methods.ConfigReader;
public class GetEmployees {

	// Get all employee data & check the value of the status code
	@Test
	public void getEmployees() throws IOException {
	
	//Given in restassured means restassured.response
		given()
	// Get the Endpoint
		.get(ConfigReader.URLGet())
	// Log the response of the API GET
		.then().log().all()
		.statusCode(200)
	  //Check the number of employees
		.body("data.id[23]", equalTo(24))
	// Check that the data.employee_name has some Items 
		.body("data.employee_name", hasItems("Ashton Cox","Garrett Winters"));
		
	}
	
}
