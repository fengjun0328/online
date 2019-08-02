package cn.jbit.orderingmgr;

public class OrderingStart {
	/**
	 * 吃货联盟订餐管理系统
	 * 
	 * @author 北大青鸟
	 * 
	 */
	public static void main(String[] args) {
		OrderingUtil om = new OrderingUtil();	
		om.initial();
		om.startMenu();
	}
}
