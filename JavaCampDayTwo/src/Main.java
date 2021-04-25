
public class Main {

	public static void main(String[] args) {
		
		Categories myCourses = new Categories(1,"Kurslarým","Burasý kurslarým bölümünün içeriði");
		
		Categories allCourses = new Categories(2,"Tüm Kurslar","Burasý tüm kurslar bölümünün içeriði");
		
		Categories preparationForCamp = new Categories(3,"Kampa Hazýrlýk","Burasý kampa hazýrlýk bölümünün Ýçeriði");
		
		Categories FAQ = new Categories(4,"Sýkça Sorulan Sorular","Sýkça SorulanSorular bölümünün içeriði");
		
		Categories[] categories = {
				myCourses,
				allCourses,
				preparationForCamp,
				FAQ
		};
		System.out.println("\n");
		for(Categories category : categories) {
			System.out.println("Kategori ID: "+ category.categoryID);
			System.out.println("Kategori Adý: "+ category.categoryName);
			System.out.println("Kategori Ýçeriði: "+ category.categoryContent);
			System.out.println("<--------------------------------------------------------->");
		}
		
		Courses cSharp = new Courses(1, "Yazýlým Geliþtirici Yetiþtirme Kampý-C#/Angular","Burasý C#/Angular Kursu Açýklamasý","Engin Demiroð");
		
		Courses javaReact = new Courses(2,"Yazýlým Geliþtirici Yetiþtirme Kampý-Java/React","Burasý Java/React Kursu AÇýklamasý","Engin Demiroð");
		
		Courses introTheProgramming = new Courses(3,"Programlamaya Giriþ","Burasý Programlamaya Giriþ Kursu AÇýklamasý","Engin Demiroð");
		
		Courses[] courses = {
				cSharp,
				javaReact,
				introTheProgramming
		};
		System.out.println("\n");
		for(Courses course : courses) {
			System.out.println("Kurs ID: "+ course.courseID);
			System.out.println("Kurs Adý: "+ course.courseName);
			System.out.println("Kurs Açýklamasý: "+ course.courseDescription);
			System.out.println("Kurs Eðitmeni: "+ course.courseInstructor);
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
	


