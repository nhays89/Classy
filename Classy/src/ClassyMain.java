import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ClassyMain {
	static List<Person> thePeople = new ArrayList<Person>();
	public static void main(String[] args) {
		
		Scanner scanIn = new Scanner(System.in);
		int numOfPeople = scanIn.nextInt();
		
		for (int i = 0; i < numOfPeople; i++) {
			String name = scanIn.next(":");
			StringBuilder sb = new StringBuilder();
			while(!scanIn.hasNext("class")) {
				int classToInt;
				String theClass = scanIn.next();
				if(theClass.equals("upper")) classToInt = 3;
				else if(theClass.equals("middle"))	classToInt = 2;
				else classToInt = 1;
				sb.append(classToInt);
			}
			thePeople.add(new Person(name, sb));
		}
		
		
	
		Collections.sort(thePeople, new ClassComparator());
		
		for(Person p : thePeople) {
			System.out.println(p.myName + " " + p.myClass.toString());
		}
		
		
		
	}
	
}
