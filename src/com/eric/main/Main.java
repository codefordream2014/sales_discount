/**
 * 
 */
package com.eric.main;

import com.eric.discount.interf.impl.BuyTwoForOneStrategy;
import com.eric.discount.interf.impl.NinetyFiveStrategy;
import com.eric.pojo.Goods;
import com.eric.utils.Utils;
/**
 * @author zhazhaoy
 *
 */
public class Main {

	public static void main(String[] args) {
		process();
	}
	
	public static void process(){
		try{
			// todo need to parse input json data
			/*String barCodeJson = "['ITEM000001','ITEM000001','ITEM000002','ITEM000003-2','ITEM000004','ITEM000004']";
			JSONArray bCodeArray = new JSONArray(barCodeJson);
			for (int i=0; i<bCodeArray.length(); i++) {
			    System.out.println(bCodeArray.getString(i));
			}*/
			
			//total needed pay money
			double sum = 0;
			//initial buyed apple amount
			int cocaBuyedAmount = 50;
			//initial buyed badminton amount
			int badmintonBuyedAmount = 20;
			//initial buyed apple amount
			int appleBuyedAmount = 30;
			
			System.out.println("***<没钱赚商店>购物清单***\n");
			
			Goods coca = new Goods(1, "可口可乐", 2, 7.00, "膨化食品", "ITEM000001",
					 new BuyTwoForOneStrategy());
			printGoods(coca, cocaBuyedAmount);
			System.out.println("小计： " + Utils.decimalFormat(coca.caculate(cocaBuyedAmount)) + "（元）");
			
			sum+=coca.caculate(cocaBuyedAmount);
			
			Goods badminton = new Goods(2, "羽毛球", 4, 3.00, "饮料", "ITEM000002",
					 new BuyTwoForOneStrategy());
			printGoods(badminton, badmintonBuyedAmount);
			System.out.println("小计： " + Utils.decimalFormat(badminton.caculate(badmintonBuyedAmount)) + "（元）");
			
			sum+=badminton.caculate(badmintonBuyedAmount);
			
			Goods apple = new Goods(3, "苹果", 40, 3.00, "水果", "ITEM000003",
					 new NinetyFiveStrategy());
			printGoods(apple, appleBuyedAmount);
			System.out.println("小计： " + Utils.decimalFormat(apple.caculate(appleBuyedAmount)) + "（元）" + apple.getDiscountInfo(appleBuyedAmount));
			sum+=apple.caculate(appleBuyedAmount);
			
			
			System.out.println("-------------------------");
			
			System.out.println(g1.getDiscountInfo(cocaBuyedAmount));
			System.out.println(g2.getDiscountInfo(badmintonBuyedAmount));
			
			System.out.println("-------------------------");
			
			System.out.println("总计： " + Utils.decimalFormat(sum) + "（元）");
			double deduction = coca.deduct(cocaBuyedAmount) + badminton.deduct(badmintonBuyedAmount)+ apple.deduct(appleBuyedAmount);
			System.out.println("节省： " + Utils.decimalFormat(deduction) + "（元）");
			System.out.println("*************************");
		
		}catch(Exception ex){
			System.out.println(ex);
		}
	}
	
	public static void printGoods(Goods goods, int amount){
		String info ="名称： "+goods.getName()+"，"
				+ "数量: "+amount+"，"+"单价： "+ Utils.decimalFormat(goods.getPrice())+"（元），";
		System.out.print(info);
	}
	
}
