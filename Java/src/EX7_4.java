import java.util.Scanner;
import java.util.Vector;

public class EX7_4 {
	
	public static double _avg(Vector<Integer> v) {
		double sum = 0;
		for (int i = 0; i < v.size(); i++) {
			sum += v.get(i);
		}
		return sum/v.size();
	}
	
	public static void prt_v(Vector<Integer> v) {
		for (int i = 0; i < v.size(); i++) {
			System.out.print(v.get(i) + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>();
		Scanner scnr = new Scanner(System.in);
		
		while(true) {
			System.out.print("������ �Է� (0�Է½� ����) >>");
			int n = scnr.nextInt();
			if(n == 0)
				break;
			v.add(n);
			prt_v(v);
			System.out.println("���� ���" + _avg(v));
		}
		scnr.close();
	}

}
