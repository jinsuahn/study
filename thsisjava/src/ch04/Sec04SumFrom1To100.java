package ch04;

public class Sec04SumFrom1To100 {
	public static void main(String[] args) {
		int sum = 0;
		int i;
		
		for(i=1; i<=100; i++) {
			sum += i;
		}
		System.out.println("1" + (i-1) + " 합 : " + sum);
	}
}
