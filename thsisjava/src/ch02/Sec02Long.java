package ch02;

public class Sec02Long {

	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		long var3 = 10000000000;	//컴파일러는 int로 간주하기 때문에 에러발생
		long var4 = 10000000000L;

		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}

}
