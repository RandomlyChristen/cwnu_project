import java.util.HashMap;
import java.util.Scanner;

public class EX7_3 {

	public static void main(String[] args) {
			HashMap<String, Integer>  h = new HashMap<String, Integer>();
			Scanner scnr = new Scanner(System.in);
			
			System.out.println("���� �̸��� �α��� 10�� �Է��ϼ��� ");
			
			//���� �̸��� �α��� �Է¹���
			while(true) { 
				System.out.print("���� �̸�, �α� >> ");		
				String s = scnr.next();
				//�׸��� �ԷµǸ� Ż��
				if(s.equals("�׸�"))
					break;
				int num = scnr.nextInt();
				h.put(s, num);
			}
			
			//�α��˻�
			while(true) {
				System.out.print("�α� �˻� >> ");
				String s = scnr.next();
				if(s.equals("�׸�"))
					break;
				Integer n = h.get(s);
				if(n == null)
					System.out.println(s + " �׷� ����� �����ϴ�.");
				else 
					System.out.println(s + "�� �α��� " + n); 
			}
			
			scnr.close();
	}
}
