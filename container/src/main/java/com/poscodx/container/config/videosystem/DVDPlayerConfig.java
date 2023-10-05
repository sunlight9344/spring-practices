package com.poscodx.container.config.videosystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.poscodx.container.videosystem.Avengers;
import com.poscodx.container.videosystem.DVDPlayer;
import com.poscodx.container.videosystem.DigitalVideoDisc;

@Configuration
public class DVDPlayerConfig {
	@Bean
	public DigitalVideoDisc avengers() {
		return new Avengers();
	}
	
	// 주입(Injection)하기 I
	// Bean 생성메소드를 직접 호출하는 방법
	// 주입하는 방식은 생성자 주입
	@Bean(name="dvdPlayer")
	public DVDPlayer dvdPlayer01() {
		return new DVDPlayer(avengers());
	}
	
	// 주입(Injection)하기 II
	// Parameter로 Bean 전달하는 방법 레쓰기릿
	// 주입하는 방식은 생성자 주입
	@Bean
	public DVDPlayer dvdPlayer02(DigitalVideoDisc dvd) {
		return new DVDPlayer(dvd);
	}
	
	// 주입(Injection)하기 III
	// Parameter로 Bean 전달하는 방법 레쓰기릿
	// 주입하는 방식은 생성자 주입
	@Bean
	public DVDPlayer dvdPlayer03(DigitalVideoDisc dvd) {
		DVDPlayer dvdPlayer = new DVDPlayer();
		dvdPlayer.setDvd(dvd);
		return dvdPlayer;
	}
}
