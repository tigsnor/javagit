package ex04controlstatement;
//문제1) 파일명 : Qu_04_01.java
//하나의 문자를 입력받아 숫자인지 여부를 판단하는 프로그램을 삼항연산자를 이용하여 구현하시오.	
//(System.in.read()를 사용하세요)

import java.io.IOException;

public class Qu_04_01 {

	public static void main(String[] args) throws IOException {
		
		System.out.print("하나의 문자를 입력하세요:");
		int number = System.in.read();		
		String numberR = (number>='0' && number<='9') ? "숫자입니다.":"숫자가아닙니다.";
		System.out.println(numberR);
		

	}

}
