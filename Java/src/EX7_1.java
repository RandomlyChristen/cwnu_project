import java.util.*;

public class EX7_1 {
	//가장 큰 수를 출력
	public static void Max(Vector<Integer> v) { 
		int Max = v.get(0);
		for(int i=1; i<v.size(); i++) {
			if(Max < v.get(i))  
				Max = v.get(i);
		}
		
		System.out.println("가장 큰 수는 " + Max);		
	}
	
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("정수(-1이 입력될 때까지)>> ");
		
		//값을 입력받음
		while(true) {
			int n = scnr.nextInt();
			if(n == -1)
				break;
			v.add(n);
		}
		
		//벡터에 값이 있는지 판별
		if(v.size() == 0) {
			System.out.print("수가 하나도 없음");
			return;
		}
		else {
			Max(v);
		}
		scnr.close();
	}

}
