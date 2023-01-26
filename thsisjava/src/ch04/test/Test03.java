package ch04.test;

public class Test03 {
	public static void main(String[] args) {
		// for 문을 이용해서 1부터 10까지의 정수 중에서 3의 배수의 총합을 출력하는 코드를 작성해보세요.
		int sum = 0;
		for(int i=1; i<10; i++) {
			if(i%3 == 0) {
				sum += i;
			}
		}
		System.out.println("3의 배수의 합: " + sum);
	}
}
