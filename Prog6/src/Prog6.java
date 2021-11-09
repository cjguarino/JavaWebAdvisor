import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * Class: Prog6
 * @author Charles Guarino
 * Course: Intro to Algorithm Design II
 * Last Updated: April 4th 2017
 * Main Program for a small college database
 */
public class Prog6 
{
	/**
	 * Method: main
	 * @param args
	 * @throws FileNotFoundException
	 * Tests the CourseRecord and Student Classes
	 */
	public static void main(String[] args) throws FileNotFoundException 
	{
		int menuResponse = 0, section, enrollment;
		String firstName, lastName, courseName;
		ArrayList<CourseRecord> courses = new ArrayList<CourseRecord>();
		LinearCourseSearcher courseSearcher = new LinearCourseSearcher();
		Scanner scan = new Scanner(System.in);
		File inFile = new File("prog6.txt");
		Scanner in = new Scanner(inFile);
		while (in.hasNext()) 
		{
			String name = in.next();
			String num = in.next();
			courseName = name + " " + num;
			section = in.nextInt();
			courses.add(new CourseRecord(courseName, section));
		}
		do 
		{
			System.out.printf("%s%25s%20s","1.List all courses","2.Enroll in a course","3.Sort courses\n");
			System.out.printf("%s%33s%15s","4.Enter grades","5.Display a classes roll","6.Quit \nEnter:");
			menuResponse = scan.nextInt();
			if (menuResponse == 1) // List all courses
			{
				for (int i = 0; i < courses.size(); i++)
				{
					System.out.println(courses.get(i).toString());
				}
			}
			if (menuResponse == 2) //Enroll in a course
			{
				boolean foundCourse = false;
				System.out.print("Enter student's last name: ");
				lastName = scan.next();
				System.out.print("Enter student's first name: ");
				firstName = scan.next();
				do
				{
					System.out.println("Enter course name and number: ");
					courseName = scan.next() + " " + scan.next();
					System.out.print("Enter section: ");
				    section = scan.nextInt();
				    Collections.sort(courses, new CourseComparator());
					CourseRecord course = courseSearcher.search(courses, courseName, section);
					if (course != null)
					{
					foundCourse = true;
					course.enroll(lastName, firstName);
					System.out.println(lastName + ", " + firstName + " successfully added to " + courseName + " " + section + "!");
					}
					else
					{
						System.out.println("No course found. Please enter an active course");
					}
				} while (foundCourse == false);
			}
			if (menuResponse == 3) //Sort Courses
			{
				Collections.sort(courses, new CourseComparator());
			}
			if (menuResponse == 4) //Enter Grades
			{
				boolean foundCourse = false;
				do
				{
					System.out.println("Enter course name and number: ");
					courseName = scan.next() + " " + scan.next();
					System.out.print("Enter section: ");
				    section = scan.nextInt();
				    CourseRecord course = courseSearcher.search(courses, courseName, section);
				    if (course != null)
				    {
				    	foundCourse = true;
					    course.sortCourse();
						enrollment = course.getNumEnrolled();
						if (enrollment <= 0)
							System.out.println("No students enrolled.");
						else
						{
							System.out.println("Enter Letter Grade: ");
							for (int x = 0; x < enrollment; x++) 
							{
								Student currentStudent = course.students.get(x);
								System.out.print(currentStudent.getFullName() + ": ");
								String grade = scan.next();
								currentStudent.setGrade(grade);
							}
						}
				    }
				    else
				    {
				    	System.out.println("No course found. Please enter an active course");
				    }
				} while (foundCourse == false);
			}
			if (menuResponse == 5) //Display a classes roll
			{
				boolean foundCourse = false;
				do
				{
					System.out.println("Enter course name and number: ");
					courseName = scan.next() + " " + scan.next();
					System.out.print("Enter section: ");
				    section = scan.nextInt();
				    CourseRecord course = courseSearcher.search(courses, courseName, section);	
				    if (course != null)
				    {
				    	foundCourse = true;
					    course.sortCourse();
						enrollment = course.getNumEnrolled();
						System.out.printf("%20.50s\n", courseName + " " + section);
						System.out.printf("%20.50s\n", "-----------------------------");
						if (enrollment == 0)
							System.out.println("No student's enrolled.");
						else
						{
							for (int x = 0; x < enrollment; x++) 
							{
								Student currentStudent = course.students.get(x);
								System.out.println(currentStudent.toString());
							}
						}
				    }
				    else
				    {
				    	System.out.println("No course found. Please enter an active course");
				    }
				} while (foundCourse == false);  
			}
			System.out.println();
		} while (menuResponse != 6); //Exiting sentinel condition
		System.out.println("Thank you for using this program!");
	}//End main

}//End Prog6
