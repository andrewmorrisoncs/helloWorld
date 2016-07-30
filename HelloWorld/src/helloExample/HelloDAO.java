package helloExample;

public class HelloDAO {

	/*
	 * Methods to call the database here. Database
	 * location and configuration is setup in the hibernate.conf
	 * file
	 * 
	 */
	
	public String saveGreeting(String greeting){
		/*
		 * multiple ways to save to a database using hibernate
		 * stubbed out as it is a future enhancement
		 * 
		 * return value would be the Greeting object and we 
		 * would pull the name from that object to ensure it saved correctly
		 * I will return "Good Bye" here as a placeholder.
		 */
		return "Good Bye";
	}
}
