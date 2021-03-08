package step6_01.classObject;

import java.util.Scanner;

/*
class Ex04 {

	int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
	int[] scores  = new int[5];
	
}
*/

//2021.03.08 20:06 ~ 20:23
public class ClassEx04_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		Ex04 studentArray = new Ex04();
		
		// 문제1) scores배열에 1~100점 사이의 정수를 5개 저장
		// 예   1) 87, 11, 92, 14, 47
		
		for (int i = 0; i < studentArray.scores.length; i++) {
			
			switch(i) {
			case 0 :
				studentArray.scores[i] = 87;
				break;
			case 1 :
				studentArray.scores[i] = 11;
				break;
			case 2 :
				studentArray.scores[i] = 92;
				break;
			case 3 :
				studentArray.scores[i] = 14;
				break;
			case 4 :
				studentArray.scores[i] = 47;
				break;
				
			}
		}
		
		
		
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)
		
		int sumofScore = 0;
		
		for (int i = 0; i < studentArray.scores.length; i++) {
		
			sumofScore += studentArray.scores[i];
			
		}
		
		System.out.println("총점 : " + sumofScore + ", 평균 : " + (double)sumofScore / studentArray.scores.length );
		
		
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명
		
		int numberofPassed = 0;
		
		for (int i = 0; i < studentArray.scores.length; i++) {
			
			if (studentArray.scores[i] >= 60 ) {
				
				numberofPassed ++;
			}
		}
		
		System.out.println(numberofPassed + "명");
		
		// 문제4) 인덱스를 입력받아 성적 출력
		// 정답4) 인덱스 입력 : 1	성적 : 11점
		
		System.out.print("인덱스 입력 : ");
		int indexofStudent = scan.nextInt();
		
		System.out.println("성적 : " + studentArray.scores[indexofStudent]);
		
		System.out.println();
		// 문제5) 성적을 입력받아 인덱스 출력
		// 정답5) 성적 입력 : 11		인덱스 : 1
		
		System.out.print("성적 입력 : ");
		int scoreofStudent = scan.nextInt();
		
		for (int i = 0; i < studentArray.scores.length; i++) {
			
			if (studentArray.scores[i] == scoreofStudent) {
				
				System.out.println("인덱스 : " + i);
				break;
				
			}
		}
		
		System.out.println();
		
		// 문제6) 학번을 입력받아 성적 출력
		// 정답6) 학번 입력 : 1003	성적 : 45점
		
		System.out.print("학번 입력 : ");
		int studentId = scan.nextInt();
		
		for (int i = 0; i < studentArray.hakbuns.length; i++) {
			
			if (studentId == studentArray.hakbuns[i]) {
				
				System.out.println("성적 : " + studentArray.scores[i] + "점");
			}
		}
		System.out.println();
		
		// 문제7) 학번을 입력받아 성적 출력
		// 		단, 없는학번 입력 시 예외처리
		// 예   7)
		// 학번 입력 : 1002		성적 : 11점
		// 학번 입력 : 1000		해당학번은 존재하지 않습니다.
		
		System.out.print("학번 입력 : ");
		int studentId2 = scan.nextInt();
		
		for (int i = 0; i < studentArray.hakbuns.length; i++) {
			
			if (studentArray.hakbuns[i] == studentId2) {
				
				System.out.println("성적 : " + studentArray.scores[i] + "점");
				break;
			}
			
			if (i == studentArray.hakbuns.length - 1) {
				
				System.out.println("해당 학번은 존재하지 않습니다.");
			}
		}
		
		System.out.println();
		// 문제8) 1등학생의 학번과 성적 출력
		// 정답8) 1004번(98점)
		
		int maxScore = 0;
		int maxId = -1;
		
		for (int i = 0; i < studentArray.scores.length; i++) {
			
			if (studentArray.scores[i] > maxScore) {
				
				maxScore = studentArray.scores[i];
				maxId = i;
				
			}
		}
		
		System.out.println(studentArray.hakbuns[maxId] + "(" + maxScore + "점)");

	}

}
