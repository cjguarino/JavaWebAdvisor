/**
 * Class: Student
 * @author Charles Guarino
 * Course: Intro to Algorithm Design II
 * Last Updated: April 4th 2017
 * Class for an individual Student
 */
public class Student 
{
	private String firstName;
	private String lastName;
	private String grade;
	
	/**
	 * Constructor: Student
	 * @param firstName
	 * @param lastName
	 * Instantiates a Student
	 */
	public Student(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		grade = "";
	}
	
	/**
	 * Method: getLastName
	 * @return lastName
	 * Return's the student's last name
	 */
	public String getLastName() 
	{
		return lastName;
	}
	
	/**
	 * Method: getFirstName
	 * @return firstName
	 * Returns the student's firstName
	 */
	public String getFirstName() 
	{
		return firstName;
	}
	
	/**
	 * Method: getFullName
	 * @return firstName + " " + lastName
	 * Return's the student's full name
	 */
	public String getFullName()
	{
		return firstName + " " + lastName;
	}

	/**
	 * Method: getGrade
	 * @return grade
	 * Returns the student's grade
	 */
	public String getGrade() 
	{
		return grade;
	}
	
	/**
	 * Method: setGrade
	 * @param grade
	 * Sets the Student's grade to the parameter
	 */
	public void setGrade(String grade)
	{
		this.grade = grade;
	}
	
	/**
	 * Method: toString
	 * Returns the entire student's name as well as grade
	 */
	public String toString()
	{
		return firstName + " " + lastName + ": " + grade;
	}
}// end Student
