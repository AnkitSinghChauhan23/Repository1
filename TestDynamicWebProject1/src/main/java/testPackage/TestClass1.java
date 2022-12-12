package testPackage;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@Path("/hello")
public class TestClass1
{
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayHelloText()
	{
		String strResource = "<xml version='1.0' ?>" + 
							"Hello Ankit, This is xml response";
		return strResource;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayHelloJson()
	{
		String strResource = null;
		return strResource;
	}

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHelloHtml()
	{
		String strResource = "<h2> Hello Ankit, This is HTML response</h2>";
		return strResource;
	}

}
