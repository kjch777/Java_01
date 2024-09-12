package com.kh.practice.list.music.controller;

import java.util.*;

import com.kh.practice.list.music.model.compare.AscTitle;
import com.kh.practice.list.music.model.vo.Music;

public class MusicController {

// �ʵ�
	private List<Music> list = new ArrayList<>();

// �޼���
	public int addList(String title, String singer) {
		// DB �߰��� �����ϸ� 1, �����ϸ� 0
		// �߰� ���� ? true : false
		return list.add(new Music(title, singer)) ? 1 : 0;
	}

	public int addAtZero(String title, String singer) {
		// ��Ͽ� �߰� �ϴµ�, �� �տ� �ٽ� ���� �ڸ� ���� �����,
		// ���� �߰��ϴ� ����, ������ 0��° �ڸ�(�� ��)�� ���ο� ���� �� �� �ֵ��� ���� ���̴�.
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
		// List �� .length() �� �ƴ϶� .size() �� ����Ѵ�.
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
