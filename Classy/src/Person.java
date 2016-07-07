/**
 * @version: 1.0
 * @author Nicholas Hays
 **/

/**
 * Represents a Person that holds a class and name.
 * @author Nicholas A. Hays
 */
public class Person {
	/**
	 * Name.
	 */
	String myName;
	
	/**
	 * Class.
	 */
	StringBuilder myClass;
	
	/**
	 * Constructor that sets initial values.
	 * 
	 * @param theName the name of the person.
	 * @param theClass the class of the person. 
	 */
	public Person(String theName, StringBuilder theClass) {
		myName = theName;
		myClass = theClass;
	}
}
