package Quiz;

public class quiz1 {

	public static void main(String[] args) {


		for(int i=2 ; i<=9 ; i++) {
			for(int j=1 ; j<=9 ; j++) {
				if(i==j) 
				{
					j=i;
					System.out.println(i+"X"+j+"=");
				}

				
			}System.out.println(" ");
		}

	}

}
