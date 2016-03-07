package com.eric.discount.interf.impl;

import com.eric.discount.interf.IDiscountStrategy;
import com.eric.pojo.Goods;
import com.eric.utils.Utils;

public class NinetyFiveStrategy implements IDiscountStrategy {
	
	private String name ="95折扣";
	
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
		return amount*(goods.getPrice()-goods.getPrice()*0.95);
	}
	public String getDiscountInfo(Goods goods, int amount){
		return "节省" + Utils.decimalFormat(discount(goods,amount)) +"（元）";
	}

}
