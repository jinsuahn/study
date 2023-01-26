package ch02.sec11;

import ch02.sec06.String;

public class VariableScope {

	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) {
			int v2 = v1 - 10;
		}
		int v3 = v1 + v2 + 5;
	}

}
