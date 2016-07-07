
/**
 * @version: 1.0
 * @author Nicholas Hays
 */
import java.util.Comparator;

/**
 * Compares Person objects on class.
 * 
 * @author Nicholas A. Hays
 */
public class ClassyComparator implements Comparator<Person> {

	/**
	 * Compares Person's on class. If classes are the same,
	 * then orders Person objects on lexicographical order. 
	 */
	@Override
	public int compare(Person p1, Person p2) {
		int classCompare = compareClasses(p1, p2);
		if (classCompare < 0) {
			return 1;
		} else if (classCompare == 0) {
			int nameCompare = p1.myName.compareTo(p2.myName);
			if (nameCompare < 0) {
				return -1;
			} else {
				return 1;
			}
		} else {
			return -1;
		}
	}

	/**
	 * Compares Person objects on class. If lengths of the class heirarchies are different, a series of '2's' 
	 * are appeneded to the shorter person's class as required by the documentation. The string
	 * class is used to determine lexicographic order once the modifications are made (if any). 
	 * 
	 * @param p1 person 1.
	 * @param p2 person 2.
	 * @return integer representing the relative positioning of Person objects on class. '-1' if 
	 * p1 comes before p2, '0' if p1 and p2 are the same, and '1' if p1 comes after p2.
	 */
	private int compareClasses(Person p1, Person p2) {
		StringBuilder p1Temp = new StringBuilder(p1.myClass.toString());
		StringBuilder p2Temp = new StringBuilder(p2.myClass.toString());
		int p1Length = p1Temp.length();
		int p2Length = p2Temp.length();
		int difference = Math.abs(p1Length - p2Length);
		if (p1Length > p2Length) {
			for (int i = 0; i < difference; i++) {
				p2Temp.append(2);
			}
		} else if (p1Length < p2Length) {
			for (int i = 0; i < difference; i++) {
				p1Temp.append(2);
			}
		}
		return p1Temp.toString().compareTo(p2Temp.toString());
	}
}
