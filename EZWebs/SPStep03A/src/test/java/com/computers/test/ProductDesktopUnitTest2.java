package com.computers.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.computers.Product;

public class ProductDesktopUnitTest2 {
	GenericXmlApplicationContext context;
	
	@Before
	public void init() {
		System.out.println("@Before: init()");
		context = new GenericXmlApplicationContext("context-product-test.xml");
		assertNotNull(context);
	}

	@Test
	public void testProductModel() { // 같은 모델인가?
		System.out.println("@Test: testProductModel()");
		
		Product product = (Product)context.getBean("product");
		String model = product.getModel();
		System.out.println("model:" + model);
		assertEquals("SS-DESKTOP-I7", model);
	}
	
	@Test
	public void testProductInstance() {	// 같은 인스턴스 인가?
		System.out.println("@Test: testProductInstance()");
		
		Product product1 = (Product)context.getBean("product");
		Product product2 = context.getBean("product", Product.class);
		// assertEquals(product1, product2);
		assertSame(product1, product2);
	}

	@Test
	public void testString() {	// 같은 인스턴스 인가?
		System.out.println("@Test: testProductInstance2()");
		
		String str1 = "홍길동";
		String str2 = new String(str1);
		assertEquals(str1, str2);	// success
		assertSame(str1, str2);		// failure
	}

	@After
	public void close() {
		System.out.println("@After: close()");
		assertNotNull(context);
		context.close();
		context = null;
	}

}
