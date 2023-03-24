package ch07.sec03.exam02;

public class SmartPhoneExample {
	public static void main(String[] args) {
		// SmartPhone 객체 생성
		SmartPhone myPhone = new SmartPhone("Galxy", "Silver");

		// Phone으로부터 상속 받은 필드 읽기
		System.out.println("model: " + myPhone.model);
		System.out.println("color: " + myPhone.color);
	}
}
