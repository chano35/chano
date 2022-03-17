package com.computers.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.computers.Product;

public class ProductDesktopUnitTest {

	@Test
	public void testCase() {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("context-product-test.xml");
		
		Product product = (Product)context.getBean("product");
		assertNotNull(product);	// product가 null이 아니면 패스, null이면 실패(멈춤)
		
		product.addUnit("터치모니터");
		product.addUnit("무선마우스");
		product.printUnits();
		
		context.close();
		context = null;
		
		assertNull(context); // context가 null이면 패스, null이 아니면 실패(멈춤)
		
		System.out.println("[testCase] END");
	}

}
