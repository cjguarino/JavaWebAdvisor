import java.util.ArrayList;
/**
 * Class: BinaryCourseSearcher
 * @author Charles Guarino
 * Course: Intro to Algorithm Design II
 * Last Updated: April 4th 2017
 * Class that implements the search method
 */
public class LinearCourseSearcher 
{
	/**
	 * Method: search
	 * @param courses
	 * @param courseName
	 * @param section
	 * @return CourseRecord
	 * Implements a linear search to find a desired course record
	 */
	public CourseRecord search(ArrayList<CourseRecord> list, String courseName, int section)
	{
		for (int i = 0; i < list.size() - 1; i++)
		{
			CourseRecord a = list.get(i);
			if (a.getCourseName().equalsIgnoreCase(courseName) && a.getCourseSection() == section)
				return a;
		}
		return null;
	}

}//end LinearCourseSearcher
