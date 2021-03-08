package step6_01.classObject;

/*
 * 
 * # 클래스의 범위
 * 
 * 		- 같은 패키지 안의 클래스는 다른 클래스에서 사용이 가능하다.
 *       ( 구체적인 접근제어자는 객체지향 기법에서 공부 )
 * 
 * */




class Student {
	
	String name;
	int score;
	
}

public class ClassEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Character c1 = new Character();
		System.out.println(c1.dex);
		System.out.println(c1.level);
		
		Student s1 = new Student();
		s1.name = "홍길동";
		s1.score = 100;
		
		System.out.println(s1.name);
		System.out.println(s1.score);
		
	}

}
