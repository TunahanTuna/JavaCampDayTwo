
public class Courses {
	int courseID;
	String courseName;
	String courseDescription;
	String courseInstructor;
	public Courses() {
		System.out.println("Kurs Class� �a��r�ld�!");
	}
	public Courses(int courseID, String courseName, String courseDescription, String courseInstructor) {
		this();
		this.courseID = courseID;
		this.courseName = courseName;
		this.courseDescription = courseDescription;
		this.courseInstructor = courseInstructor;
		
	}
}
