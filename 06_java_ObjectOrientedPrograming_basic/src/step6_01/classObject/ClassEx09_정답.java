package step6_01.classObject;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * # 기억력 게임 : 클래스 + 변수
 * 1. front 배열 카드 10장을 섞는다.
 * 2. front 배열에서 같은 카드를 골라 카드의 위치를 입력한다.
 * 3. 선택한 2장의 카드가 같은 카드이면, back 배열에 표시한다.
 * 4. 모든 카드가 뒤집히면(back배열의 0이 사라지면) 게임은 종료된다. 
 */

/*
class Ex09{
	
	int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
	int[] back = new int[10];
	int answerCnt = 0;		
	
}
*/

//2021.03.09 19:03 ~ 19:26
public class ClassEx09_정답 {

	public static void main(String[] args) {		
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		Ex09 card = new Ex09();
		
		//front 배열 섞기
		int[] temp = new int[card.front.length];
		
		for (int i = 0; i < card.front.length; i++) {
			
			int randomNumber = rand.nextInt(card.front.length);
			
			if ( temp[randomNumber] == 0 ) {
				
				temp[randomNumber] = card.front[i];
			}
			
			else i--;
		}
		
		card.front = temp;
		
		
		while(true) {
			
			boolean isChecked = false;
			
			//back배열 전부 1이면 while문탈출
			for (int i = 0; i < card.back.length; i++) {
				
				if (card.back[i] == 0) break;
				if (i == card.back.length - 1) isChecked = true;
				
			}
			
			if (isChecked == true) break;
			
			
			//카드 덱 출력
			System.out.println("  ");
			for (int i = 0; i < card.front.length; i++) {
				
				switch(card.front[i]) {
				case 1: System.out.print("*  "); break;
				case 2: System.out.print("%  "); break;
				case 3: System.out.print("#  "); break;
				case 4: System.out.print("@  "); break;
				case 5: System.out.print("&  "); break;
				
					
				}
			}
			System.out.println();
			
			//현재스코어
			
			for (int i = 0; i < card.back.length; i++) {
				
				if (card.back[i] == 0) System.out.print("X  ");
				else System.out.print("O  ");
			}
			
			System.out.println();
			System.out.println();
			
			//인덱스입력받기
			System.out.print(" [인덱스 1] => ");
			int firstIndex = scan.nextInt();
			
			System.out.print(" [인덱스 2] => ");
			int secondIndex = scan.nextInt();
			
			
			//일치하는지 확인
			if (card.front[firstIndex] == card.front[secondIndex]) {
				
				card.back[firstIndex] = 1;
				card.back[secondIndex] = 1;
				
			}
			
			
			
			
		}
		

	}

}
