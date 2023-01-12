package ch03;

public class Test05 {

	public static void main(String[] args) {
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		//double area = (lengthTop+lengthBottom) * height / 2.0;
		//double area = (lengthTop+lengthBottom) * height * 1.0 / 2;
		double area = (double)(lengthTop+lengthBottom) * height / 2;
		//double area = (double)((lengthTop+lengthBottom) * height / 2);	// 소수 자릿수 x
		System.out.println(area);
	}

}
