package cn.bdqn.pojo;

public class Order {
	/**
	 * ����������
	 */
	public String name;
	/**
	 * ��ѡ��Ʒ
	 */
	public String dishMeg; 
	/**
	 * �Ͳ�ʱ��
	 */
	public int time ; 
	/**
	 *  �Ͳ͵�ַ
	 */
	public String address; 
	/**
	 * ����״̬�� 0����Ԥ�� 1�������
	 */
	public int state; 
	/**
	 * �ܽ��
	 */
	public double sumPrice; 
	
	
	/**
	 * ��ʾ�ķ���
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
