import java.util.*;

public class EX7_1 {
	//���� ū ���� ���
	public static void Max(Vector<Integer> v) { 
		int Max = v.get(0);
		for(int i=1; i<v.size(); i++) {
			if(Max < v.get(i))  
				Max = v.get(i);
		}
		
		System.out.println("���� ū ���� " + Max);		
	}
	
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("����(-1�� �Էµ� ������)>> ");
		
		//���� �Է¹���
		while(true) {
			int n = scnr.nextInt();
			if(n == -1)
				break;
			v.add(n);
		}
		
		//���Ϳ� ���� �ִ��� �Ǻ�
		if(v.size() == 0) {
			System.out.print("���� �ϳ��� ����");
			return;
		}
		else {
			Max(v);
		}
		scnr.close();
	}

}
