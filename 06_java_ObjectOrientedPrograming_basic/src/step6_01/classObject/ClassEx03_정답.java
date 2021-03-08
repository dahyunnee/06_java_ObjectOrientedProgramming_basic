package step6_01.classObject;

//# 학생성적관리 프로그램[1단계] : 클래스 + 변수

//class Ex03{
//	int[] arr = {87, 100, 11, 72, 92};
//}


//2021.03.08 19:50 ~ 20:03
public class ClassEx03_정답 {

	public static void main(String[] args) {
		
		Ex03 array = new Ex03();
		
		// 문제 1) 전체 합 출력
		// 정답 1) 362
		
		int sumofArray = 0;
		
		for (int i = 0; i < array.arr.length; i++) {
			
			sumofArray += array.arr[i];
		}
		
		System.out.println(sumofArray);
		
		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
		
		int sumofMultiple4 = 0;
		int numberofMultiple4 = 0;
		
		for (int i = 0; i < array.arr.length; i++) {
			
			if (array.arr[i] % 4 == 0) {
				
				sumofMultiple4 += array.arr[i];
				numberofMultiple4 ++;
				
			}
		}
		
		System.out.println(sumofMultiple4);
		
		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3
		
		System.out.println(numberofMultiple4);
		
		
		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3
		
		int numberofMultiple2 = 0;
		
		for (int i = 0; i < array.arr.length; i++) {
			
			if (array.arr[i] % 2 == 0) {
				
				numberofMultiple2 ++;
			}
		}
		
		System.out.println(numberofMultiple2);



	}

}
