/**
 * 
 */
package com.eric.discount.interf;

import com.eric.pojo.Goods;

/**
 * @author zhazhaoy
 *
 */
public interface IDiscountStrategy {
	public double discount(Goods goods, int amount);
	public String getDiscountInfo(Goods goods, int amount);
}
