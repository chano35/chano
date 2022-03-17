package com.computers.test;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.computers.ProductX;

public class ProductxPT {
	final static String PRODUCTX_CONTEXT_NAME = "classpath:context-productx-properties.xml";
	final static String PRODUCTX_COMPONENT_NAME = "productx";

	public static void main(String[] args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext(PRODUCTX_CONTEXT_NAME);
		
		ProductX productx = context.getBean(PRODUCTX_COMPONENT_NAME, ProductX.class);
		
		productx.addUnit("터치모니터");
		productx.addUnit("터치펜");
		productx.printUnits();
		productx.printOptions();
		
		context.close();
	}

}
