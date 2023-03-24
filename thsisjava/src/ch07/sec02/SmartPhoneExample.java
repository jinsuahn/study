package ch07.sec02;

public class SmartPhoneExample {
	public static void main(String[] args) {
		// SmartPhone 객체 생성
		SmartPhone myPhone = new SmartPhone("Galaxy", "Silver");

		// Phone으로부터 상속받은 필드 읽기
		System.out.println("model: " + myPhone.model);
		System.out.println("color: " + myPhone.color);

		// SmartPhone의 필드 읽기
		System.out.println("wifi status: " + myPhone.wifi);

		// Phone으로부터 상속받은 메소드 호출
		myPhone.bell();
		myPhone.sendVoice("Hello?");
		myPhone.receiveVoice("Hi, this is Jason.");
		myPhone.sendVoice("Oh, I see. Nice to meet you.");
		myPhone.hangUp();

		// SmartPhone의 메소드 호출
		myPhone.setWifi(true);
		myPhone.internet();
	}
}
