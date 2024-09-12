package com.kh.practice.score.model.dao;

import java.io.*;

public class ScoreDAO {

	private final String FILE_PATH = "score.txt";
	
	public void saveScore(String name, int kor, int eng, int math, int sum, double avg) {
		
		// try �� �����ϱ� ��, ���Ǹ� ������ ���ڴٴ� ��
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(FILE_PATH, true))) {
			
			dos.writeUTF(name);
			dos.writeInt(kor);
			dos.writeInt(eng);
			dos.writeInt(math);
			dos.writeInt(sum);
			dos.writeDouble(avg);
			
			System.out.println("������ ���������� ����Ǿ����ϴ�.");
		} catch (Exception e) {
			//   Exception ���� �������.
			e.printStackTrace();
		}
	}
	
	public DataInputStream readScore() throws Exception {
		return new DataInputStream(new FileInputStream(FILE_PATH));
	}

}
