package kodlamaioWithNLayeredApp.dataAcces.hibernate;

import kodlamaioWithNLayeredApp.dataAcces.InstructorDao;
import kodlamaioWithNLayeredApp.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Eğitmen hibernate ile veri tabanına eklendi.");
	}
}
  