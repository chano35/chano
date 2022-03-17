package com.computers;

import org.springframework.stereotype.Component;

@Component("notebook")
public class NoteBook implements Computer {
	private StringBuffer units = new StringBuffer();

	@Override
	public void addUnit(String spec) {
		units.append(spec);
	}

	@Override
	public void printUnits(String model) {
		System.out.println("[NoteBook] model=" + model);
		System.out.println(units.toString());
	}

}
