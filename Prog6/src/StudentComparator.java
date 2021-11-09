import java.util.Comparator;
/**
 * Class: StudentComparator
 * @author Charles Guarino
 * Course: Intro to Algorithm Design II
 * Last Updated: April 4th 2017
 * Class that compares two Students for sorting
 */
public class StudentComparator  implements Comparator<Student>
{
	/**
	 * Method: compare
	 * @return 1, -1, or 0
	 * Compares two Student's alphabetically
	 */
	public int compare(Student a, Student b)
	{	 
	    if (a.getLastName().compareTo(b.getLastName()) < 0) return -1;
	    if (a.getLastName().compareTo(b.getLastName()) > 0) return 1;
	    if (a.getLastName().compareTo(b.getLastName()) == 0)
	    {
	    	if (a.getFirstName().compareTo(b.getFirstName()) < 0) return -1;
		    if (a.getFirstName().compareTo(b.getFirstName()) > 0) return 1;
	    }
	    return 0;
	}
}// end StudentComparator