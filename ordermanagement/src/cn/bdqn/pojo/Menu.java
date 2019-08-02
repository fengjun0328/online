package cn.bdqn.pojo;

public class Menu {
	/**
	 * 菜名
	 */
	public String dishName;
	/**
	 * 价格
	 */
	public double price;
	/**
	 * 点赞
	 */
	public int praiseNum;
	public Menu(String dishName, double price, int praiseNum) {
		super();
		this.dishName = dishName;
		this.price = price;
		this.praiseNum = praiseNum;
	}
	
	/**
	 * 显示的方法
	 */
	public void show() {
		System.out.println("Menu [dishName=" + dishName + ", price=" + price
				+ ", praiseNum=" + praiseNum + "]");
	}
	public Menu() {
		super();
	}

	
	
	public void showInfo(){
		
	}
	
}
