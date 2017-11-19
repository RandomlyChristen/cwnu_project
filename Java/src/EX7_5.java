import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

class student {
	public String name;
	public String department;
	public String num;
	public String grade;
	
	public student(String name, String department, String num, String grade) {
		this.name = name;
		this.department = department;
		this.num = num;
		this.grade = grade;
	}
}

public class EX7_5 {
	public static void main(String[] args) {
		HashMap<String, student> h = new HashMap<>();
		Vector<String> v = new Vector<>();
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("학생 이름, 학과, 학번, 학점 평균을 입력하시오.");
		
		while(true) {
			String s = scnr.nextLine();
			if(s.equals("stop")) break;
			StringTokenizer st = new StringTokenizer(s, ",");
			student sttmp = new student(st.nextToken(), st.nextToken(), st.nextToken(), st.nextToken());
			v.add(sttmp.name);
			h.put(sttmp.name, sttmp);
		}
		
		System.out.println("--------------------------------------------");
		for(int i=0; i<h.size(); i++) {
			System.out.println("이름" + h.get(v.get(i)).name);
			System.out.println("학과" +h.get(v.get(i)).department);
			System.out.println("학번" +h.get(v.get(i)).num);
			System.out.println("학점평균" +h.get(v.get(i)).grade);
			System.out.println("--------------------------------------------");
		}
		
		System.out.println("학생이름 입력");
		while(true) {
			String s = scnr.nextLine();
			if(s.equals("stop"))
				break;
			else
				System.out.println(h.get(s).name + h.get(s).department + h.get(s).num + h.get(s).grade);
		}
		
		scnr.close();
	}
}