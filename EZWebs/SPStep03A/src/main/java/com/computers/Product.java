package com.computers;

import org.springframework.stereotype.Component;

@Component("product")
public class Product {
	public final static String PRODUCT_COMPONENT_NAME = "product";
	
	private String model;
	private Computer computer;
	
	public Product() {}
	
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
