package kodlamaioWithNLayeredApp.dataAcces;

import java.util.List;

import kodlamaioWithNLayeredApp.entities.Category;

public interface CategoryDao {
	void add(Category category);

	List<Category> getAll();

}
