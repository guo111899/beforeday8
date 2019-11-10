//求一百之内的奇数和
public class JiShuHe {
	public static void main(String[] args) {
		int sum=0;
		for(int i=0;i<=100;i++){
			if(i%2==1)
				sum+=i;
		}
		System.out.println("一百之内的基数和为："+sum);
	}

}
