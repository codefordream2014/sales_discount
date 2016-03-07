package com.eric.discount.interf.impl;

import com.eric.discount.interf.IDiscountStrategy;
import com.eric.pojo.Goods;

public class BuyTwoForOneStrategy implements IDiscountStrategy{
	private String name ="买二赠一";
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public double discount(Goods goods, int amount) {
		
		return (amount/3)*goods.getPrice();
	}
	public String getDiscountInfo(Goods goods, int amount){
		return "("+this.getName()+")"+ "名称： "+goods.getName()+ "，"+ "数量："+ amount/3; 
	}

}
