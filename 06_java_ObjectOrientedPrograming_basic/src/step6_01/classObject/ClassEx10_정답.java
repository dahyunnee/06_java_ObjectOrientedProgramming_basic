package step6_01.classObject;
/*
 * # 영수증 출력하기 : 클래스 + 변수
 * 1. 햄버거 주문을 받아 영수증을 출력한다.
 * 2. 출력내용은 각 메뉴의 주문 수량과 총 금액 및 잔돈을 표시한다.
 * 
 * 	맘스터치
 *----------------------
 *ITEM	QTY	AMT
 *치즈버거	1	2500
 *불고기버거	1	3800
 *감자튀김	1	1500
 *콜      라	1	1000
 *----------------------
 *합계금액		8800
 *받은금액		10000
 *----------------------
 *잔       돈		1200
 */

import java.util.Scanner;

/*
class Ex10 {
	String name = "";		// 가게 이름
	
	int[] arPrice   = {    2500,       3800,     1500,  1000};
	String[] arMenu = {"치즈버거", "불고기버거", "감자튀김", "콜      라"};
	
	int[] arCount = new int[4];
	
	int total = 0;
}
*/


// 2021.03.09 19:26 ~ 19:38
public class ClassEx10_정답 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);

		Ex10 menuBoard = new Ex10();
		
		menuBoard.name = "버거킹";
		
		while(true) {
			
			System.out.println("======" + menuBoard.name + "======");
			for (int i = 0; i < menuBoard.arPrice.length; i++) {
				
				System.out.println((i + 1) + ")" + menuBoard.arMenu[i] + " : " + menuBoard.arPrice[i] + "원" );
			}
			
			System.out.println();
			System.out.print("(1) 주문       (2) 영수증 출력  	=> ");
			int inputNumber = scan.nextInt();
			
			if ( inputNumber == 1) {
				
				System.out.print("[ 메뉴 번호 ] => ");
				int menuNumber = scan.nextInt();
				
				if ( menuNumber < 1 || menuNumber > menuBoard.arCount.length ) {
					
					System.out.println("없는 메뉴입니다.");
					System.out.println();
					continue;
				}
				
				menuBoard.arCount[menuNumber - 1] ++;
				
				
			}
			else if (inputNumber == 2) {
				
				for (int i = 0; i < menuBoard.arCount.length; i++) {
					
					menuBoard.total += menuBoard.arCount[i] * menuBoard.arPrice[i];
				}
				
				System.out.println("====== 영수증 ======");
				for (int i = 0; i < menuBoard.arPrice.length; i++) {
					
					System.out.println((i + 1) + ")" + menuBoard.arMenu[i] + " : " + menuBoard.arPrice[i] + "원, " 
							+ menuBoard.arCount[i] + "개");
				}
				
				System.out.println("총 " + menuBoard.total + "원");
				System.out.println();
				
				break;
			}
			else {
				
				System.out.println("잘못 입력");
			}
			
			System.out.println();
		}
		
		
		
	}

}
