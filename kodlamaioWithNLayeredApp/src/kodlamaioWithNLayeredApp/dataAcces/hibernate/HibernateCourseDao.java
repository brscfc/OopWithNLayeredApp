package kodlamaioWithNLayeredApp.dataAcces.hibernate;

import java.util.ArrayList;
import java.util.List;

import kodlamaioWithNLayeredApp.dataAcces.CourseDao;
import kodlamaioWithNLayeredApp.entities.Course;

public class HibernateCourseDao implements CourseDao {

	List<Course> courses = new ArrayList<>();

	@Override
	public void add(Course course) {
		System.out.println(course.getName() + "Hibernate ile veri tabanına eklendi.");
	}

	@Override
	public List<Course> getAll() {

		return courses;
	}
}
 