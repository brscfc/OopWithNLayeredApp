package kodlamaioWithNLayeredApp.business;

import kodlamaioWithNLayeredApp.core.logging.Logger;
import kodlamaioWithNLayeredApp.dataAcces.CategoryDao;
import kodlamaioWithNLayeredApp.entities.Category; //istenilen işleri manager classlarına girmeyi unutma.

public class CategoryManager {

	CategoryDao categoryDao;
	Logger[] loggers;

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;

	}

	public void add(Category category) throws Exception {

		for (Category reCategory : categoryDao.getAll()) {
			if (reCategory.getName() == category.getName()) {
				throw new Exception("Kategori ismi tekrar edemez");

			}
		} 
		
		categoryDao.add(category);

		for (Logger logger : loggers) {
			logger.log();
		}
	}

}
