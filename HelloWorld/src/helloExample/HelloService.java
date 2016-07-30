package helloExample;

public class HelloService {

	/*
	 * Service methods where logic could be applied would be here
	 */
	
	public String saveGreeting(String greeting){
		HelloDAO helloDAO = new HelloDAO();
		//Only allows for letters to be entered, just to
		//show that this is where logic to do something would be
		if(greeting.matches("[a-zA-Z]")){
			return helloDAO.saveGreeting(greeting);
		}else{
			return null;
		}
	}
}
