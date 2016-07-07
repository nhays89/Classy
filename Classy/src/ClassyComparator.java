/**
 * @version: 1.0
 * @author Nicholas Hays
 */
import java.util.Comparator;


public class ClassyComparator implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		int classCompare = compareClasses(p1,p2);
		System.out.println("p1 name: " + p1.myName + "; p2Name " + p2.myName + " classCompare: " + classCompare);
		
		if(classCompare < 0) {
			return 1;
		} else if (classCompare == 0) {
			int nameCompare = p1.myName.compareTo(p2.myName);
			if(nameCompare < 0) {
				return 1;
			} else {
				return -1;
			}
		} else {
			return -1;
		}
	}

	private int compareClasses(Person p1, Person p2) {
		StringBuilder p1Temp = new StringBuilder(p1.myClass.toString());
		StringBuilder p2Temp = new StringBuilder(p2.myClass.toString());
		System.out.println("p1" + p1.myName);
		System.out.println("p2" + p2.myName);
		int p1Length = p1Temp.length();
		int p2Length = p2Temp.length();
		int difference = Math.abs(p1Length - p2Length);
		if(p1Length > p2Length) {
			for(int i = 0; i < difference; i++) {
				p2Temp.append(2);
			}
		} else if(p1Length < p2Length) {
			for(int i = 0; i < difference; i++) {
				p1Temp.append(2);
			}
		}
		return p1Temp.toString().compareTo(p2Temp.toString());
	}
}
