package ex02variable;
//국어,영어,수학 점수를 99, 80, 96점으로 입력하고 
//평균점수를 구해서 출력하는 프로그램을 작성하시오.

public class Qu_02_03 {

	public static void main(String[] args) 
	{
		
//		int half=10;
//		int area_int = (int)(half*half*3.14);
//		double area_double = (half*half*3.14);
//		
//		System.out.println("int형 넓이:"+ area_int);
//		System.out.println("double형 넓이:"+ area_double);
		
		
		final double PI =3.14;
		int r=10;
		
		double area_double = (r*r*PI);
		int area_int = (int)area_double;
		
		System.out.println("int형 넓이:"+ area_int);
		System.out.println("double형 넓이:"+ area_double);
		
	}

}
