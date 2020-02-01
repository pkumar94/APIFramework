package test_framework;
import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public  class  Resuable_Methods 
{
	public static XmlPath rawtoxml(Response r)
	{
		String response=r.asString();
	XmlPath xmlpath= new XmlPath(response);
	
	return xmlpath;
		
	}
	
	public static JsonPath rawtojson(Response r)
	{
		String response=r.asString();
		JsonPath jsonpath= new JsonPath(response);
		return jsonpath;
	}

}
