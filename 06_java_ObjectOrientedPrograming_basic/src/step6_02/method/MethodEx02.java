package step6_02.method;

/*
 * 
 *  # 메서드의 4가지 형태
 * 
 * 입력값(파라메타,매개변수,인수,인자,아규먼트)과 
 * 결과값(return)의 유무에 따라 4가지 형태로 나뉜다.
 * 
 * 입력값이 있고 , 결과값이 있다. ( 11 )
 * 입력값이 있고 , 결과값이 없다. ( 10 )
 * 입력값이 없고 , 결과값이 있다. ( 01 )
 * 입력값이 없고 , 결과값이 없다. ( 00 )
 * 
 * */

class MethodType {
	
	int type11(int arg1, int arg2) {
		
		System.out.println("type11 메소드 호출");
		return arg1 + arg2;
	}
	
	void type10 (int arg1, int arg2) {
		
		System.out.println("type10 메소드 호출");
		System.out.println("두 인자의 합 : " + (arg1 + arg2));
	}
	
	double type01 () {
		
		System.out.println("type01 메소드 호출");
		return 3.141592;
	}
	
	void type00 () {
		
		System.out.println("type00 메소드 호출");
	}
}

public class MethodEx02 {
	
	public static void main(String[] args) {
		
		
		MethodType mt = new MethodType();
		
		//입력값은 있고 결과값이 없는 경우
		mt.type10(3, 7);
		mt.type10(3, 70);
		mt.type10(30, 70);
		// mt.type10(3.14, 5.18); 	불가능 : 매개변수 타입이 일치해야 한다.
		// mt.type10(300);		불가능 : 매개변수의 개수가 일치해야 한다.
		
		
		System.out.println("================================");
		
		//입력값과 결과값이 모두 없는 경우
		mt.type00();
		mt.type00();
		mt.type00();
		
		System.out.println("================================");

		//입력값과 결과값이 모두 있는 경우
		System.out.println(mt.type11(3, 7));
		
		int res1 = mt.type11(30, 70);
		System.out.println(res1);
		
		
		if ( mt.type11(300, 700) == 1000 ) {
			
			System.out.println("결과값은 1000");
		}
		
		int res2 = mt.type11(3000, 7000);
		
		
		if (res2 == 10000) {
			
			System.out.println("결과값은 10000");
		}
		
		
		System.out.println("===============================");
		
		//입력값은 없고 결과값은 있는 경우
		
		System.out.println(mt.type01());
		
		
	}

}
