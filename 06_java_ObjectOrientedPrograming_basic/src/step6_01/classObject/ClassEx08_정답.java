package step6_01.classObject;
/*
 * # 숫자이동[3단계] : 클래스 + 변수
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
 * 4. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
 * 5. 좌우 끝에 도달해도 계속 반대편으로 이동이 가능하다.
 * 예) 
 *  0 0 0 0 0 0 0 2 
 *  왼쪽(1) 오른쪽(2) : 2
 *  
 *  2 0 0 0 0 0 0 0 
 */

import java.util.Arrays;
import java.util.Scanner;

/*
class Ex08{
	int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
}
*/

//2021.03.08 21:08 ~ 21:24
public class ClassEx08_정답 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Ex08 gameObject = new Ex08();
		int indexofMe = -1;
		int prevIndex = -1;
		
		
		while(true) {
			
			System.out.println(Arrays.toString(gameObject.game));
			
			for (int i = 0; i < gameObject.game.length; i++) {		//캐릭터 위치 찾기
				
				if ( gameObject.game[i] == 2) prevIndex = i;
				
			}
			
			
			System.out.print("왼쪽 (1) 오른쪽 (2) : ");
			int leftORright = scan.nextInt();
			
			//캐릭터 위치 바꾸기
			if ( leftORright == 1 ) {	//왼쪽
				
				gameObject.game[prevIndex] = 0;	//이전위치 0으로 바꾸기
				indexofMe = prevIndex - 1;
	
				
			}
			else if ( leftORright == 2 ) {	//오른쪽
				
				gameObject.game[prevIndex] = 0;	
				indexofMe = prevIndex + 1;
				
			}
			else {	//잘못 입력
				
				System.out.println("잘못 입력하셨습니다. ");
				continue;
			}
			
			//벽 도달
			
			if (indexofMe < 0 || indexofMe >= gameObject.game.length) {
				
				gameObject.game[prevIndex] = 2;
				indexofMe = prevIndex;
			}
			
			//장애물 처리
			
			if ( gameObject.game[indexofMe] == 1 ) {
				
				System.out.print("벽 격파 (3) : ");
				int wantPunch = scan.nextInt();
				
				if ( wantPunch != 3 ) {		//벽 격파x
					
					gameObject.game[prevIndex] = 2;
					indexofMe = prevIndex;
					
				}
				
				else {		//벽 격파하는 경우
					
					gameObject.game[indexofMe] = 0;
					
				}
			}
			
			
			gameObject.game[indexofMe] = 2;
			
			
		}
		
	}

}
