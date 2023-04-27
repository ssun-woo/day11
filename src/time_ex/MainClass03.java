package time_ex;

import java.io.IOException;

public class MainClass03 {
	public static void main(String[] args) {
		
		// 프로세스 빌더
		// 현재 운영체제에 맞는 명령어를 입력하면 명령을 실행하는 것
		
		ProcessBuilder pro = new ProcessBuilder();
		// pro.command("calc");  	// 계산기
		// pro.command("mspaint");  // 그림판 
		pro.command("notepad");  	// 메모장
		
		try {
			pro.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 위의 내용은 ctrl+r(실행) 에서 명령어를 입력한것과 같은 결과
		
		
	}
}
