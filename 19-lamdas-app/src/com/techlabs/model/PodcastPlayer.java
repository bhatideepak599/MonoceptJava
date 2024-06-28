package com.techlabs.model;

public class PodcastPlayer implements MediaPlayer {

	@Override
	public void start() {
		System.out.println("Podcast Player Started.");

	}

	@Override
	public void stop() {
		System.out.println("Podcast Player Stopped.");

	}

	
}
