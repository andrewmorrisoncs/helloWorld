package helloExample;

import javax.ws.rs.Consumes;//Needed for stubbed out code
import javax.ws.rs.GET;
import javax.ws.rs.POST;//Needed for stubbed out code
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;//Needed for stubbed out code
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloController {

	/*
	 * Returns 
	 */
	@GET
	@Path("/quickGreeting")
	@Produces(MediaType.APPLICATION_JSON)
	public String getGreeting(){
		final String greeting = "Hello World";
		return greeting;
	}
	
	/*
	 * Calls a method from another class to print the console statment
	 */
	@GET
	@Path("/consoleGreeting")
	public void sendConsoleGreeting(){
		HelloWorldConsole hwc = new HelloWorldConsole();
		hwc.helloWorldPrint();
	}
	
////	How you would do a post to the database
//  @POST
//	@Path("/saveGreeting")
//	@Produces(MediaType.TEXT_PLAIN)
//	@Consumes(MediaType.TEXT_PLAIN)
//	public String saveGreeting(@QueryParam("greeting") String greeting){
//	//All return statements would have their messages declared in a 
//	//property.config file in a real application but are declared here
//	//since this is stubbed out as a future release. 
//	  
//		if(!greeting.equals("")){
//			HelloService helloService = new HelloService();
//			String returnedVal = helloService.saveGreeting(greeting);
//			if(returnedVal != null){
//				if(returnedVal.equals(greeting)){ 
//					return "Your value was saved correctly!";
//				}
//				else{
//					return "An error occurred";
//				}
//			}else{
//				return "An error occured";
//			}
//		}else{
//			return "A value must be sent in order to be saved";
//		}
//	}
	

}
