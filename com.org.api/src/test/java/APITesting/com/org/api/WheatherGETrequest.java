package APITesting.com.org.api;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class WheatherGETrequest {
	
	
//  @Test
  public void GETREquestwithoutParameter() {
	  //GET request without parameter
	  Response response= when().get("http://api.openweathermap.org/data/2.5/weather?q=London&appid=ff3f79ef5c0c540e9dfb92e8cc9e004a");
//	  System.out.println(response.asString());
	  System.out.println(response.getBody().asString());
	  System.out.println(response.statusCode());
	  System.out.println(response.getStatusLine());
	  System.out.println(response.getHeader("content-type"));
	  System.out.println(response.getTime());
	  
	  int statuscode=response.getStatusCode();
	  Assert.assertEquals(statuscode, 200);
	  if(response.getStatusCode()==200)
	  {
		  System.out.println("API is working fine");
	  }
	  else
	  {
		  System.out.println("API is not working fine");
	  }
  }
  
//  @Test
  public void GETREquestwithParameter() {
	  //GET request with parameter
	  
	  Response response= given().
			  				param("q", "London").
			  				param("appid", "ff3f79ef5c0c540e9dfb92e8cc9e004a").
			  			when().
			  				get("http://api.openweathermap.org/data/2.5/weather");
	  
	  int statuscode=response.getStatusCode();
	  Assert.assertEquals(statuscode, 200);
	  
  }
  
  @Test (priority=1)
  public void GETREquestwithoutParameterUser() {
	  
	  given().
	  		get("https://reqres.in/api/unknown/3").
	  then().
	  		statusCode(200).
	  		assertThat().statusCode(200).
	  		body("data.color", equalTo("#BF1932")).
	  		log().all();
	  
  }
//  @Test
  public void GETREquestwithoutParametercityID() {
	  //GET request with parameter
	  
	  Response response= when().get("http://api.openweathermap.org/data/2.5/weather?id=2643743&appid=ff3f79ef5c0c540e9dfb92e8cc9e004a");
			  			
	  System.out.println(response.getBody().asString());
	  System.out.println(response.statusCode());
	  System.out.println(response.getStatusLine());
	  System.out.println(response.getHeader("content-type"));
	  System.out.println(response.getTime());
	  
	  int statuscode=response.getStatusCode();
	  Assert.assertEquals(statuscode, 200);
	  if(response.getStatusCode()==200)
	  {
		  System.out.println("API is working fine");
	  }
	  else
	  {
		  System.out.println("API is not working fine");
	  }
			  				
	  
  }
  
  
//  @Test
  public void GETREquestwithParametercityIDRaghav() {
	  
	 given()
	 	.header("content-type","application/json")
	 	.param("id", "2643743")
	 	.param("appid", "ff3f79ef5c0c540e9dfb92e8cc9e004a")
	 .when()
	 	.get("http://api.openweathermap.org/data/2.5/weather")
	 .then()
	 	.statusCode(200)
	 	.assertThat().statusCode(200)
	 	.body("weather.id[0]",equalTo(701))
	 	.body("weather.main",hasItems("Mist"))
	 	.log().all();	  
	  
  }
  
//  @Test
  public void GETREquestwithParameterRaghav() {
	  
	 given()
	 	.header("content-type","application/json")
	 	.param("users", "7")
	 .when()
	 	.get("https://reqres.in/api/users?page=2")
	 .then()
	 	.statusCode(200)
	 	.assertThat().statusCode(200)
	 	.body("data.id[0]",equalTo(7))
	 	.body("data.first_name",hasItems("Michael","Lindsay"))
	 	.log().all();	  
	  
  }
  @Test(priority=2)
  public void GETREquestwithParameterRaghavZipCode() {
	  	
	  		given().
	  			header("content-type","application/json").
	  			param("zip", "94040").
	  			param("appid", "ff3f79ef5c0c540e9dfb92e8cc9e004a").
	  		when().
	  			get("http://api.openweathermap.org/data/2.5/weather").
	  		then().
	  			assertThat().statusCode(200).
	  			body("sys.id", equalTo(2017352)).
	  			body("sys.country", equalTo("US")).
	  			log().all();
	  			
	  		
	  }
}
