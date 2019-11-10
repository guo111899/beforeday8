import java.util.Scanner;
public class ArrayNiXu {
	public static void main(String[] args) {
		int[] arr=new int[6];
		defineArray(arr);
		printArray1(arr);
		niXuMethord(arr);
		printArray2(arr);
		}
	
public static void niXuMethord(int arr[]){
	int a=0;
	int t=0;
	int b=arr.length-1;
	for(int i=0;i<6;i++){
	if(a!=b) 
		t=arr[a];
		arr[a]=arr[b];
		arr[b]=t;
		a++;
		b--;
	}
}
public static void printArray2(int[] arr){
	System.out.println("arr2=[");
	for(int i=0;i<6;i++){
		if(i==arr.length-1)
			System.out.println(arr[arr.length-1]+"]");
		else
			System.out.println(arr[i]+",");
	}
	
}
	

	
	

public static void defineArray(int[] arr){
	Scanner sc=new Scanner(System.in);
	System.out.println("请依次输入数组元素的值：");
	for(int i=0;i<6;i++){
		System.out.println("      请输入第"+i+"个元素");
		arr[i]=sc.nextInt();
		}
	}
public static void printArray1(int[] arr){
	System.out.print("arr1=[");

	for(int i=0;i<6;i++){
		if(i==arr.length-1)
			System.out.print(arr[arr.length-1]);
		else
			System.out.print(arr[i]+",");
		
	}
	System.out.println("]");
}
}

