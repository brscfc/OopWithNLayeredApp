package kodlamaioWithNLayeredApp;

import kodlamaioWithNLayeredApp.business.CategoryManager;
import kodlamaioWithNLayeredApp.business.CourseManager;
import kodlamaioWithNLayeredApp.business.InstructorManager;
import kodlamaioWithNLayeredApp.core.logging.DatabaseLogger;
import kodlamaioWithNLayeredApp.core.logging.FileLogger;
import kodlamaioWithNLayeredApp.core.logging.Logger;
import kodlamaioWithNLayeredApp.dataAcces.jdbc.JdbcCategoryDao;
import kodlamaioWithNLayeredApp.dataAcces.jdbc.JdbcCourseDao;
import kodlamaioWithNLayeredApp.dataAcces.jdbc.JdbcInstructorDao;
import kodlamaioWithNLayeredApp.entities.Category;
import kodlamaioWithNLayeredApp.entities.Course;
import kodlamaioWithNLayeredApp.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
			
		Logger[] loggers = {new FileLogger(), new DatabaseLogger()};

		Instructor instructor = new Instructor();
		instructor.setFirstName("Engin ");
		instructor.setLastName("Demiroğ");
		
		InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);
		instructorManager.add(instructor);
		
		System.out.println("---------------------------------------------------------------------------");
		
		
		Category category = new Category();
		category.setId(1);
		category.setName("Programlama");
		
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers );
		categoryManager.add(category);
		
		System.out.println("--------------------------------------------------------------------------");
			
		
		Course course1 = new Course();
		course1.setId(1);
		course1.setName("Yazılım Geliştirici Yetiştirme Kampı (C# & ANGULAR)");
		course1.setPrice(0);
		course1.setImage("C#-ANGULAR.png");

		Course course2 = new Course();
		course2.setId(2);
		course2.setName("Senior Yazılım Geliştiri Yetiştirme Kampı (.NET)");
		course2.setPrice(0);
		course2.setImage("Senior-.NET.png");

		Course course3 = new Course();
		course3.setId(3);
		course3.setName("(2022) Yazılım Geliştirici Yetiştirme Kampı - JAVA");
		course3.setPrice(0);
		course3.setImage("2022-JAVA.png");

		Course course4 = new Course();
		course4.setId(4);
		course4.setName("Yazılım Geliştirici Yetiştirme Kampı (JavaScript)");
		course4.setPrice(0);
		course4.setImage("Java-script.png");

		Course course5 = new Course();
		course5.setId(5);
		course5.setName("Programlamaya Giriş İçin temel Kurs ");
		course5.setImage("Giriş-temel-kurs.png");
		
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers);
		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.add(course3);
		courseManager.add(course4);
		courseManager.add(course5);
		courseManager.add(course5);
		
		
		
	
	
	
				
		
		
		
		
		
		
		
		
		
		

	}
}
