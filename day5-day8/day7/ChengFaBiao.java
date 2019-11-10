
public class ChengFaBiao {
	public static void main(String[] args) {
		int he;
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				he=i*j;
				System.out.print(j+"*"+i+"="+he+'\t');
			}
			System.out.println();
		}
	}

}
