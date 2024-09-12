package com.kh.practice.list.music.model.compare;

import java.util.Comparator;

import com.kh.practice.list.music.model.vo.Music;

public class AscTitle implements Comparator<Music> {

// ¸Þ¼­µå
	@Override
	public int compare(Music m1, Music m2) {
		return m1.getTitle().compareTo(m2.getTitle());
	}
	
}
