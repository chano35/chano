package com.computers.test;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.computers.ProductY;

public class ProductyPT {
	final static String PRODUCT_CONTEXT_NAME = "classpath:context-producty-properties.xml";
	final static String PRODUCT_COMPONENT_NAME = "producty";

	public static void main(String[] args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext(PRODUCT_CONTEXT_NAME);
		
		ProductY product = context.getBean(PRODUCT_COMPONENT_NAME, ProductY.class);
		
		product.addUnit("터치모니터");
		product.addUnit("터치펜");
		product.printUnits();
		product.printOptions();
		
		context.close();
	}

}
