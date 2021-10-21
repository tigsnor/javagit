package ex08class;

class CalculatorEx{
	//계산의 횟수 카운트위한 멤버변수
	int addc;
	int minc;
	int mulc;
	int divc;
	//멤버변수 초기화 메서드
	void init() {
		addc = 0;
		minc = 0;
		mulc = 0;
		divc = 0;
	}
	double add(double add1,double add2) {
		addc++;
		return add1+add2;
	}
	double min(double min1,double min2) {
		minc++;
		return min1-min2;
		
	}
	double mul(double mul1,double mul2) {
		mulc++;
		return mul1*mul2;
		
	}
	double div(double div1,double div2) {
		divc++;
		return div1/div2;
		
	}
	//연산 횟수출력
	void showOpCount()
	{
		System.out.printf("덧셈횟수:%d%n뺄셈횟수:%d%n곱셈횟수:"
				+ "%d%n나눗셈횟수:%d%n",addc,minc,mulc,divc);
	}
}

public class QuSimpleCalculato {
	

	public static void main(String[] args)
	{
		CalculatorEx cal = new CalculatorEx();
		cal.init();
		System.out.println("1 + 2 = " + cal.add(1 , 2));
		System.out.println("10.5 - 5.5 = " + cal.min(10.5 , 5.5));
		System.out.println("4.0 * 5.0 = " + cal.mul(4.0 , 5.0));
		System.out.println("100 / 25 = " + cal.div(100 , 25));
		System.out.println("10.0 * 3.0 = " + cal.mul(10.0 , 3.0));
		cal.showOpCount();
	}	
}
