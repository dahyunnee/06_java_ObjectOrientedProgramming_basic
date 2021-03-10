package step6_02.method;

import java.util.Scanner;

//2021.03.10 20:46 ~ 20:55

/*
 * # 숫자 이동하기 : 클래스 + 메서드
 * 1. 숫자 8은 캐릭터이다.
 * 2. 숫자 1을 입력하면, 캐릭터가 왼쪽으로 이동한다.
 * 3. 숫자 2를 입력하면, 캐릭터가 오른쪽으로이동한다.
 * 4. 좌우 끝에 도달했을 때 에러가 발생하지 않도록 예외처리를 해준다.
 */

class NumberGame{
	
	Scanner scan = new Scanner(System.in);

	int[] move = {0, 0, 0, 0, 8, 0, 0, 0, 0, 0};
	int playerLocation = 4;
	
	void printPlay() {
		
		for (int i = 0; i < move.length; i++) {
			
			System.out.print(move[i] + " ");
		}
		System.out.println();
		
		this.showMenu();
		
	}
	
	
	
	void showMenu() {
	
		System.out.print("왼쪽 (1) 또는 오른쪽 (2) 또는 종료 (3) : ");
		int getChoice = scan.nextInt();
		
		if (getChoice == 1 ) {
			
			this.moveLeft();
			
		}
		
		else if (getChoice == 2) {
			
			this.moveRight();
		}
		
		else if (getChoice == 3) {
			
			return;
		}
		else {
			
			System.out.println("잘못 선택하셨습니다. ");
		}
		
		this.printPlay();
	}
	
	
	
	void moveLeft() {
		
		move[playerLocation] = 0;
		
		playerLocation --;
		
		if ( playerLocation < 0 ) {
			
			playerLocation ++;
		}
		
		move[playerLocation] = 8;
		
		
	}
	
	
	
	void moveRight() {
		
		move[playerLocation] = 0;
		
		playerLocation ++;
		
		if (playerLocation >= move.length) {
			
			playerLocation --;
		}
		
		move[playerLocation] = 8;
	}
	
	
	
	void run() {
		
		this.printPlay();
		

		return;
	}
	
}

public class MethodEx14_정답 {

	public static void main(String[] args) {
		
		NumberGame g = new NumberGame();
		g.run();

	}

}
