package com.altimetrik;

public class Department {

	private String name;
//	private String managerName;
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Department [name=" + name + ", id=" + id + "]";
	}

	public Department(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	

}
