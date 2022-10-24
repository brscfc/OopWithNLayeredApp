package oopWithNLayeredApp.dataAccsess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {
	//sadedce ve sadece db erişim kodları buraya yazılır... SQL bilmek gerekir.
	public void add(Product product) {
		System.out.println("JDBC ile veritabanına eklendi");
	}
}

//hibernate 