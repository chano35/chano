package com.computers.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.computers.Product;

public class ProductDesktopUnitTest3 {
	final static String PRODUCT_DEFAULT_MODEL = "SS-DESKTOP-I7";
	static GenericXmlApplicationContext _context = null;
	Product _product = null;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("@BeforeClass: beforeClass()");
		_context = new GenericXmlApplicationContext("context-product-test.xml");
		assertNotNull(_context);
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("@AfterClass: afterClass()");
		assertNotNull(_context);
		_context.close();
	}
	
	@Before
	public void init() {
		System.out.println("@Before: init()");
		_product = (Product)_context.getBean("product");
		assertNotNull(_product);
		_product.addUnit("터치모니터");
		_product.addUnit("무선마우스");
		_product.printUnits();
	}

	@After
	public void close() {
		System.out.println("@After: close()");
		_product = null;
	}
	
	@Test
	public void testProductModel() { // 같은 모델인가?
		System.out.println("@Test: testProductModel()");
		
		Product product = (Product)_context.getBean("product");
		String model = product.getModel();
		System.out.println("model:" + model);
		assertEquals(PRODUCT_DEFAULT_MODEL, model);
	}
	
	@Test
	public void testProductInstance() {	// 같은 인스턴스 인가?
		System.out.println("@Test: testProductInstance()");
		
		Product product = _context.getBean("product", Product.class);
		assertSame(_product, product);
	}

	@Test
	public void testComputer() {	// 같은 컴퓨터인가?
		System.out.println("@Test: testSpec()");
		
		Product product = _context.getBean("product", Product.class);
		assertSame(_product.getComputer(), product.getComputer());
	}
}
