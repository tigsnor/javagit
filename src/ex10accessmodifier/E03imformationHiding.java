package ex10accessmodifier;

/*
세번째 버전에서는 초기화 메서드를 생성자로 변경해본다.
 */

//과일판매자를 추상화한 클래스
class FruitSeller6{
	//외부클래스에서 접근할 수 없도록 private
	private int numOfApple; //판매자가 보유한 사과갯수  
	private int myMoney; //판매수익
	private final int APPLE_PRICE; //사과의 단가
	/*
		상수는 값의 변경이 불가능하고, 단 한번만 초기화되기 때문에
		일반 멤버메서드에서는 초기화 할 수 없다. 
		하지만 생성자는 객체생성시 딱 한번만 호출되고, 개발자가 마음대로
		호출할 수 없으므로 한번이상 초기화 되지 않음이 보장된다. 
		따라서 멤버상수는 생성자에서 초기화 할 수 있다. 
	 */ 	 
	public FruitSeller6(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		APPLE_PRICE = price;
	}
	 
	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	//판매자의 현재 상태를 출력한다.
	public void showSaleResult() {
		System.out.println("[판매자]남은사과갯수:"+ numOfApple);
		System.out.println("[판매자]판매수익:"+ myMoney);
	}
}

//구매자를 추상화한 클래스
public class E03imformationHiding
{

	private int myMoney; //보유한 금액
	private int numOfApple; //구매한 사과의 갯수
	
	//초기화 메서드 선언
	public E03imformationHiding(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
	}
	 
	public void buyApple(FruitSeller6 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	//구매자가의 현재상태 출력
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액:"+ myMoney);
		System.out.println("[구매자]사과갯수:"+ numOfApple);
	}
}

//프로그램의 출발점이 되는 메인 클래스
