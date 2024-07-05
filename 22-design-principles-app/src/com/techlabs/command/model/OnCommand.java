package com.techlabs.command.model;

public class OnCommand implements ICommand {

	private Television tv;

	public OnCommand(Television tv) {
		super();
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.on();
	}
	//state pattern
	//deep copy shallow copy

}
