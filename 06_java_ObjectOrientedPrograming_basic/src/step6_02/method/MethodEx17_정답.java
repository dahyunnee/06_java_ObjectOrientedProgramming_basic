package step6_02.method;

import java.util.Random;
import java.util.Scanner;


//2021.03.11 20:00 ~ 20:34
class SpeedGame {

	Scanner scan = new Scanner(System.in);
	Random ran = new Random();

	int[][] front = new int[3][3];
	int[][] back = new int[3][3];

	int num = 1;

	//00 01 02
	//10 11 12
	//20 21 22
	
	// 숫자 셋팅하기
	void setNumber() {
		
		int k = 1;
		
		for (int i = 0; i < front.length; i++) {
			
			for (int j = 0; j < front[i].length; j++) {
				
				front[i][j] = k ++;
			}
		}
		
		for (int i = 0; i < back.length; i++) {
			
			for (int j = 0; j < back[i].length; j++) {
				
				back[i][j] = k++;
			}
		}
		
		
	}

	
	
	// 카드 섞기
	void shuffleCard() {
		
	
		int[][] temp = new int[3][3];
		int[][] temp2 = new int[3][3];
		
		for (int i = 1; i < 10; i++) {
			
			int randomRow = ran.nextInt(3);
			int randomCol = ran.nextInt(3);
			
			if ( temp[randomRow][randomCol] == 0 ) {
				
				temp[randomRow][randomCol] = i;
				temp2[randomRow][randomCol] = i + 9;
				
				
				continue;
			}
			
			else {
				
				i--;
			}
			
		}
		
		front = temp;
		back = temp2;
		
		temp = null;
		temp2 = null;
		
	}

	
	
	// 화면 출력하기
	void showCard() {
		
		System.out.println("[ BOARD ]");
		for (int i = 0; i < front.length; i++) {
			
			System.out.print("  ");
			for (int j = 0; j < front[i].length; j++) {
				
				if ( front[i][j] != 0) System.out.print( front[i][j] + " ");
				else System.out.print(back[i][j] + " ");
				
			}
			
			System.out.println();
		}
		
		if (num == 19) return;
		
		this.selectCard();
	}

	
	
	// 입력받기
	void selectCard() {
		
		System.out.print("[ Y좌표 ] : ");
		int getY = scan.nextInt();
		
		if (getY < 0 || getY >= front.length) {
			
			System.out.println("잘못된 Y좌표입니다.");
			this.selectCard();
		}
		
		
		System.out.print("[ X좌표 ] : ");
		int getX = scan.nextInt();
		
		
		if (getX < 0 || getX >= front.length) {
			
			System.out.println("잘못된 X좌표입니다.");
			this.selectCard();
		}
		
		
		if ( num < 10 ) {
			
			if (front[getY][getX] == num) {
				
				front[getY][getX] = 0;
				num++;
			}
			
		}
		else if (num < 19) {
			
			
			if (back[getY][getX] == num) {
				
				back[getY][getX] = 0;
				num++;
			}
		
		}
		
		this.showCard();
		
		
	}

	
	
	void run() {

		this.setNumber();
		this.shuffleCard();
		this.showCard();
		
	}
	
}



public class MethodEx17_정답 {

	public static void main(String[] args) {
		
		SpeedGame sg = new SpeedGame();
		sg.run();

	}

}
