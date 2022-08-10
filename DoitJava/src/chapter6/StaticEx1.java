package chapter6;

import java.io.IOException;

public class StaticEx1 {
	public static void main(String[] args) throws IOException {
		Student james = new Student();
		Student alex = new Student();
		
		System.out.println(james.getStudentNo() + ", " + james.getCardNo());
		System.out.println(alex.getStudentNo() + ", " + alex.getCardNo());
	}
}
