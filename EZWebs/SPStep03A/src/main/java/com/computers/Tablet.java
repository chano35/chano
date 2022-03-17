package com.computers;

import org.springframework.stereotype.Component;

@Component("tablet")
public class Tablet implements Computer {
	private StringBuffer units = new StringBuffer();

	@Override
	public void addUnit(String spec) {
		units.append(spec);
	}

	@Override
	public void printUnits(String model) {
		System.out.println("[Tablet] model=" + model);
		System.out.println(units.toString());
	}
}
