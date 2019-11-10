//商品庫存管理-ArrayList集合
import java.util.Scanner;
import java.util.ArrayList;

public class KuCunGuanLi {
	public static int chooseFunction() {
		System.out.println("---------库存管理---------");
		System.out.println("1.查看库存清单");
		System.out.println("2.修改商品库存数量");
		System.out.println("3.退出");
		System.out.println("请输入要执行的操作序号");
		Scanner sc = new Scanner(System.in);
		int choose = sc.nextInt();
		return choose;
	}

	public static void main(String[] args) {
		ArrayList<Goods> list = new ArrayList<Goods>();
		 addStore(list);
		while (true) {
			int choose = chooseFunction();
			switch (choose) {
			case 1:
				printStore(list);
				break;
			case 2:
				updata(list);
				break;
			case 3:
				exit();
				return;
			default:
				System.out.println("-----------------------");
				System.out.println("功能选择有误，请输入正确的功能序号");
				break;

			}
		}
	}

	public static void printStore(ArrayList<Goods> list) {
		int totalCount = 0;
		double totalMoney = 0.0;
		System.out.println("----------------查看库存清单-------------");
		System.out.println("品牌型号       尺寸  价格  库存数");
		for (int i = 0; i < list.size(); i++) {
			Goods item = list.get(i);
			System.out.println(item.brand + " " + item.size + " " + item.price
					+ " " + item.count);
			totalCount += item.count;
			totalMoney += item.count * item.price;
			System.out.println("总库存数：" + totalCount);
			System.out.println("库存商品总金额：" + totalMoney);
		}
	}

	public static void updata(ArrayList<Goods> list) {
		System.out.println("--------修改商品库存数量----------");
		for (int i = 0; i < list.size(); i++) {
			Goods item = list.get(i);
			System.out.println("请输入" + item.brand + "商品库存数量");
			item.count = new Scanner(System.in).nextInt();
			list.set(i, item);
		}
	}

	public static void exit() {
		System.out.println("------------退出------------");
		System.out.println("您已退出系统");
	}

	public static void addStore(ArrayList<Goods> list) {

		Goods p1 = new Goods();
		Goods p2 = new Goods();
		p1.brand="apple";
		p1.size=13.3;
		p1.count=0;
		p1.price=6988.88;
		p2.brand="android";
		p2.count=0;
		p2.price=4588.99;
		p2.size=15.6;
		list.add(p1);
		list.add(p2);
		
	}

}