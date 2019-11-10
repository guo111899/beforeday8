//方法的选择调用-商品管理系统
import java.util.Scanner;
public class ShangGuan{
	public static int chooseFunction(){
		System.out.println("------库存管理------");
		System.out.println("1.查看库存清单");
		System.out.println("2.修改商品库存数量");
		System.out.println("3.退出");
		System.out.println("请输入要执行的操作序号：");
		Scanner sc=new Scanner(System.in);
		int choose=sc.nextInt();
		return choose;	
	}
	
	public static void main(String[] args) {
		String[]brands=new String[]{"MacBookAir","ThinkpadT"};
		double[]sizes=new double[]{13.3,14.0};
		double[]prices=new double[]{6988.88,5999.99};
		int[]counts=new int[]{0,0};
		while(true){//(程序运行后一直保持待运行状态，遇到true,运行条件成立接着运行)
			int choose=chooseFunction();//输出system，输入要输入的值，【该方法的位置恰好】
			switch(choose){
			case 1:printStore(brands,sizes,prices,counts);break;
			case 2:update(brands,counts);break;
			case 3:exit();return;//遇到return，程序运行结束
			default:
				System.out.println("---------------------");
				System.out.println("功能选择有误，请输入正确的功能序号");
				break;
			}
		}
	}
	public static void printStore(String[] brands,double[] sizes,double[] prices,int[] counts){
		int totalCount=0;
		double totalMoney=0.0;
		System.out.println("--------------查看库存清单----------");
		for(int i=0;i<brands.length;i++){
			totalCount+=counts[i];
			totalMoney+=counts[i]*prices[i];//遍历输出，遍历求和
		System.out.println(brands[i]+"  "+sizes[i]+"  "+prices[i]+"  "+counts[i]);
		}
	System.out.println("-------------------------------");
	System.out.println("总库存数："+totalCount);
	System.out.println("库存商品总金额："+totalMoney);
	}
	public static void update(String[] brands, int[] counts){
		System.out.println("------------修改商品库存数量-----------");
		for (int i = 0; i < brands.length; i++) {
			System.out.println("请输入"+ brands[i] +"商品库存数");
			counts[i] = new Scanner(System.in).nextInt();//每次输入的数值都被记录并保存下来了
		}
	}
	public static void exit(){
		System.out.println("----------------退出---------------");
		System.out.println("您已退出系统");
	}
}