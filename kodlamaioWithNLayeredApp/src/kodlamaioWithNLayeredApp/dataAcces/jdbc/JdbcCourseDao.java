package kodlamaioWithNLayeredApp.dataAcces.jdbc;

import java.util.ArrayList;
import java.util.List;

import kodlamaioWithNLayeredApp.dataAcces.CourseDao;
import kodlamaioWithNLayeredApp.entities.Course;

public class JdbcCourseDao implements CourseDao {

	List<Course> courses = new ArrayList<>();

	@Override
	public void add(Course course) {
		System.out.println(course.getName() + " Jdbc ile veri tabanına eklendi.");

	}

	@Override
	public List<Course> getAll() {

		return courses;
	}
} 
