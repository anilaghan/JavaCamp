package oopWithNLayeredApp.dateAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {
	public void add(Product product) {
		System.out.println("JDB ile veri tabanına eklendi.");
	}
}
