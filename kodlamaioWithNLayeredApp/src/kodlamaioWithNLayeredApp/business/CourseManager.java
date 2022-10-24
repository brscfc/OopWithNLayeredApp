package kodlamaioWithNLayeredApp.business;

import kodlamaioWithNLayeredApp.core.logging.Logger;
import kodlamaioWithNLayeredApp.dataAcces.CourseDao;
import kodlamaioWithNLayeredApp.entities.Course;

public class CourseManager {

	private CourseDao courseDao;
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao, Logger[] loggers) {

		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		if (course.getPrice() < 0) {
			throw new Exception("Bir kursun fiyatı 0'dan küçük olamaz.");

		}

		for (Course reCourse : courseDao.getAll()) {
			if (reCourse.getName() == course.getName()) {
				throw new Exception("Kurs ismi tekrar edemez.");

			}
		}
		courseDao.add(course);

		for (Logger logger : loggers) {
			logger.log();
		}

	}

}
