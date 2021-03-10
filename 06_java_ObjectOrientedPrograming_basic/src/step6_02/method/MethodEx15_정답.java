package step6_02.method;

//2021.03.10 21:12 ~ 21:30

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * # 기억력 게임 : 클래스 + 메서드
 * 1. front 배열 카드 10장을 섞는다.
 * 2. front 배열에서 같은 카드를 골라 카드의 위치를 입력한다.
 * 3. 선택한 2장의 카드가 같은 카드이면, back 배열에 표시한다.
 * 4. 모든 카드가 뒤집히면(back배열의 0이 사라지면) 게임은 종료된다. 
 */

class MemoryGame{
	
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	
	int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
	int[] back = new int[10];
	
	int correctCnt = 0;		// 정답을 맞춘 횟수
	
	
	void shuffle() {
		
	
		int[] temp = new int[front.length];
		
		for (int i = 0; i < front.length; i++) {
			
			int randomNumber = ran.nextInt(front.length);
			
			if ( temp[randomNumber] != 0) {
				
				i--;
				continue;
			}
			
			temp[randomNumber] = front[i];
			
		}
		
		front = temp;
		
		
	}
	
	
	
	void printCard() {
		
	
		
		//front배열
		for (int i = 0; i < front.length; i++) {
			
			switch ( front[i] ) {
			
			case 1: System.out.print("*  "); break;
			case 2: System.out.print("#  "); break;
			case 3: System.out.print("%  "); break;
			case 4: System.out.print("$  "); break;
			case 5: System.out.print("@  "); break;
			
			}
		}
		
		System.out.println();
		
		//back배열
		
		for (int i = 0; i < back.length; i++) {
			
			if (back[i] == 1) System.out.print("O  ");
			else System.out.print("X  ");
		}
		
		System.out.println();
		
		for (int i = 0; i < back.length; i++) {
			
			if (back[i] == 0) break;
			
			if ( i == back.length - 1 && back[i] == 1) {
				
		
				return;
			}
		}
		

		this.choiceCard();
		
	}
	
	
	
	void choiceCard() {
		
		System.out.print("첫번째 인덱스 : ");
		int firstIndex = scan.nextInt();
		
		System.out.print("두번째 인덱스 : ");
		int secondIndex = scan.nextInt();
		
		if (front[firstIndex] == front[secondIndex]) {
			
			back[firstIndex] = 1;
			back[secondIndex] = 1;
			
		}
		
		this.printCard();
		return;
		
	}
	
	
	
	void run() {
		
		this.shuffle();
		this.printCard();
		
	}
	
}

public class MethodEx15_정답 {

	public static void main(String[] args) {

		MemoryGame g = new MemoryGame();
		g.run();

	}

}
