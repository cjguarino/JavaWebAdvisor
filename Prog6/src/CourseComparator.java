import java.util.Comparator;
/**
 * Class: CourseComparator
 * @author Charles Guarino
 * Course: Intro to Algorithm Design II
 * Last Updated: April 4th 2017
 * Class that compares two Courses for sorting
 */
public class CourseComparator  implements Comparator<CourseRecord>
{
	/**
	 * Method: compare
	 * @return -1, 1, or 0
	 * Compares two CourseRecords alphabetically
	 */
	public int compare(CourseRecord a, CourseRecord b)
	{	 
	    if (a.getCourseName().compareTo(b.getCourseName()) < 0) return -1;
	    if (a.getCourseName().compareTo(b.getCourseName()) > 0) return 1;
	    if ((a.getCourseName().compareTo(b.getCourseName()) == 0))
	    {
	    	if (a.getCourseSection() > b.getCourseSection()) return 1;
	    	if (a.getCourseSection() < b.getCourseSection()) return -1;
	    }
	     return 0;
	}
}// end CourseComparator
