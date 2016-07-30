package helloExample;

public class HelloWorldConsole {
	public final static String messageToPrint = "Hello World";
	
	//If ran solo this will automatically start and print to a console.
	public static void main(String[] args) {
		
		//If program is ran from via command line this will print to that
		if(System.console() != null){
			System.console().writer().println(messageToPrint);
		}else{//ran through eclipse, prints out to eclipse console
			System.out.println(messageToPrint);	
		}
	}
	//Allows for user to call the console printing from other locations
	public void helloWorldPrint(){
		if(System.console() != null){
			System.console().writer().println(messageToPrint);
		}else{
			System.out.println(messageToPrint);	
		}
	}

}
