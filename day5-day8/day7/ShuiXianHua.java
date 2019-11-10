//求所有的水仙花数（三位数-其每个数字立方和等于其本身）
public class ShuiXianHua {
	public static void main(String[] args) {
		for(int i=100;i<1000;i++){
			int bai=i/100%10;
			int shi=i/10%10;
			int ge=i%10;
			if(i==bai*bai*bai+shi*shi*shi+ge*ge*ge)
				System.out.println(i);
		}
			
			
	}

}
