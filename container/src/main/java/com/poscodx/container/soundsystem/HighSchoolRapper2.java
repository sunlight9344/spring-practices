package com.poscodx.container.soundsystem;

import org.springframework.stereotype.Component;

@Component
public class HighSchoolRapper2 implements CompactDisc {
	
	private String title = "뿌뿌";
	private String artist = "기목지";
	
	@Override
	public String play() {
		return "Playing " + title +" by " + artist;
	}

}
