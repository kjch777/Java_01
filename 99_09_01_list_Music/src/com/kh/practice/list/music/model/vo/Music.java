package com.kh.practice.list.music.model.vo;

public class Music implements Comparable<Music> {

// 필드
	private String title;
	private String singer;

// 메서드
	// setter // setter 만들기 전에, 생성됐으면 좋겠는 위치에다 먼저 더블 클릭 해놓고 생성하면 해당 위치에서 생성된다.
	public void setTitle(String title) {
		this.title = title;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	// getter // getter 만들기 전에, 생성됐으면 좋겠는 위치에다 먼저 더블 클릭 해놓고 생성하면 해당 위치에서 생성된다.
	public String getTitle() {
		return title;
	}

	public String getSinger() {
		return singer;
	}

	// 기본 생성자
	public Music() {
		// Ctrl + Space
	}

	// 필수 생성자
	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}
	
	// 목록이나 값이 제대로 출력되지 않을 경우는, String 으로 전달해주는(toString) 값이 없기 때문일 것이다.
	@Override // toString 은 @Override
	public String toString() {
		return "노래 제목 : " + title + " , 가수 이름 : " + singer;
	}
	
	// sort compareTo 비교의 기준을 만들어 주어야 한다.
	@Override
	public int compareTo(Music m) {
		return this.title.compareTo(m.title);
	}

}
