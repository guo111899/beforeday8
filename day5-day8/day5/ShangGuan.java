//������ѡ�����-��Ʒ����ϵͳ
import java.util.Scanner;
public class ShangGuan{
	public static int chooseFunction(){
		System.out.println("------������------");
		System.out.println("1.�鿴����嵥");
		System.out.println("2.�޸���Ʒ�������");
		System.out.println("3.�˳�");
		System.out.println("������Ҫִ�еĲ�����ţ�");
		Scanner sc=new Scanner(System.in);
		int choose=sc.nextInt();
		return choose;	
	}
	
	public static void main(String[] args) {
		String[]brands=new String[]{"MacBookAir","ThinkpadT"};
		double[]sizes=new double[]{13.3,14.0};
		double[]prices=new double[]{6988.88,5999.99};
		int[]counts=new int[]{0,0};
		while(true){//(�������к�һֱ���ִ�����״̬������true,��������������������)
			int choose=chooseFunction();//���system������Ҫ�����ֵ�����÷�����λ��ǡ�á�
			switch(choose){
			case 1:printStore(brands,sizes,prices,counts);break;
			case 2:update(brands,counts);break;
			case 3:exit();return;//����return���������н���
			default:
				System.out.println("---------------------");
				System.out.println("����ѡ��������������ȷ�Ĺ������");
				break;
			}
		}
	}
	public static void printStore(String[] brands,double[] sizes,double[] prices,int[] counts){
		int totalCount=0;
		double totalMoney=0.0;
		System.out.println("--------------�鿴����嵥----------");
		for(int i=0;i<brands.length;i++){
			totalCount+=counts[i];
			totalMoney+=counts[i]*prices[i];//����������������
		System.out.println(brands[i]+"  "+sizes[i]+"  "+prices[i]+"  "+counts[i]);
		}
	System.out.println("-------------------------------");
	System.out.println("�ܿ������"+totalCount);
	System.out.println("�����Ʒ�ܽ�"+totalMoney);
	}
	public static void update(String[] brands, int[] counts){
		System.out.println("------------�޸���Ʒ�������-----------");
		for (int i = 0; i < brands.length; i++) {
			System.out.println("������"+ brands[i] +"��Ʒ�����");
			counts[i] = new Scanner(System.in).nextInt();//ÿ���������ֵ������¼������������
		}
	}
	public static void exit(){
		System.out.println("----------------�˳�---------------");
		System.out.println("�����˳�ϵͳ");
	}
}