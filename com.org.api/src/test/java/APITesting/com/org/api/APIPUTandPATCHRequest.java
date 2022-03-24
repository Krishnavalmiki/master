package APITesting.com.org.api;
import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;



public class APIPUTandPATCHRequest {
	
//	@Test(priority=1)
	public void PutRequest() {
			
		JSONObject request=new JSONObject();
		request.put("id", "8");
		request.put("title", "Second time Updated HashMap 8");
		request.put("author", "Second time Vishnu bhai 8");
		
		given().
			contentType(ContentType.JSON).
			body(request.toJSONString()).
		when().
			put("http://localhost:3000/posts/8").
		then().
			statusCode(200).
			log().all();
		
		
	}
	
//	@Test(priority=1)
	public void PatchRequest() {
			
		JSONObject request=new JSONObject();
		request.put("id", "8");
		request.put("title", "Third time Updated HashMap 8");
		request.put("author", "Third time Vishnu bhai 8");
		
		given().
			contentType(ContentType.JSON).
			body(request.toJSONString()).
		when().
			patch("http://localhost:3000/posts/8").
		then().
			statusCode(200).
			log().all();		
	}
	
	@Test(priority=1)
	public void DeleteRequest() {
			
		
		when().
			delete("http://localhost:3000/posts/8").
		then().
			statusCode(200).
			log().all();		
	}

}
