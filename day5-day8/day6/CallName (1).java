// ���������-ArrayList����
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class CallName{
 public static void main(String[] args){
		ArrayList<Student> list=new ArrayList<Student>();
		addStudent(list);
		printStudent(list);
		randomStudent(list);
 }	

public static void addStudent(ArrayList<Student> list){
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<3;i++){
		Student s=new Student();
		System.out.println("�洢��"+i+"��ѧ������:");
		s.name=sc.next();
		System.out.println("�洢��"+i+"��ѧ�����䣺");
		s.age=sc.nextInt();
		list.add(s);
	}
 }
public static void printStudent(ArrayList<Student> list){
	for(int i=0;i<list.size();i++){
		Student s=list.get(i);
		System.out.println("������"+s.name+",���䣺"+s.age);
	}
}
public static void randomStudent(ArrayList<Student> list){
	int index=new Random().nextInt(list.size());
	Student s=list.get(index);
	System.out.println("�����������ͬѧ��"+s.name+"�����䣺"+s.age);
}


}