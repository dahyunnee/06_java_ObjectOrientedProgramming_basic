package step6_02.method;

import java.util.Scanner;

//# 틱택토


//2021.03.10 21:31 ~ 


class TicTacToe{
	
	Scanner scan = new Scanner(System.in);
	
	String[][] game = new String[3][3];
	
	int turn = 0;
	int win = 0;		// 1[turn1승리] 2[turn2승리]
	
	// game 배열을 공백(" ")으로 초기화 ( 초기화하지 않을 경우 null 값)
	void setGame() {
		
		for (int i = 0; i < game.length; i++) {
			
			for (int j = 0; j < game[i].length; j++) {
				
				game[i][j] = " ";
			}
		}
	
		
	}
	
	
	
	// 게임 화면 출력
	void showGame() {
		
		System.out.println();
		System.out.println(" [ BOARD ]");
		for (int i = 0; i < game.length; i++) {
			
			System.out.print(" ");
			for (int j = 0; j < game[i].length; j++) {
				
				System.out.print("[" + game[i][j] + "]");
			}
			
			System.out.println();
		}
		
		this.exitCross();
		this.exitHeight();
		this.exitWidth();
		
		
		if (win == 1 || win == 2) return;
		
		this.choiceIdx();
		
		
	}
	
	
	
	
	// 인덱스 선택
	void choiceIdx() {
		
		int person1X = -1;
		int person1Y = -1;
		int person2X = -1;
		int person2Y = -1;
		
		if (turn % 2 == 0) {
			
			System.out.println("[ 사용자 1 ]");
			System.out.print(" y좌표 : ");
			person1Y = scan.nextInt();
			
			System.out.print(" x좌표 : ");
			person1X = scan.nextInt();
			
	
			if (game[person1Y][person1X].equals(" " )) {
				
				game[person1Y][person1X] = "O";
			}
			
			else this.choiceIdx();
			
			turn ++;
		}
		
		else {
			
			System.out.println("[ 사용자 2 ]");
			System.out.print(" y좌표 : ");
			person2Y = scan.nextInt();
			
			System.out.print(" x좌표 : ");
			person2X = scan.nextInt();
			
			
			if (game[person2Y][person2X].equals(" " )) {
				
				game[person2Y][person2X] = "X";
			}
			
			else this.choiceIdx();
			
			turn ++;
		}
		
		this.showGame();
		
		

	}
	
	
	void exitWidth() {
		
		for (int i = 0; i < game.length; i++) {
			
			if (game[i][0].equals(game[i][1]) && game[i][0].equals(game[i][2]) && game[i][2].equals(game[i][1])) {
				
				if (game[i][0].equals("O")) win = 1;
				else win = 2;
			}
		}	
	
	}
	
	
	void exitHeight() {
		
	}
	

	void exitCross() {
		
	}
	
	void run() {
		
		// game 배열을 공백(" ")으로 초기화 ( 초기화하지 않을 경우 null 값)
		setGame();
		
		showGame();
		
		
	}
	
}


public class MethodEx16_정답 {

	public static void main(String[] args) {
		
		TicTacToe tic = new TicTacToe();
		tic.run();

	}

}
