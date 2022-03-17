package com.computers.test;

// import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.computers.ProductHP;

public class ProductTabletHP {

	public static void main(String[] args) {
		// GenericXmlApplicationContext context = new GenericXmlApplicationContext("context-product.xml");
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:context-product-component-scan.xml");
		
		ProductHP product = context.getBean(ProductHP.PRODUCT_COMPONENT_NAME, ProductHP.class);
		// Computer computer = context.getBean("desktop", Computer.class);
		// product.setComputer((Computer)computer);
		// product.setModel("SS3-DESKTOP");
		
		product.addUnit("터치모니터");
		product.addUnit("터치펜");
		product.printUnits();
		
		context.close();
	}

}
