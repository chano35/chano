package com.computers.test;

// import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.computers.Computer;
import com.computers.Product;

public class ProductDesktopSS3 {

	public static void main(String[] args) {
		// GenericXmlApplicationContext context = new GenericXmlApplicationContext("context-product.xml");
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:context-product-component-scan.xml");
		
		Product product = context.getBean("product", Product.class);
		Computer computer = context.getBean("desktop", Computer.class);

		product.setComputer((Computer)computer);
		product.setModel("SS3-DESKTOP");
		
		product.addUnit("터치모니터");
		product.addUnit("무선마우스");
		product.printUnits();
		
		context.close();
	}

}
