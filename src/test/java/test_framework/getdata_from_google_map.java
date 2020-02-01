package test_framework;


import org.apache.logging.log4j.*;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class getdata_from_google_map 
{
	@Test
	public void getdata()
	{
		
		Logger log=LogManager.getLogger(getdata_from_google_map.class.getName());
		Response response=RestAssured.get("https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=-33.8670522,151.1957362&radius=1500&type=restaurant&keyword=cruise&key=AIzaSyCXkAz3GEJ0Jk6tTH5IDkT1sn31xz2TxD4");
		log.info("getdata from google map");
		log.info("hitting to url ");
		String data=response.asString();
		log.info("getting response");
		int code=response.getStatusCode();
		log.info("getting sttaus code"+code );
		/*System.out.println(code);
		System.out.println(data);*/
	}


}
