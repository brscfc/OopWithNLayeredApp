package kodlamaioWithNLayeredApp.dataAcces.hibernate;

import java.util.ArrayList;
import java.util.List;

import kodlamaioWithNLayeredApp.dataAcces.CategoryDao;
import kodlamaioWithNLayeredApp.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	List<Category> categories = new ArrayList<>();

	@Override
	public void add(Category category) {
		
		System.out.println(category.getName() + "Kategori hibernate ile veri tabanına eklendi.");
	}

	@Override
	public List<Category> getAll() {
		return categories;
	}
}
 