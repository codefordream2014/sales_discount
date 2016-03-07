/**
 * 
 */
package com.eric.pojo;

import com.eric.discount.interf.IDiscountStrategy;

/**
 * @author zhazhaoy
 *
 */
public class Goods{
	
	private int id;
	
	private String name;
	
	private int amount;
	
	private double price;
	
	private String category;
	
	private String barcode;
	
	private IDiscountStrategy discountStrategy;
	
	
	/**
	 * @param id
	 * @param name
	 * @param amount
	 * @param price
	 * @param category
	 * @param barcode
	 * @param discountStratege
	 */
	public Goods(int id, String name, int amount, double price, String category, String barcode,
			IDiscountStrategy discountStrategy) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.price = price;
		this.category = category;
		this.barcode = barcode;
		this.discountStrategy = discountStrategy;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
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
	/**
	 * @return the amount
	 */
	public int getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * @return the barcode
	 */
	public String getBarcode() {
		return barcode;
	}
	/**
	 * @param barcode the barcode to set
	 */
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	
	/**
	 * @return the discountStratege
	 */
	public IDiscountStrategy getDiscountStratege() {
		return discountStrategy;
	}
	/**
	 * @param discountStratege the discountStratege to set
	 */
	public void setDiscountStratege(IDiscountStrategy discountStrategy) {
		this.discountStrategy = discountStrategy;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", amount=" + amount + ", price=" + price + ", category="
				+ category + ", barcode=" + barcode + "]";
	}
	
	public double deduct(int amount) {
		if(null!=discountStrategy)
			return this.discountStrategy.discount(this,amount);
		 return 0;
	}
	
	public double caculate(int amount){
		
		return amount*this.price - deduct(amount);
	}
	
	public String getDiscountInfo(int amount){
		return this.discountStrategy.getDiscountInfo(this, amount);
	}
	
}
