package io;

import java.io.*;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectMain implements Serializable {

	public static void main(String[] args) {
		// 객체 단위로 데이터를 기록할 수 있는 클래스의 변수 선언
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("./oos.txt"));

			Member member = new Member();
			member.setEmail("abcdefg@outlook.kr");
			member.setPw("1234");
			member.setPhone("01012345678");

			// 객체를 파일에 기록
			oos.writeObject(member);

			// 읽어올 때는 Output을 Input으로 바꾸기만 하면 됨. 이 때,
			// member.getEmail(); <-Object라서 이러한 형태가 안됨.

			// read로 읽어올 때 object 타입으로 리턴하기 때문에 강제 형 변환을 해서 원래의 자료형으로 되돌려 사용함.
			// Member member=(Member)ois.readObject();
			// System.out.println(member.getEmail());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (oos != null)
					oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
