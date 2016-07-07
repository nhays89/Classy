
/**
 * @version: 1.0
 * @author Nicholas Hays
 **/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ClassyMain {

	/**
	 * List of Person objects.
	 */
	static List<Person> thePeople = new ArrayList<Person>();

	/**
	 * Accepts piped input from file and orders people on their 'class'. 'Class'
	 * here denotes rank in society. For instance, 'upper' class individuals are
	 * ranked higher than 'lower' class individuals. Input from file is
	 * converted to integers representing class heiarchy (i.e John: upper middle
	 * upper lower class = 3231); This integer is then reversed to start the
	 * comparison of ascii values at the low index because charAt(index) begins
	 * at 0.
	 * 
	 * @param args
	 *            no cmd line args. Only piped file input.
	 */
	public static void main(String[] args) {

		Scanner scanIn = new Scanner(System.in);
		int numOfPeople = scanIn.nextInt();

		for (int i = 0; i < numOfPeople; i++) {
			String name = scanIn.next();
			name = name.substring(0, name.length() - 1);
			StringBuilder sb = new StringBuilder();

			while (!scanIn.hasNext("class")) {
				int classToInt;
				String theClass = scanIn.next();
				if (theClass.equals("upper"))
					classToInt = 3;
				else if (theClass.equals("middle"))
					classToInt = 2;
				else
					classToInt = 1;
				sb.append(classToInt);
			}
			scanIn.next();
			sb.reverse();
			thePeople.add(new Person(name, sb));
		}

		scanIn.close();
		Collections.sort(thePeople, new ClassyComparator());

		for (int i = 0; i < thePeople.size(); i++) {
			System.out.println(thePeople.get(i).myName);
		}
	}
}
