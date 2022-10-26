import static org.testng.Assert.assertEquals;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GET {
	String endpoint = "https://qa-interview.srcli.xyz/";
	String login = "https://qa-interview.srcli.xyz/login";


	@Test
	public void testGet() {

		Response response = RestAssured.get(login);

		if (response.asString() == null) {
			System.out.println(response.getStatusCode());
			System.out.println(response.getStatusLine());
			System.out.println(response.getHeader("content-type"));
			System.out.println(response.getTime());

			int statusCode = response.getStatusCode();
			assertEquals(statusCode, 200);

		} else {
			RestAssured.get(endpoint);
			System.out.println(response.getStatusCode());
			System.out.println(response.getStatusLine());
			System.out.println(response.getHeader("content-type"));
			System.out.println(response.getTime());

			int statusCode = response.getStatusCode();
			assertEquals(statusCode, 200);

		}

	}
}
