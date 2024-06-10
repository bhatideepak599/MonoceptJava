package com.techlabs.model1;

public class Video implements Playable{
	
	private String title;
	private String resolution;
	
	
	

	public Video(String title, String resolution) {
		super();
		this.title = title;
		this.resolution = resolution;
	}

	@Override
	public void play() {
		System.out.println(title+" is Playing at resolution "+resolution );
		
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
