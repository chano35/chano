package com.computers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("productHP")
public class ProductHP {
	public final static String PRODUCT_COMPONENT_NAME = "productHP";
	
	@Value("HP")
	private String model;
	
	@Autowired
	@Qualifier("tablet")
	private Computer computer;
	
	public ProductHP() {}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Computer getComputer() {
		return computer;
	}
	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	
	public void addUnit(String unit) {
		if(computer != null) {
			computer.addUnit(unit + "\n");
		}
	}
	
	public void printUnits() {
		if(computer != null) {
			computer.printUnits(model);
		}
		else {
			System.out.println("Computer object is null...");
		}
	}
}
