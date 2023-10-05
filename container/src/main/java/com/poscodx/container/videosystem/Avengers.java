package com.poscodx.container.videosystem;

public class Avengers implements DigitalVideoDisc {

	private String title = "Avengers";
	private String studio = "MARVEL";
	
	@Override
	public String play() {
		return "Playing Movie " + studio + "'s " + title;
	}
	
	//---------------------------------------------------------------------
	
	@Override
	public String toString() {
		return "Avengers [title=" + title + ", studio=" + studio + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStudio() {
		return studio;
	}

	public void setStudio(String studio) {
		this.studio = studio;
	}

}
