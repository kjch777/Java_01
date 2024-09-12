package com.kh.javaAPIEx;
/*
 String : ���ڿ��� ��Ÿ���� Ŭ����
  		  ���ڿ��� �����ϰ�, �����ϴµ� ����Ѵ�.
  		  
 String str = new String(); - String ����, �� ����� ���� ���̻� ������� �ʴ´�.
 String str = "";
 
 �ڵ� �׽�Ʈ��, ���ڸ� �ڸ��� ������ �� ����ϴ� �޼��� ��
 
 substring // ���� �ҹ��� == ���� �����ϰ� ���� ���ں���, ������ ���� ���ڱ��� �����ؼ� ������ �� �ִ�. 
 substring(�����ϴ� ����, ������ ����) = �ε��� ��
 substring(�����ϴ� ����)          = ���� ���ں��� ������ ���ڱ��� ��� �����ϰų� ����Ѵٴ� ��
 
 toUpperCase() = ���ϴ� ���ڿ��� ��� �빮�ڷ� ��ȯ�� �� ����Ѵ�.
 toLowerCase() = ���ϴ� ���ڿ��� ��� �ҹ��ڷ� ��ȯ�� �� ����Ѵ�.
        trim() = ���ϴ� ���ڿ��� �� �� ������ ��� �����ϰ� �������� �� ����Ѵ�.
       split() = ���ڿ��� Ư�� ������ �������� �����ϰ�, ���ڿ� �迭�� ��ȯ
     replace() = ���ڿ�����, Ư�� ���ڿ��� ���ο� ���ڿ��� ��ü
      charAt() = ���ڿ�����, �־��� �ε����� �ش��ϴ� ���� �ϳ��� ��ȯ
 */
public class StringEx {
	
	public static void main(String[] args) {
		
		String str1 = "Hello";
		String str2 = "World";
		String str3 = str1 + ", " + str2 + ".";
		System.out.println(str3);
		
		// Garbage Collection
		// �ڵ����� ����ϰ�, ���̻� ������ ���� ���� �ڵ����� ���ִ� ��
		String phone = "010";
		phone += "-1234-5378"; // �̷��� �ϸ� ���� "010"; �� ���� ��������.
		System.out.println(phone);
		
		/*              
		                0 1 2 3 4 5 6 7 8 9 10		// 5 �� ����
		 String ���ڿ� = "H e l l o   W o r l  d"; 
		 */
		String ���ڿ� = "Hello World";
		
		// 1. substring() // ���� �ҹ���
		String ���꽺Ʈ�� = ���ڿ�.substring(6);
		System.out.println(���꽺Ʈ��);
		String ���꽺Ʈ��1 = ���ڿ�.substring(6, 8); // 6 ���� 7 ������ �����شٴ� �ǹ�
		System.out.println(���꽺Ʈ��1);
		
		// 2. toUpperCase()
		String �빮�� = ���ڿ�.toUpperCase();
		System.out.println("�빮�� �¾�? : " + �빮��);
		
		// 3. toLowerCase()
		String �ҹ��� = ���ڿ�.toLowerCase();
		System.out.println("�ҹ��� �¾�? : " + �ҹ���);
		
		// 4. trim() == ���ڿ��� �հ� ���� ������ ���ŵ�����, ���ڿ� ������ ������ ���ŵ��� �ʴ´�.
		String ������� = "     Hello     World     ";
		String �������� = �������.trim();
		System.out.println("���� ��������? : " + ��������);
		
		// 5. split == ���ڿ��� Ư�� ������ �������� �����ϰ�, ���ڿ� �迭�� ��ȯ 
		String ���ϵ� = "apple,banana,grape";
		String[] ���Ϲ迭 = ���ϵ�.split(",");
		
		// for - each ��
		for(String ���� : ���Ϲ迭) {
			System.out.println(����);
		}
		
		// 6. replace == Ư�� ���ڿ��� ���ο� ���ڿ��� ��ü 
		String ��ο��� = "Hello, World!";
		String ���� = ��ο���.replace("Hello", "Hi");
		System.out.println(����);
		
		// 7. charAt == ���ڿ�����, �־��� �ε����� �ش��ϴ� ���� �ϳ��� ��ȯ
		String ���̿��� = "Hi, World!";
		char ch = ���̿���.charAt(8);
		System.out.println(ch);
		
	}
	
}
