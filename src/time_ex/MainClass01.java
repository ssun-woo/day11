package time_ex;

import java.awt.Window.Type;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainClass01 {
	public static void main(String[] args) {
		
		long time = System.currentTimeMillis();
		// 기본적으로 long 타입으로 반환되기 때문에
		// int 형태로 강제형변환 시키면 데이터가 손실될 수 있다
		// 현재시간을 1/1000초 단위로 출력해준다
		
		System.out.println(time);
		
		Date d = new Date();
		// util과 sql 두가지가 나오는데
		// sql은 데이터베이스의 시간과 맞출때 사용하고 나머지는 util을 사용한다
		System.out.println(d);
		
		SimpleDateFormat s = new SimpleDateFormat("yyyy년-MM월-dd일 aa hh시 mm분 ss초");
		// 시간을 내가 원하는 형식으로 바꿔줄 수 있음
		// 뒤쪽 괄호에는 지정할 형식을 적는다
		/* y : 년도
		   M : 월 
		   d : 일 
		   aa : 오전오후 
		   h : 시간
		   m : 분 
		   s : 초
		   
		   각각 대소문자를 구분함
		*/
		
		
		System.out.println(s.format(time));
		System.out.println(s.format(d));
	
	}
}
