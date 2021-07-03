package com.doselect;

public class CarStory {
	private String name;
	private String carname;
	private double variable;
	
	public CarStory(String name, String carname, double variable) {
		super();
		this.name = name;
		this.carname = carname;
		this.variable = variable;
	}

	public CarStory() {
		super();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	public double getVariable() {
		return variable;
	}

	public void setVariable(double variable) {
		this.variable = variable;
	}



}
