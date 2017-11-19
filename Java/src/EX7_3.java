import java.util.HashMap;
import java.util.Scanner;

public class EX7_3 {

	public static void main(String[] args) {
			HashMap<String, Integer>  h = new HashMap<String, Integer>();
			Scanner scnr = new Scanner(System.in);
			
			System.out.println("나라 이름과 인구를 10개 입력하세요 ");
			
			//나라 이름과 인구를 입력받음
			while(true) { 
				System.out.print("나라 이름, 인구 >> ");		
				String s = scnr.next();
				//그만이 입력되면 탈출
				if(s.equals("그만"))
					break;
				int num = scnr.nextInt();
				h.put(s, num);
			}
			
			//인구검색
			while(true) {
				System.out.print("인구 검색 >> ");
				String s = scnr.next();
				if(s.equals("그만"))
					break;
				Integer n = h.get(s);
				if(n == null)
					System.out.println(s + " 그런 나라는 없습니다.");
				else 
					System.out.println(s + "의 인구는 " + n); 
			}
			
			scnr.close();
	}
}
