import java.util.ArrayList;
import java.util.Collections;
/**
 * Class: CourseRecord
 * @author Charles Guarino
 * Course: Intro to Algorithm Design II
 * Last Updated: April 4th 2017
 * Class for an individual course
 */
public class CourseRecord 
{
	private String courseName;
	private int section;
	private int numEnrolled;
	ArrayList<Student> students;

	/**
	 * Constructor: CourseRecord
	 * @param courseName
	 * @param section
	 * Instantiates a Course Record
	 */
	public CourseRecord(String courseName, int section) 
	{
		this.courseName = courseName;
		this.section = section;
		numEnrolled = 0;
		students = new ArrayList<Student>();
	}

	/**
	 * Method: getCourseName
	 * @return courseName
	 * Returns the course name
	 */
	public String getCourseName() 
	{
		return courseName;
	}

	/**
	 * Method: getCourseSection
	 * @return section
	 * Returns the courses section
	 */
	public int getCourseSection() 
	{
		return section;
	}

	/**
	 * Method: getNumEnrolled
	 * @return numEnrolled
	 * Returns the number of students enrolled in a course
	 */
	public int getNumEnrolled() 
	{
		return numEnrolled;
	}

	/**
	 * Method: sortCourse
	 * Uses Collections to sort a list of students
	 */
	public void sortCourse() 
	{
		Collections.sort(students, new StudentComparator());
	}

	/**
	 * Method: enroll
	 * @param lastName
	 * @param firstName
	 * Enrolls a Student object into a course
	 */
	public void enroll(String lastName, String firstName) 
	{
		Student student = new Student(firstName, lastName);
		students.add(student);
		numEnrolled++;
	}

	/**
	 * Method: toString
	 * Returns the Entire course name and section
	 * as well as number of students enrolled
	 */
	public String toString() 
	{
		return courseName + " " + section + " Enrolled: " + numEnrolled;
	}
}//end CourseRecord
