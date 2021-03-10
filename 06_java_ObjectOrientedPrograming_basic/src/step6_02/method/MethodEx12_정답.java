package step6_02.method;

import java.util.Arrays;
import java.util.Random;

/*
 * # OMR카드 : 클래스 + 메서드
 * 1. 배열 answer는 시험문제의 정답지이다.
 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
 * 4. 한 문제당 20점이다.
 * 예)
 * answer = {1, 3, 4, 2, 5}
 * hgd    = {1, 1, 4, 4, 3}
 * 정오표 = {O, X, O, X, X}
 * 성적   = 40점
 */

//2021.03.10 20:28 ~ 20:32

class ScoreMng{
	
	Random ran = new Random();
	
	int[] omr = {1, 4, 3, 2, 2};		// 모범답안
	int[] rNum = new int[5];		// 학생답안
	
	int answerCnt = 0;					// 정답을 맞춘 개수
	int score = 0;						// 성적
	
	// 1.me 답안 완성하기
	void makeAnswer() {
	
		
		for (int i = 0; i < rNum.length; i++) {
			
			int randomNumber = ran.nextInt(5) + 1;
			
			rNum[i] = randomNumber;
		
		}
		
	}
	
	
	
	// 2.정답 출력하기
	void showAnswer() {
		
		System.out.println("<< 정답 >>");
		for (int i = 0; i < omr.length; i++) {
			
			System.out.println(i + "번문제 ) " + omr[i] + "번");
		}
		System.out.println();
		
	}
	
	
	
	// 3.정답 비교하기
	void checkAnswer() {
		
		System.out.println("<< 내 정답 >> ");
		for (int i = 0; i < omr.length; i++) {
			
			
			System.out.println(i + "번문제 ) " + rNum[i] + "번");
			
			if ( omr[i] == rNum[i] ) {
				
				answerCnt ++;
			}
		}
		
		score = answerCnt * 20;
		
		System.out.println();
		System.out.println("최종 점수는 " + score + "점 입니다. ");
		
	}
	
	
	
	// 4.실행하기
	void run() {
		makeAnswer();
		showAnswer();
		checkAnswer();
	}
	
}

public class MethodEx12_정답 {

	public static void main(String[] args) {
		
		ScoreMng sm = new ScoreMng();
		sm.run();

	}

}
