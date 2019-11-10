//´òÓ¡Êı×é
public class PrintArray {
	public static void main(String[] args) {
		//int[]arr=new int[]{5,7,4,2,1,8};
		//int[]arr={5,7,4,2,1,8};
		int []arr;
		arr=new int[6];//int[]arr=new int[6];
		arr[0]=5;
		arr[1]=7;
		arr[2]=4;
		arr[3]=2;
		arr[4]=1;
		arr[5]=8;
		printMethord(arr);
	}
	public static void printMethord(int arr[]){
		System.out.print("[");
		for(int i=0;i<6;i++){
			if(i<arr.length-1)
		System.out.print(arr[i]+"¡¢");
			else
		System.out.print(arr[arr.length-1]+"]");
	   }
    }
}
