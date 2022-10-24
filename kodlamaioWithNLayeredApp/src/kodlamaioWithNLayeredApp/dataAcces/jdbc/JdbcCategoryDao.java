package kodlamaioWithNLayeredApp.dataAcces.jdbc;

import java.util.ArrayList;
import java.util.List;

import kodlamaioWithNLayeredApp.dataAcces.CategoryDao;
import kodlamaioWithNLayeredApp.entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	List<Category> categories = new ArrayList<>();

	@Override
	public void add(Category category) {
		System.out.println(category.getName() + " Jdbc ile veri tabanına eklendi.");
	}

	@Override
	public List<Category> getAll() {

		return categories;

	} 
}
