package com.techlabs.model;

public interface MediaPlayer {
	void start();
	default void stop() {
		System.out.println("Media Player Stopped.");
	}
	static public void supportedFiles() {
			System.out.println("Supported Files are .mp3 , .mp4,.vob, .mpeg ");

		
	}
}
