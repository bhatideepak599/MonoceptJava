package com.techlabs.composite.model;

public class Manager implements IEmployee {
	private int id;
	private String name;
	private String position;

	@Override
	public String toString() {
		return "Developer [Id=" + id + ", Name=" + name + ", Position=" + position + "]";
	}

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

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Manager(int id, String name, String position) {
		super();
		this.id = id;
		this.name = name;
		this.position = position;
	}


	@Override
	public void showEmployesDetails() {
		System.out.println("Id of Manager : "+id);
		System.out.println("Name Of Manager : " + name);
		System.out.println("Working as a " + position);
		System.out.println("----------------------------");

	}

}
