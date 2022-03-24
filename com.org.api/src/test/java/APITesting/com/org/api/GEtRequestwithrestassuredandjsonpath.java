package APITesting.com.org.api;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.response.Response.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

public class GEtRequestwithrestassuredandjsonpath {
	
	
	@Test
	public void Getrequestjsonpath() {
		
		String weatherreport= given().
								param("id", "2172797").
								param("appid", "ff3f79ef5c0c540e9dfb92e8cc9e004a").
							when().
								get("http://api.openweathermap.org/data/2.5/weather").
							then().
								assertThat().statusCode(200).
								contentType(ContentType.JSON).
								assertThat().body("weather[0].description", equalTo("moderate rain")).
								extract().
								path("weather[0].description");
								
		System.out.println("weather report " +weatherreport);
	}
	
	@Test
	public void GetrequestREALTIMEPROJECTjsonpath() {
		
		  Response respone= given().
								param("id", "2172797").
								param("appid", "ff3f79ef5c0c540e9dfb92e8cc9e004a").
							when().
								get("http://api.openweathermap.org/data/2.5/weather");
							
		  String actualweatherreport= respone.
				  			then().
				  				contentType(ContentType.JSON).
				  				extract().
				  				path("weather[0].description");
		  
		  String expectedWeatherReport="broken clouds";
		  
		  if(actualweatherreport.equalsIgnoreCase(expectedWeatherReport)) {
			  System.out.println("Test case Pass");
		  }
		  else {
			  System.out.println("Test case Fail");
		  }
	}
	
	@Test
	public void GetRequestTransferingAPIreponsetootherAPI() {
		
		Response response= given().
								param("id", "2172797").
								param("appid", "ff3f79ef5c0c540e9dfb92e8cc9e004a").
						   when().
						   		get("http://api.openweathermap.org/data/2.5/weather");
		
		String reportbyID = response.
						   then().
						   		contentType(ContentType.JSON).
						   		extract().
						   		path("weather[0].description");
		
		System.out.println("weather description by ID : " + reportbyID);
		
		String lon= String.valueOf(response.
					then().
					contentType(ContentType.JSON).
					extract().
			   		path("coord.lon"));	   	
		
		System.out.println("Logitude is  : " + lon);
		
		String lat= String.valueOf(response.
				then().
				contentType(ContentType.JSON).
				extract().
		   		path("coord.lat"));	   	
	
		System.out.println("Logitude is  : " + lat);
		
		String responsebyCoordinates=given().
										param("lat",lat).
										param("lon", lon).
										param("appid", "ff3f79ef5c0c540e9dfb92e8cc9e004a").
									  when().
									  	get("http://api.openweathermap.org/data/2.5/weather").
									  then().
									  	contentType(ContentType.JSON).
									  	extract().
									  	path("weather[0].description");
		
		System.out.println("report by coordinates " + responsebyCoordinates);	
		
		Assert.assertEquals(reportbyID, responsebyCoordinates);
		
						   		
	}

}
