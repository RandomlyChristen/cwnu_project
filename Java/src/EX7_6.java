import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;
 
class Location {
	String name, w, h;
	public Location (String name, String w, String h){
		this.name = name;
		this.w = w;
		this.h = h;
	}
}
public class EX7_6 {
 
	public static void main(String[] args) {
		HashMap<String, Location> h = new HashMap<>();
		Vector<String> v = new Vector<>();
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("���� ���� �浵�� �Է� ");
		
		while(true) {
			String s = scnr.nextLine();
			if(s.equals("stop")) break;
			StringTokenizer st = new StringTokenizer(s, ",");
			Location sttmp = new Location(st.nextToken(), st.nextToken(), st.nextToken());
			v.add(sttmp.name);
			h.put(sttmp.name, sttmp);
		}
		
		System.out.println("--------------------------------------------");
		for(int i=0; i<h.size(); i++) {
			System.out.println("�̸�" + h.get(v.get(i)).name);
			System.out.println("�а�" +h.get(v.get(i)).w);
			System.out.println("�й�" +h.get(v.get(i)).h);
			System.out.println("--------------------------------------------");
		}
		
		System.out.println("���̸� �Է�");
		while(true) {
			String s = scnr.nextLine();
			if(s.equals("stop"))
				break;
			else if(h.get(s) == null)
				System.out.println("�׷����� ����");
			else
				System.out.println(h.get(s).name + h.get(s).w + h.get(s).h);
		}
	}
 
}