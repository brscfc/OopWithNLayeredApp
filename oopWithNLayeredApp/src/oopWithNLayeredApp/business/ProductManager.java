package oopWithNLayeredApp.business;

import java.util.List;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccsess.HibernateProductDao;
import oopWithNLayeredApp.dataAccsess.JdbcProductDao;
import oopWithNLayeredApp.dataAccsess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;

	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.loggers=loggers;
		this.productDao = productDao;
	}

	public void add(Product product) throws Exception {
		// iş kurallarını buraya yazıp yönetiyoruz.
		if (product.getUnitPrice() < 10) {
			throw new Exception("Ürün fiyatı 10 dan küçük olamaz");
		}
		// bir katman başka bir katmanın clasını kullanıyorken sadece interface'sinden
		// erişim kullanmalıdır.

		productDao.add(product);
		for (Logger logger : loggers) {
			logger.log(product.getName());
			
		}

	}
}
