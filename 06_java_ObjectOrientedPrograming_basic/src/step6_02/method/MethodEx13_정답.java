 package step6_02.method;

 
 //2021.03.10 20:33 ~ 20:45
 
import java.util.Scanner;

/*
 * # 영화관 좌석예매 : 클래스 + 메서드
 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
 * 2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
 * 4. 한 좌석당 예매 가격은 12000원이다.
 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
 * 예)
 * seat = 0 0 0 0 0 0 0
 * 
 * 좌석선택 : 1
 * seat = 0 1 0 0 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 이미 예매가 완료된 자리입니다.
 * ----------------------
 * 매출액 : 24000원
 */

class Theater{
	
	Scanner scan = new Scanner(System.in);

	int[] seat = new int[10];
	int bookCnt = 0;				
	int money = 0;					
	
	
	void showMenu() {
		
		System.out.println("=== 메가박스 ===");
		System.out.println("1.예매하기");
		System.out.println("2.종료하기");
		
	}
	
	
	
	void showSeat() {
		
		System.out.print("seat = ");
		
		for (int i = 0; i < seat.length; i++) {
			
			System.out.print(seat[i] + " ");
			
		}
		
		System.out.println();
		System.out.println();
	}
	
	
	
	void choiceSeat() {
	
		System.out.print("좌석 선택 : ");
		int chosenSeat = scan.nextInt();
		
		
		if ( chosenSeat < 0 || chosenSeat >= seat.length) {
			
			System.out.println("존재하지 않는 좌석입니다.");
			System.out.println();
			return;
		}
		if ( seat[chosenSeat] == 1) {
			
			System.out.println("이미 예약된 좌석입니다.");
			System.out.println();
			return;
		}
		
		seat[chosenSeat] = 1;
		System.out.println();
		
		this.showSeat();
		
	}
	
	
	
	void showSales() {
		
		int countBookedSeats = 0;
		
		for (int i = 0; i < seat.length; i++) {
			
			if (seat[i] == 1 ) countBookedSeats ++;
		}
		
		System.out.println("총 매출액 : " + countBookedSeats * 12000 + "원");
		return;
		
	}
	
	void run() {
		
		this.showMenu();
		
		System.out.print("선택 ( 1 or 2 ) : ");
		int getChoice = scan.nextInt();
		
		if (getChoice == 1) {
			
			
			this.showSeat();
			this.choiceSeat();
			this.run();
		}
		
		else if (getChoice == 2) {
			
			this.showSales();
			
			return;
		}
		
		else {
			
			System.out.println("잘못 선택하셨습니다.");
			this.run();
		}
		
	}
}

public class MethodEx13_정답 {

	public static void main(String[] args) {

		Theater megabox = new Theater();
		megabox.run();
		
	}

}
