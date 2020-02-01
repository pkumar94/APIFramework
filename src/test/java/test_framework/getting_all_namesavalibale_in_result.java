package test_framework;
import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.equalTo;

import org.apache.logging.log4j.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class getting_all_namesavalibale_in_result 
{
	@Test
	public void getdata()
	{
		Logger log=LogManager.getLogger(getdata_from_google_map.class.getName());
		// base uri 
		log.info("getting all namesavaliable in result");
		log.info("providing base url");
		RestAssured.baseURI="https://maps.googleapis.com";
		// what parameters and resources we have to provide in given method
		log.info("providing paramertrs ");
		Response res=given().
				param("location", "-33.8670522,151.1957362").
				param("radius","1500").
				param("key","AIzaSyCXkAz3GEJ0Jk6tTH5IDkT1sn31xz2TxD4").
				/*header("afjaf","sdfhjksdf").
		cookies("askj","adsfjhkj").// right now not required
		body().*/
				when().
				get("/maps/api/place/nearbysearch/json").
				// verify satus code and content type(response type wheather it is json or xml)
				then().assertThat().statusCode(200).contentType(ContentType.JSON).
				// now validating body 
				// equals apply to only body method not for header/content type
				// this is in json format thats why we directly validating that data--------VIMP


				//body("results[0].geometry.location.lat",equalTo("-33.8")).
				body("results[0].name",equalTo("Sydney")).and().

				body("results[0].place_id",equalTo("ChIJP3Sa8ziYEmsRUKgyFmh9AQM")).and().
				header("server", "scaffolding on HTTPServer2").and().
				extract().response();

		JsonPath js=Resuable_Methods.rawtojson(res);

		int count=js.get("results.size()");// getting size of arrays
		log.info("getting size of aaraty"+count);
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			System.out.println(js.get("results["+i+"].name").toString());
		}
	}

}
