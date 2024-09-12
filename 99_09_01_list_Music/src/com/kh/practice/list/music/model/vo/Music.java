package com.kh.practice.list.music.model.vo;

public class Music implements Comparable<Music> {

// �ʵ�
	private String title;
	private String singer;

// �޼���
	// setter // setter ����� ����, ���������� ���ڴ� ��ġ���� ���� ���� Ŭ�� �س��� �����ϸ� �ش� ��ġ���� �����ȴ�.
	public void setTitle(String title) {
		this.title = title;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	// getter // getter ����� ����, ���������� ���ڴ� ��ġ���� ���� ���� Ŭ�� �س��� �����ϸ� �ش� ��ġ���� �����ȴ�.
	public String getTitle() {
		return title;
	}

	public String getSinger() {
		return singer;
	}

	// �⺻ ������
	public Music() {
		// Ctrl + Space
	}

	// �ʼ� ������
	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}
	
	// ����̳� ���� ����� ��µ��� ���� ����, String ���� �������ִ�(toString) ���� ���� ������ ���̴�.
	@Override // toString �� @Override
	public String toString() {
		return "�뷡 ���� : " + title + " , ���� �̸� : " + singer;
	}
	
	// sort compareTo ���� ������ ����� �־�� �Ѵ�.
	@Override
	public int compareTo(Music m) {
		return this.title.compareTo(m.title);
	}

}
