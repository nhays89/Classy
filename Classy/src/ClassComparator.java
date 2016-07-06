import java.util.Comparator;


public class ClassComparator implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		int classCompare = compareClasses(p1,p2);
		if(classCompare < 0) {
			return -1;
		} else if (classCompare == 0) {
			int nameCompare = p1.myName.compareTo(p2.myName);
			if(nameCompare < 0) {
				return -1;
			} else {
				return 1;
			}
		} else {
			return 1;
		}
		
	}

	private int compareClasses(Person p1, Person p2) {
	//	System.out.println("difference between " + p1.myName + " and " + p2.myName + ": " + (p1.myClass.charAt(0) - p2.myClass.charAt(0)));
		//System.out.println("char at end for " + p1.myName + " is " + p1.myClass.charAt(p1.myClass.length() -1));
		return 0;
	}
}
