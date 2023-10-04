package com.poscodx.container.user;

public class Friend {
	private String name;
	
	public Friend(String name) {
		this.setName(name);
	}

	@Override
	public String toString() {
		return "Friend [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
