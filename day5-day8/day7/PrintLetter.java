//打印大小写字母
public class PrintLetter {
	public static void main(String[] args) {
		System.out.println("打印大、小写字母");
		char a = 'a';
		char A = 'A';
		for(int i=0;i<26;i++){//for循环决定循环次数
			System.out.print(A+"."+a+"  ");
			A++;
			a++;
		}
			
	}

}
