package com.computers.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.computers.Product;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:context-product-test.xml")
public class ProductDesktopSpringTest {
	
	@Autowired
	ApplicationContext _context;

	@Test
	public void testProduct() {
		Product product = (Product)_context.getBean("product");
		assertNotNull(product);	// product가 null이 아니면 패스, null이면 실패(멈춤)
		
		product.addUnit("터치모니터");
		product.addUnit("무선마우스");
		product.printUnits();
	}

}
