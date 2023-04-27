package constructor;

/*
 constructor(생성자)
  - 초기화 목적 
  - 객체를 생성할 때 자동으로 호출됨
  - 클래스 이름과 동일한 메소드 이름을 가지며 반환 타입, 값은 없다
 */
class TestClass01 {

	private int age;

	public TestClass01(int age) {
		// 매개변수를 전달할 수 있지만, 객체를 생성할때 반드시 같이 전달해줘야한다
		System.out.println(age + " : 생성자 호출");
		this.age = age;
		// 이런 목적으로 사용한다
		// 그외에 특별한 목적은 없음
	}

	public TestClass01() {
		// 메소드 오버로딩으로 다시 생성할 수 있음
		System.out.println("기본생성자");
	}
	
	public TestClass01(int a, int b) {
		System.out.println("2개 받아줌");
	}

	public void test() {
		System.out.println("test");
	}

}

public class MainClass01 {
	public static void main(String[] args) {
		TestClass01 t = new TestClass01(100);
		// t.test();
		TestClass01 t02 = new TestClass01();
		// 매개변수에 따라 전달되는 값이 다름
		TestClass01 t03 = new TestClass01(2,3);
		
		
		
		String s = new String();
		String s1 = new String("aaa");
		
		System.out.println(s);
		System.out.println(s1);

	}
}

































