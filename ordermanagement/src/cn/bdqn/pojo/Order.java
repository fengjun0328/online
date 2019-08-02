package cn.bdqn.pojo;

public class Order {
	/**
	 * 订餐人名称
	 */
	public String name;
	/**
	 * 所选菜品
	 */
	public String dishMeg; 
	/**
	 * 送餐时间
	 */
	public int time ; 
	/**
	 *  送餐地址
	 */
	public String address; 
	/**
	 * 订单状态： 0：已预定 1：已完成
	 */
	public int state; 
	/**
	 * 总金额
	 */
	public double sumPrice; 
	
	
	/**
	 * 显示的方法
	 */
	public void show(){
		System.out.println("Order [name=" + name + ", dishMeg=" + dishMeg + ", time="
				+ time + ", address=" + address + ", state=" + state
				+ ", sumPrice=" + sumPrice + "]");
	}


	public Order(String name, String dishMeg, int time, String addresse,
			int state, double sumPrice) {
		super();
		this.name = name;
		this.dishMeg = dishMeg;
		this.time = time;
		this.address = addresse;
		this.state = state;
		this.sumPrice = sumPrice;
	}


	public Order() {
		super();
	}

	
	
}
