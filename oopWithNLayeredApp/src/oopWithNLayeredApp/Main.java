package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.business.core.logging.DatabaseLogger;
import oopWithNLayeredApp.business.core.logging.FileLogger;
import oopWithNLayeredApp.business.core.logging.Logger;
import oopWithNLayeredApp.business.core.logging.MailLogger;
import oopWithNLayeredApp.dateAccess.HibernateProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1,"Iphone xr", 1000);
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		ProductManager productManager = new ProductManager(new HibernateProductDao(),loggers);
		productManager.add(product1);
		
		
	}

}
