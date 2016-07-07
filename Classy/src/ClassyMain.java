/**
 * @version: 1.0
 * @author Nicholas Hays
 *
 **/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ClassyMain {
	static List<Person> thePeople = new ArrayList<Person>();
	public static void main(String[] args) {
		
		Scanner scanIn = new Scanner(System.in);
		int numOfPeople = scanIn.nextInt();
		scanIn.findInLine(Pattern.compile(":"));
		for (int i = 0; i < numOfPeople; i++) {
			
			String name = scanIn.next();
			name = name.substring(0, name.length() -1);
			StringBuilder sb = new StringBuilder();
			while(!scanIn.hasNext("class")) {
				int classToInt;
				String theClass = scanIn.next();
				if(theClass.equals("upper")) classToInt = 3;
				else if(theClass.equals("middle"))	classToInt = 2;
				else classToInt = 1;
				sb.append(classToInt);
			}
			scanIn.next();
			sb.reverse();
			thePeople.add(new Person(name, sb));
		}

		scanIn.close();
		for(int i = 0; i < thePeople.size(); i++) {
			System.out.println(thePeople.get(i).myName);
		}
		System.out.println();
		
		Collections.sort(thePeople, new ClassComparator());
		
		for(int i = 0; i < thePeople.size(); i++) {
			System.out.println("Name: " + thePeople.get(i).myName + "; the class: " + thePeople.get(i).myClass);
		}
		
		
		
	}
	
}
