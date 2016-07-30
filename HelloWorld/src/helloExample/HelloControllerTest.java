package helloExample;

import org.junit.Assert;
import org.junit.Test;

public class HelloControllerTest {
	
	@Test
	public void testGetGreetingWithProperValue(){
		//Could also use some sort of Mock class here too I believe. Since
		//nothing here is live it shouldn't be a concern
		HelloController helloController = new HelloController();
		
		Assert.assertEquals(helloController.getGreeting(),"Hello World");
	}
	
	@Test
	public void testGetGreetingWithBadValue(){
		//Could also use some sort of Mock class here too I believe. Since
		//nothing here is live it shouldn't be a concern
		HelloController helloController = new HelloController();
		
		Assert.assertNotEquals(helloController.getGreeting(),"I do not work");
	}

	@Test
	public void testSendConsoleGreeting() {
		//I dont know of a way to test if something was printed to the console
	}

}
