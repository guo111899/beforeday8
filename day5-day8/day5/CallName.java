//录入遍历学生姓名并随机点名
import java.util.Scanner;
import java.util.Random;
public class CallName {
	public static void main(String[] args) {
		System.out.println("-------随机点名器-------");
		String[] students=new String[3];
		addStudentName(students);
		printStudentName(students);
		String randomName=randomStudentName(students);
		System.out.println("被点到名的同学是："+randomName);
	}
	public static void addStudentName(String[] students){
	 Scanner sc=new Scanner(System.in);
   	 for(int i=0;i<students.length;i++){
	   System.out.println("存储第"+i+"个名称：");
	   students[i]=sc.next();	
   	 
	   }


    }
	public static void printStudentName(String[] students){
		for(int i=0;i<students.length;i++){
			String name=students[i];
			System.out.println("第"+i+"个学生姓名"+name);
		}
	}
	public static String randomStudentName(String[] students){
		int index=new Random().nextInt(students.length);
		String name=students[index];
		return name;
	}
}
