package com.techlabs.test;

import com.techlabs.model1.Audio;
import com.techlabs.model1.Playable;
import com.techlabs.model1.Video;

public class TestAudioVideo {

	public static void main(String[] args) {
		Playable audio=new Audio("abc");
		
		Playable video=new Video("xyz","1080");
		
		
		audio.play();
		audio.pause();
		audio.stop();

		video.play();
		video.pause();
		video.stop();
	}

}
