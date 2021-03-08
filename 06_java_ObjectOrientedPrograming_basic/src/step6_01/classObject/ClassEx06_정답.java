package step6_01.classObject;

import java.util.Arrays;
import java.util.Random;


/*
 * # OMR카드 : 클래스 + 변수
 * 1. 배열 answer는 시험문제의 정답지이다.
 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
 * 4. 한 문제당 20점이다.
 * 예)
 * answer = {1, 3, 4, 2, 5}
 * hgd    = {1, 1, 4, 4, 3}
 * 정오표     = {O, X, O, X, X}
 * 성적        = 40점
 */

/*
class Ex06{
	int[] answer = {1, 3, 4, 2, 5};		// 시험답안
	int[] hgd = new int[5];				// 학생답안
	
	int answerCnt = 0;					// 정답 맞춘 개수
	int score = 0;						// 성적
}
*/


//2021.03.08 20:37 ~ 20:45
public class ClassEx06_정답 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		Ex06 studentOMR = new Ex06();
		boolean[] isTrue = new boolean[studentOMR.answer.length]; 
		int studentScore = 0;
		
		
		for (int i = 0; i < studentOMR.hgd.length; i++) {
			
			studentOMR.hgd[i] = rand.nextInt(5) + 1;
		}
		
		for (int i = 0; i < studentOMR.hgd.length; i++) {
			
			if (studentOMR.answer[i] == studentOMR.hgd[i]) {
				
				isTrue[i] = true;
				studentScore += 20;
				
			}
			
			else isTrue[i] = false;
		}
		
		
		System.out.println(Arrays.toString(studentOMR.hgd));
		System.out.println();
		
		System.out.print("{ ");
		
		for (int i = 0; i < isTrue.length; i++) {
			
			if (isTrue[i] == true) {
				
				System.out.print("O" );
			}
			else System.out.print("X");
			
			if ( i != isTrue.length - 1) System.out.print(", ");
			
			
		}
		
		System.out.println("}");
		
		System.out.println("성적 : " + studentScore);
		
		

		
	}

}
