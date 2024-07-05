package com.techlabs.command.model;

public class OffCommand implements ICommand {
	private Television tv;

	public OffCommand(Television tv) {
		super();
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.off();

	}

}
