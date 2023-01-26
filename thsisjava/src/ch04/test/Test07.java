package ch04.test;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		// while 문과 Scanner의 nextLine() 메소드를 이용해서 다음 실행 결과와 같이 키보드로부터
		// 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드를 작성해보세요.
		// ---------------------------------------
		// 1.예금 | 2.출금 | 3.잔고 | 4.종료
		// ---------------------------------------
		// 선택> 1
		// 예금액>10000
		
		// ---------------------------------------
		// 1.예금 | 2.출금 | 3.잔고 | 4.종료
		// ---------------------------------------
		// 선택> 2
		// 출금액>2000
		
		// ---------------------------------------
		// 1.예금 | 2.출금 | 3.잔고 | 4.종료
		// ---------------------------------------
		// 선택>3
		// 잔고>8000
		
		// ---------------------------------------
		// 1.예금 | 2.출금 | 3.잔고 | 4.종료
		// ---------------------------------------
		// 선택>4
		//
		// 프로그램 종료
		
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------");
			System.out.println("선택> ");
			
			int menuNum = scanner.nextInt();
			
			switch(menuNum) {
			case 1:
				System.out.println("예금액> ");
				balance += scanner.nextInt();
				break;
			case 2:
				System.out.println("출금액> ");
				balance -= scanner.nextInt();
				break;
			case 3:
				System.out.println("잔고> ");
				System.out.println(balance);
				break;
			case 4:
				run = false;
				break;
			}
			
			System.out.println();
		}
		
		System.out.println("프로그램 종료");
	}
}
