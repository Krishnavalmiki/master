package APITesting.com.org.api;
import static io.restassured.RestAssured.given;
import static io.restassured.response.Response.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;



import APITesting.com.org.classes.Posts;
import groovy.util.logging.Log;
public class JasonServerRequestsPOST {
	
//	@Test(priority=2)
	public void Getrequest() {
			
		Response response= given().
							when().
								get("http://localhost:3000/posts");
		
		System.out.println(response.asString());
	}
	
//	@Test(priority=1)
	public void Postrequest() {
		
		Response resp= given().
							body("{\"id\":\"3\",\"title\":\"jsonDummy\",\"author\":\"typecode\"}").
					   when().
					   		contentType(ContentType.JSON).
					   		post("http://localhost:3000/posts/");
		
		System.out.println(resp.asString());
		
	}
	
//	@Test(priority=1)
	public void PostRequestwithObjects() {
		
		Posts post=new Posts();
		post.setId("4");
		post.setTitle("Book of Honour");
		post.setAuthor("Chacha");
		
		Response rps=	given().
						when().
							contentType(ContentType.JSON).
							body(post).
							post("http://localhost:3000/posts/");
		
		System.out.println(rps);
		
		
	}
	
//	@Test(priority=1)
	public void PostRequestwithHashMapps() {
		
		
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("id", "7");
		map.put("title", "Using HashMap 7");
		map.put("author", "Raghav Pal 7");
		
		System.out.println(map);
		
		JSONObject request=new JSONObject(map);
		
		System.out.println(request);
		
		System.out.println(request.toJSONString());
		
		given().
			body(request.toJSONString()).
		when().
			contentType(ContentType.JSON).
			post("http://localhost:3000/posts/").
		then().
			statusCode(201);
		
	}
	
	@Test(priority=1)
	public void PostRequestwithJSONObject() {
		
		JSONObject request=new JSONObject();
		request.put("id", "8");
		request.put("title", "Using HashMap 8");
		request.put("author", "Raghav Pal 8");
		
		given().
			header("Content-Type","application/json").
			contentType(ContentType.JSON).
			body(request.toJSONString()).
		when().
		post("http://localhost:3000/posts/").
		then().
			statusCode(201);
	}
}
