package com.poscodx.container.videosystem;

import java.util.List;

public class DVDPack {
	private String title;
	private List<DigitalVideoDisc> dvds;
	
	public DVDPack(String title, List<DigitalVideoDisc> dvds) {
		this.setTitle(title);
		this.setDvds(dvds);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<DigitalVideoDisc> getDvds() {
		return dvds;
	}

	public void setDvds(List<DigitalVideoDisc> dvds) {
		this.dvds = dvds;
	}
}
