package chapter6;

public class Student {
	private static int serialNum = 1000;
	int studentNo;
	int cardNo;
	
	public Student() {
		serialNum++;
		studentNo = serialNum;
		cardNo = studentNo + 100;
	}
	
	public int getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	public int getCardNo() {
		return cardNo;
	}
	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}
}
