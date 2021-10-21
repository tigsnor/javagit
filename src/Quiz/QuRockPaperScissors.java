package Quiz;

import java.util.Random;
import java.util.Scanner;

public class QuRockPaperScissors 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int gameCount = 0;
		
		int com = random.nextInt(10000)%3+1;//1~3사이의 난수
		
		int user=0;
		System.out.println("가위바위보를 입력하세요.");
		System.out.println("가위(1), 바위(2), 보(3)=>");
		user = scan.nextInt();
		if(user>=1 && user<=3) {
			while(gameCount<=5){
				
			}
			gameCount++;
		}
		else {
			System.out.println("가위바위보 할줄 모르세요? 제대로 내세요^^");
		}
	}
}