package step6_01.classObject;


/*
 * 
 * # 클래스 
 * 
 * 1. 정의 ( 설계도 )
 * 
 * 		1-1) class : 키워드
 * 		1-2) Character  : 클래스명 ( 첫글자를 대문자로 작성한다. ) 
 * 		1-3) {}    : 클래스의 영역 
 * 
 * 2. 선언 ( 실 체 )
 * 	
 * 		클래스명 변수명 = new 클래스명();
 *    	ex) Character e = new Character();
 *    	    Random ran  = new Random();
 * 
 * */


class Character {
	
	int level = 1;
	int power = 10;
	int dex = 10;
	int life = 10;
	int mana = 10;
	
}

public class ClassEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Character c1 = new Character();
		c1.level = 3;
		c1.life -= 10;
		
		System.out.println(c1);
		System.out.println(c1.level);
		System.out.println(c1.power);
		System.out.println(c1.life);
		System.out.println(c1.dex);
		System.out.println(c1.mana);
		System.out.println();
		
		Character c2 = new Character();
		c2.level = 100;
		c2.power = 500;
		c2.dex = 300;
		
		System.out.println(c2);
		System.out.println(c2.level);
		System.out.println(c2.power);
		System.out.println(c2.life);
		System.out.println(c2.dex);
		System.out.println(c2.mana);
		System.out.println();
		
		
		Student std = new Student();
		std.name = "제임스 고슬링";
		std.score = 70;
		System.out.println(std.name + "/" + std.score);
		
	}

}
