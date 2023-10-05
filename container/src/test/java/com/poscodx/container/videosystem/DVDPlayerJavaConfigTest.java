package com.poscodx.container.videosystem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.poscodx.container.config.videosystem.DVDPlayerConfig;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes= {DVDPlayerConfig.class})
public class DVDPlayerJavaConfigTest {
	
	@Autowired
	// 같은 타입의 빈이 2개 이상 있는 경우
	// 설정 클래스의 빈생성 메소드의 @Bean의 name(default)
	@Qualifier("dvdPlayer")
	DVDPlayer dvdPlayer01;

	@Autowired
	// 같은 타입의 빈이 2개 이상 있는 경우
	// 그냥 변수 이름 같게 하면 알아서 연결 시켜줌 ㅅㅅ
	DVDPlayer dvdPlayer02;

	@Autowired
	DVDPlayer dvdPlayer03;
	
	@Test
	public void testDVDPlayer01NotNull() {
		assertNotNull(dvdPlayer01);
	}
	
	@Test
	public void testPlay() {
		assertEquals("Playing Movie MARVEL's Avengers", dvdPlayer01.play());
	}
	
	@Test
	public void testDVDPlayer02NotNull() {
		assertNotNull(dvdPlayer01);
	}
	
	@Test
	public void test02Play() {
		assertEquals("Playing Movie MARVEL's Avengers", dvdPlayer02.play());
	}
	
	@Test
	public void testDVDPlayer03NotNull() {
		assertNotNull(dvdPlayer01);
	}
	
	@Test
	public void test03Play() {
		assertEquals("Playing Movie MARVEL's Avengers", dvdPlayer03.play());
	}
}
