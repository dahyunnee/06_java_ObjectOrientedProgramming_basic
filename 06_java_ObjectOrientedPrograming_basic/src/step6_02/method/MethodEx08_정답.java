package step6_02.method;


//2021.03.09 21:11 ~ 21:14
class Ex08 {
	
	void printSum(int[] arr) {
		
		int sumofArray = 0;
		for (int i = 0; i < arr.length; i++) {
			
			sumofArray += arr[i];
		}
		
		System.out.println(sumofArray);
		
	}
	void printSumMultiple4(int[] arr) {
		
		int sumofMultiple4 = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] % 4 == 0) {
				
				sumofMultiple4 += arr[i];
			}
		}
		
		System.out.println(sumofMultiple4);
	}
	void printCountMultiple4(int[] arr) {
		
		int numberofMultiple4 = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] % 4 == 0) {
				
				numberofMultiple4 ++;
			}
		}
		
		System.out.println(numberofMultiple4);
	}
	
}


public class MethodEx08_정답 {

	public static void main(String[] args) {
		
		Ex08 ex = new Ex08();
		
		int[] arr = { 87, 100, 11, 72, 92 };

		// 문제 1) arr요소의 전체 합을 출력하는 메서드
		// 정답 1) 362
		
		ex.printSum(arr);
		
		// 문제 2) 4의 배수의 합을 출력하는 메서드
		// 정답 2) 264
		
		ex.printSumMultiple4(arr);

		// 문제 3) 4의 배수의 개수를 출력하는 메서드
		// 정답 3) 3
		
		ex.printCountMultiple4(arr);
		

	}

}
