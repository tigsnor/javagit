package Quiz;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

class NumberError extends Exception{//개발자 예외 클래스
	public NumberError() {
		super("[예외처리]1~100사이의 수를 입력하세요");
	}
}

public class QuUpDownGame
{

	public static void main(String[] args) throws NumberError
	{
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int gameCount = 0; 
		
		int com = random.nextInt(10000) % 100 + 1;//1~100사이의 난수
		while(true) 
		{
			int user = 0;
			try { //예외처리
			System.out.println("수를입력하시오");
			user = scanner.nextInt();
			System.out.println(com);
			
			if(user>100 || user<1) { //예외클래스 핸들링
				NumberError er = new NumberError();
				throw er;
			}
			if(com > user)	System.out.print("업!");
			else if(com < user)	System.out.print("다운!");
			gameCount++;//게임카운트 증가		

			
			//4.게임재시작 여부 확인			 
			if(com == user || gameCount>=7) 
			{
				if(com == user) {
					System.out.println("성공하셨습니다.");
				}
				else if(gameCount>=7) {
				System.out.println("실패하셨습니다.");
				}
				System.out.print("게임재시작(1), 종료(0):");
					int restart = scanner.nextInt();
					if(restart==0) {
						break;
					}
					else {
						System.out.println("게임을 다시 시작합니다");
						gameCount=0;
					}			
			}
			}
			catch(InputMismatchException e) {//예외처리
				System.out.println("수를 입력하세요");
			}
		}		
	}
}
