//¼�����ѧ���������������
import java.util.Scanner;
import java.util.Random;
public class CallName {
	public static void main(String[] args) {
		System.out.println("-------���������-------");
		String[] students=new String[3];
		addStudentName(students);
		printStudentName(students);
		String randomName=randomStudentName(students);
		System.out.println("���㵽����ͬѧ�ǣ�"+randomName);
	}
	public static void addStudentName(String[] students){
	 Scanner sc=new Scanner(System.in);
   	 for(int i=0;i<students.length;i++){
	   System.out.println("�洢��"+i+"�����ƣ�");
	   students[i]=sc.next();	
   	 
	   }


    }
	public static void printStudentName(String[] students){
		for(int i=0;i<students.length;i++){
			String name=students[i];
			System.out.println("��"+i+"��ѧ������"+name);
		}
	}
	public static String randomStudentName(String[] students){
		int index=new Random().nextInt(students.length);
		String name=students[index];
		return name;
	}
}
