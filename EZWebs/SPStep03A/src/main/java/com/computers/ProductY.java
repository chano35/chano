/*
 * context-producty-properties.xml에서 빈즈 속성을 지정
 */
package com.computers;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("producty")
public class ProductY {
	
	@Value("${model}")
	private String model;
	
	// @Autowired
	// @Qualifier("tablet")
	// private Computer computer;
	
	/*
	 * https://mvnrepository.com/artifact/javax.annotation/javax.annotation-api 
	 */
	@Resource(name="${computer}")
	private Computer computer;
	
	private List<String> options;
	
	public ProductY() {}
	
	public ProductY(String model, Computer computer) {
		this.model = model;
		this.computer = computer;
	}
	
	public void setOptions(List<String> options) {
		this.options = options;
	}
	
	public List<String> getOptions() {
		return this.options;
	}
	
	public void printOptions() {
		System.out.println("[options]");
		if(options != null) {
			for(String option : this.options) {
				System.out.println("option:" + option);
			}
		}
	}
	
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
