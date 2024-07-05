package com.techlabs.command.model;

public class RemoteControl {
	ICommand command;

	public RemoteControl(ICommand command) {
		super();
		this.command = command;
	}
	
	public void pressButton() {
		command.execute();
	}
	public void setcommand(ICommand command) {
		this.command=command;
	}
	
}
