package step6_02.method;

//2021.03.09 21:01 ~ 21:09

class Ex07 {
	
	void printEvenOrOdd(int x) {
		
		if ( x % 2 == 0) System.out.println(x + "는 짝수입니다.");
		else System.out.println(x + "는 홀수입니다.");
		
	}
	void sumBetweenValues(int x, int y) {
	
		int sumofParameter = 0;
		
		for (int i = x; i <= y; i++) {
			
			sumofParameter += i;
		}
		
		System.out.println(x + "부터 " + y + "까지의 합은 " + sumofParameter
				+ "입니다. ");
		
	}

	void printPrimeNums(int primeNumber) {
	
		System.out.print("2 3 ");
		
		for (int i = 3; i < primeNumber; i++) {
			
			int sqrtNumber = (int) Math.sqrt(i);
			
			for (int j = 2; j <= sqrtNumber ; j++) {
				
				if ( i % j == 0) {
					
					break;
				}
				
				if ( j == sqrtNumber ) {
					
					
					System.out.print(i + " ");
				}
			}
			
		}
	}
}


public class MethodEx07_정답 {

	public static void main(String[] args) {
		
		
			Ex07 e = new Ex07();
			
			// 문제 1) num이 홀수인지 짝수인지 출력하는 메서드
			int num = 19;
			e.printEvenOrOdd(num);
	
			// 문제 2) x부터 y까지의 합을 출력하는 메서드
			int x = 1;
			int y = 10;
			e.sumBetweenValues(x, y);
	
			// 문제3) 2부터 primeNumber까지의 소수를 전부 출력하는 메서드 
			int primeNumber = 20;
			e.printPrimeNums(primeNumber);
		



	}

}
