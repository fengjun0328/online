package cn.bdqn.pojo;

public class Menu {
	/**
	 * ����
	 */
	public String dishName;
	/**
	 * �۸�
	 */
	public double price;
	/**
	 * ����
	 */
	public int praiseNum;
	public Menu(String dishName, double price, int praiseNum) {
		super();
		this.dishName = dishName;
		this.price = price;
		this.praiseNum = praiseNum;
	}
	
	/**
	 * ��ʾ�ķ���
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
