//参数传递（整型，数组）
public class CanChuan {

	public static void main(String[] args) {
		
		 int []arr={1,2,3};
		 getChange(arr);//arr
		 for(int i=0;i<arr.length;i++)
		 System.out.println(arr[i]);
	}
		  public static void getChange(int[]arr){
			  for(int i=0;i<arr.length;i++){
				  arr[i]*=2;
			  
			  }
		  }
		  
		
		/*int b=10;
		int a=5;
		// TODO Auto-generated method stub
		getNumber(a,b);
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	public static void getNumber(int a,int b){
		a=20;
		b=30;
	
		 }*/
}
