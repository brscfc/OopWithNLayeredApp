package kodlamaioWithNLayeredApp.dataAcces.jdbc;

import kodlamaioWithNLayeredApp.dataAcces.InstructorDao;
import kodlamaioWithNLayeredApp.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Eğitmen jdbc ile veri tabanına eklendi");
	}
}
 