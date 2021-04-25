
public class Main {

	public static void main(String[] args) {
		
		Categories myCourses = new Categories(1,"Kurslar�m","Buras� kurslar�m b�l�m�n�n i�eri�i");
		
		Categories allCourses = new Categories(2,"T�m Kurslar","Buras� t�m kurslar b�l�m�n�n i�eri�i");
		
		Categories preparationForCamp = new Categories(3,"Kampa Haz�rl�k","Buras� kampa haz�rl�k b�l�m�n�n ��eri�i");
		
		Categories FAQ = new Categories(4,"S�k�a Sorulan Sorular","S�k�a SorulanSorular b�l�m�n�n i�eri�i");
		
		Categories[] categories = {
				myCourses,
				allCourses,
				preparationForCamp,
				FAQ
		};
		System.out.println("\n");
		for(Categories category : categories) {
			System.out.println("Kategori ID: "+ category.categoryID);
			System.out.println("Kategori Ad�: "+ category.categoryName);
			System.out.println("Kategori ��eri�i: "+ category.categoryContent);
			System.out.println("<--------------------------------------------------------->");
		}
		
		Courses cSharp = new Courses(1, "Yaz�l�m Geli�tirici Yeti�tirme Kamp�-C#/Angular","Buras� C#/Angular Kursu A��klamas�","Engin Demiro�");
		
		Courses javaReact = new Courses(2,"Yaz�l�m Geli�tirici Yeti�tirme Kamp�-Java/React","Buras� Java/React Kursu A��klamas�","Engin Demiro�");
		
		Courses introTheProgramming = new Courses(3,"Programlamaya Giri�","Buras� Programlamaya Giri� Kursu A��klamas�","Engin Demiro�");
		
		Courses[] courses = {
				cSharp,
				javaReact,
				introTheProgramming
		};
		System.out.println("\n");
		for(Courses course : courses) {
			System.out.println("Kurs ID: "+ course.courseID);
			System.out.println("Kurs Ad�: "+ course.courseName);
			System.out.println("Kurs A��klamas�: "+ course.courseDescription);
			System.out.println("Kurs E�itmeni: "+ course.courseInstructor);
			System.out.println("###########################################################");
		}
		System.out.println("\n");
		CourseManager courseManager = new CourseManager();
		courseManager.registerTheCourse(cSharp);
		courseManager.registerTheCourse(javaReact);
		courseManager.registerTheCourse(introTheProgramming);
		System.out.println("\n");
		courseManager.newCourse("Yeni Kurs");
		
		
		}
	}
	


