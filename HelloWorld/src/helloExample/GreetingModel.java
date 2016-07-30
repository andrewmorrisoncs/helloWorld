package helloExample;

import javax.persistence.Entity;
import javax.persistence.Table;

/*
 * This is an example of a model that
 *  would be persisted in the database in the DAO.
 *  
 *  In a full developed application each model would
 *  be in a models folder with one model for each entity.
 *  
 */
@Entity
@Table(name="TBL_GREETINGS")//Name of the table in the future DB
public class GreetingModel {

	/*
	 * Getters,setters, and UUID here
	 * 
	 */
}
