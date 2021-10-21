package ex04controlstatement;

public class Prac {

	public static void main(String[] args) {
		
		for(int i=1 ; i<=10 ; i++)
		{
			for(int j=1 ; j<=10-i ; j++)
			{
			System.out.print(" ");
			}
			for(int t=1 ; t<=i*2-1 ; t++){
				System.out.print("i");
			}
		System.out.println(" ");	
		}
	}

}
