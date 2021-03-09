package step6_01.classObject;
/*
 * # ATM[4단계] : 전체 기능구현
 * 1. 회원가입
 * . id와 pw를 입력받아 가입
 * . 가입 시 돈 1000원 부여
 * . id 중복체크
 * 2. 회원탈퇴
 * . 로그인시에만 이용가능
 * 3. 로그인
 * . id와 pw를 입력받아 로그인
 * . 로그아웃 상태에서만 이용가능
 * 4. 로그아웃
 * . 로그인시에만 이용가능
 * 5. 입금
 * . 로그인시에만 이용가능
 * 6. 이체
 * . 로그인시에만 이용가능
 * 7. 잔액조회
 * . 로그인시에만 이용가능
 */

import java.util.Scanner;

/*
class Ex11{
	String name = "";
	
	String[] arAcc = new String[5];
	String[] arPw  = new String[5];
	int[] arMoney  = new int[5];
	
	int accCnt = 0;
	int identifier = -1;
}
*/


//2021.03.09 19:38 ~ 20:04
public class ClassEx11_정답 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Ex11 e = new Ex11();
		e.name = "Mega Bank";
		
		int loginIndex = -1;
		
		for (int i = 0; i < e.arAcc.length; i++) {
			
			e.arAcc[i] = "";
			e.arPw[i] = "";
		}
		
		while (true) {
			
			
			System.out.println("[" + e.name + "]");
			System.out.println("[1]회원가입");
			System.out.println("[2]회원탈퇴");
			System.out.println("[3]로그인");
			System.out.println("[4]로그아웃");
			System.out.println("[5]입금하기");
			System.out.println("[6]이체하기");
			System.out.println("[7]잔액조회");
			System.out.println("[0]종료하기");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if		(sel == 1) {
				
				boolean isOverlapped = false;
				
				//ID 입력받기
				System.out.print("[ ID ] : ");
				String inputId = scan.next();
				
				//ID 중복확인
				for (int i = 0; i < e.arAcc.length; i++) {
					
					if (e.arAcc[i].equals(inputId)) {
						
						System.out.println("중복된 아이디가 존재합니다. ");
						isOverlapped = true;
						break;
					}
				}
				
				//중복시 
				if (isOverlapped == true) continue;
				
				
				//PW 입력받기
				System.out.print("[ PW ] : ");
				String inputPw = scan.next();
				
				
				//등록하기 
				e.arAcc[e.accCnt] = inputId;
				e.arPw[e.accCnt] = inputPw;
				e.arMoney[e.accCnt] += 1000;
				
				e.accCnt ++;
			}
			else if (sel == 2) {
				
				if (loginIndex == -1) {
					
					System.out.println("로그인을 먼저 하세요");
					continue;
				}
				
				System.out.println("탈퇴 성공");
				
				e.arAcc[loginIndex] = "";
				e.arPw[loginIndex] = "";
				e.arMoney[loginIndex] = 0;
				
				e.accCnt --;
				loginIndex = -1;
				
				
				
			}
			else if (sel == 3) {
				
				System.out.print("[ID 입력] : ");
				String inputId = scan.next();
				
				System.out.print("[PW 입력] : ");
				String inputPw = scan.next();
				
				for (int i = 0; i < e.arAcc.length; i++) {
					
					if (e.arAcc[i].equals(inputId) && e.arPw[i].equals(inputPw)) {
						
						System.out.println("로그인 성공");
						loginIndex = i;
						break;
						
					}
					
					if ( i == e.arAcc.length - 1) System.out.println("로그인 실패");
					
				}
			}
			else if (sel == 4) {
				
				if ( loginIndex == -1) {
					
					System.out.println("로그인을 먼저 하세요");
					continue;
				}
				
				loginIndex = -1;
			}
			else if (sel == 5) {
				
				if ( loginIndex == -1) {
					
					System.out.println("로그인을 먼저 하세요");
					continue;
				}
				
				System.out.print("입금할 금액 : ");
				int inputMoney = scan.nextInt();
				
				e.arMoney[loginIndex] += inputMoney;
				System.out.println("입금 성공");
				
			}
			else if (sel == 6) {
				
				if ( loginIndex == -1) {
					
					System.out.println("로그인을 먼저 하세요");
					continue;
				}
				
				System.out.println("입금할 계좌를 입력하세요 : ");
				String inputAcc = scan.next();
				
				for (int i = 0; i < e.arAcc.length; i++) {
					
					if ( e.arAcc[i].equals(inputAcc)) {
						
						System.out.println("이체하실 금액 : ");
						int inputMoney = scan.nextInt();
						
						if ( e.arMoney[i] < inputMoney) {
							
							System.out.println("돈이 부족합니다.");
							break;
						}
						e.arMoney[i] += inputMoney;
						e.arMoney[loginIndex] -= inputMoney;
						
						System.out.println("이체 성공");
						break;
					}
					
					if ( i == e.arAcc.length - 1) System.out.println("존재하지 않는 계좌");
				}
				
			}
			else if (sel == 7) {
				
				System.out.println("잔액은 " + e.arMoney[loginIndex] + "원 입니다.");
				
			}
			else if (sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			
			System.out.println();
			
		}		
		
	}

}
