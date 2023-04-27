package time_ex;

public class MainClass02 {
	public static void main(String[] args) {
		
		System.out.println("시작");
		long start = System.currentTimeMillis();
		
		try {
			Thread.sleep(3000); // 단위가 1/1000초 >> 3000 : 3초
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// try{} catch{} >> 예외상황일때 사용
		
		long end = System.currentTimeMillis();
		System.out.println("끝");
		System.out.println(end - start);
		
		
		
		
		
		
		
		
		
		
		
	}
}
