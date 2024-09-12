package com.kh.practice.list.music.controller;

import java.util.*;

import com.kh.practice.list.music.model.compare.AscTitle;
import com.kh.practice.list.music.model.vo.Music;

public class MusicController {

// 필드
	private List<Music> list = new ArrayList<>();

// 메서드
	public int addList(String title, String singer) {
		// DB 추가에 성공하면 1, 실패하면 0
		// 추가 성공 ? true : false
		return list.add(new Music(title, singer)) ? 1 : 0;
	}

	public int addAtZero(String title, String singer) {
		// 목록에 추가 하는데, 맨 앞에 다시 새로 자리 값을 만들고,
		// 내가 추가하는 값이, 무조건 0번째 자리(맨 앞)의 새로운 값이 될 수 있도록 해준 것이다.
		list.add(0, new Music(title, singer));
		return 1;
	}

	public List<Music> printAll() {
		return list;
	}

	public Music searchMusic(String title) {
		for(Music music : list) {
			if(music.getTitle().equals(title)) {
			return music;
			}
		}
		return null;
	}

	public Music removeMusic(String title) {
		// List 는 .length() 가 아니라 .size() 를 사용한다.
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				return list.remove(i);
			}
		}
		return null;
	}
	
	public Music setMusic(String title, String singer) {
		for(Music music : list) {
			if(music.getTitle().equals(title)) {
				music.setSinger(singer);
				return music;
			}
		}
		return null;
	}
	
	public void ascTitle() {
		Collections.sort(list);
	}
	
	public void descSinger() {
		Collections.sort(list, new AscTitle());
	}

}
