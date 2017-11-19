import java.util.ArrayList;
import java.util.Scanner;

public class EX7_2 {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>(); //어레이리스트 선언
		Scanner scnr = new Scanner(System.in);
		double sum = 0;
		
		System.out.println("6개의 학점을 빈칸으로 분리 입력");
		
		//입력을 받아 변환
		for(int i = 0; i < 6; i++) {
			double[] a = new double[6];
			ar.add(i, scnr.next());
			if(ar.get(i).equals("A"))
				a[i] = 4.0;
			else if(ar.get(i).equals("B"))
				a[i] = 3.0;
			else if(ar.get(i).equals("C"))
				a[i] = 2.0;
			else if(ar.get(i).equals("D"))
				a[i] = 1.0;
			else if(ar.get(i).equals("F"))
				a[i] = 0;
			
			sum += a[i];
		}
		scnr.close();
		
		System.out.println(sum/6);  //출력

	}

}
