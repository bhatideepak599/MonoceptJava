package com.techlabs.model1;

public class Audio implements Playable{
	private String title;
	
	
	public Audio(String title) {
		super();
		this.title = title;
	}

	@Override
	public void play() {
		System.out.println(title+" is Playing");
		
	}

	@Override
	public void pause() {
		System.out.println(title+" is Paused");
		
	}

	@Override
	public void stop() {
		System.out.println(title+" is Stopped");
		
	}
	
}
