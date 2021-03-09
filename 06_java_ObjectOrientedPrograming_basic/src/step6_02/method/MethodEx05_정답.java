package step6_02.method;

import java.util.Scanner;

class Ex05{

	void test1() {
		
		int sumofArray = 0;
		
		for (int i = 1; i < 6 ; i++) {
			
			sumofArray += i;
		}
		
		System.out.println("1부터 5까지 합 : " + sumofArray);
	}
	
	void test2() {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[3];
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print("숫자 1개 입력 : ");
			arr[i] = scan.nextInt();
		}
		
		int maxNum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (maxNum < arr[i]) {
				
				maxNum = arr[i];
			}
			
		}
		
		System.out.println("최댓값 : " + maxNum);
		scan.close();
	}
	
}


//2021.03.09 20:40 ~ 20:47
public class MethodEx05_정답 {

	public static void main(String[] args) {

		/*
			Ex05 e = new Ex05();
						
			// 문제 1) 1부터 5까지의 합을 출력하는 메서드
			e.test1();
			
			// 문제 2) 정수 3개를 배열에 입력받아 최대값을 출력하는 메서드
			e.test2();
		*/
		
		
		Ex05 ex = new Ex05();
		
		ex.test1();
		
		ex.test2();
		
		

	}

}
