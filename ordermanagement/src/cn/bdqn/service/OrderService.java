package cn.bdqn.service;

import cn.bdqn.pojo.Menu;
import cn.bdqn.pojo.Order;

import java.util.Scanner;

public class OrderService {
	Order [] orders=new Order[4];//���涩����Ϣ
	Menu [] menus=new Menu[3]; //�����Ʒ��Ϣ
	Scanner input=new Scanner(System.in);


	/**
	 * �����ĳ�ʼ���ķ���
	 */
	public void orderInit(){
		Order order=new Order();
		order.address="��ݸ����";
		order.dishMeg="���մ���2��";
		order.name="������";
		order.state=1;
		order.sumPrice=30;
		order.time=13;
		orders[0]=order;
		orders[1]=new Order("����֥", "������3��", 13, "��ݸ", 0, 45);
	}
	/**
	 * ��Ʒ����ʼ��
	 */

	public void menuInit(){
		menus[0]=new Menu("������",15,0);
		menus[1]=new Menu("���մ��� ",15,0);
		menus[2]=new Menu("ʱ���߲� ",10,0);
	}


	/**
	 * ��ʼ�˵��ķ���
	 */
	public void startMenu(){
		boolean isExit=false;
		System.out.println("\n��ӭʹ�á��Ի����˶���ϵͳ��");
		do{
			isExit=false;
			System.out.println("****************************");
			System.out.println("1����Ҫ����");
			System.out.println("2���鿴�ʹ�");
			System.out.println("3��ǩ�ն���");
			System.out.println("4��ɾ������");
			System.out.println("5����Ҫ����");
			System.out.println("6���˳�ϵͳ");
			System.out.println("****************************");
			System.out.print("��ѡ��");
			int choose = input.nextInt(); // ��¼�û�ѡ��Ĺ��ܱ��
			switch (choose) {
			case 1:
				System.out.println("��Ҫ����");
				add();
				break;
			case 2:
				System.out.println("�鿴�ʹ�");
				show();
				break;
			case 3:
				System.out.println("ǩ�ն���");
				show();
				System.out.println("��ѡ��");
				int updateId=input.nextInt();
				int result_=updateOrder(updateId);
				if(result_>0){
					System.out.println("ǩ���ɹ�");
				}else{
					System.out.println("������ɲ���Ҫǩ��");
				}
				break;
			case 4:
				System.out.println("ɾ������");
				show();
				System.out.println("��ѡ��");
				int delId=input.nextInt();
				int result=delOrder(delId);
				if(result>0){
					System.out.println("ɾ���ɹ�");
				}else{
					System.out.println("����û�����");
				}
				
				break;
			case 5:
				System.out.println("��Ҫ����");
				showMenu();
				System.out.println("��ѡ��");
				int menuId=input.nextInt();
				dianZan(menuId);
				break;
			case 6:
				System.out.println("�˳�ϵͳ");
				System.exit(0);
				break;

			default:
				System.out.println("�������󣬷������˵�");
				isExit=true;
				break;
			}
			if(!isExit){
				System.out.println("��0����");
				int num=input.nextInt();
				if(num==0){
					isExit=true;
				}
			}
			
		}while(isExit);
	}
	/**
	 * ǩ���ķ���
	 * @param updateId
	 * @return
	 */
	public int updateOrder(int updateId) {
		for (int i = 0; i < orders.length; i++) {
			if(i==updateId-1&&orders[i].state==0){
				orders[i].state=1;
				return 1;
			}
		}
		return -1;
	}
	/**
	 * �鿴�ķ���
	 */
	public void show(){
		System.out.println("���\t����\t����\t�ܼ�\tʱ��\t��ַ\t���״̬");
		for (int i = 0; i < orders.length; i++) {
			if(orders[i]!=null){
				//				orders[i].show();
				String status="";
				if(orders[i].state==0){
					status="��Ԥ��";
				}else{
					status="�����";
				}
				System.out.println((i+1)+"\t"+orders[i].name+"\t"+
						orders[i].dishMeg+"\t"+orders[i].sumPrice
						+"\t"+orders[i].time+"\t"+orders[i].address+"\t"+status);
			}
		}
	}
	
	/**
	 * ��ӵķ���   true  Ϊ�ɹ� ��֮
	 * @param order
	 * @return
	 */
	public boolean addOrder(Order order){
		for (int i = 0; i < orders.length; i++) {
			if(orders[i]==null){
				orders[i]=order;
				return true;
			}
		}
		return false;
	}
	
	/**
	 * ���ģ��ķ���
	 */
	public void add(){
		boolean isExit=false;
		for (int i = 0; i < orders.length; i++) {
			if(orders[i]==null){
				isExit=true;
				break;
			}
		}
		if(!isExit){
			System.out.println("�ʹ����˲��ܵ�");
			return;
		}
		Order order=new Order();
		System.out.println("�������֣�");
		order.name=input.next();
		showMenu();
		System.out.println("��ѡ�����Ĳ�Ʒ��");
		int choose=input.nextInt();
		while(choose>menus.length||choose<1){
			System.out.println("û������ˣ����µ�");
			choose=input.nextInt();
		}
		System.out.println("��Ҫ���ݣ�");
		int number=input.nextInt();
		System.out.println("����ʱ��10-24��������");
		order.time=input.nextInt();
		while(order.time<10||order.time>24){
			System.out.println("�����������ʱ��10-24��������");
			order.time=input.nextInt();
		}
		System.out.println("�����ַ��");
		order.address=input.next();
		//��������
		order.dishMeg=menus[choose-1].dishName+number+"��";
		order.sumPrice=menus[choose-1].price*number;
		if(order.sumPrice<50){
			order.sumPrice+=6;//С��50Ԫ�����˷�
		}
		boolean isRight=addOrder(order);
		if(isRight){
			System.out.println("��ͳɹ�");
		}
		
	}
	
	
	
	/**
	 * ɾ���ķ���
	 * @param delId
	 * @return
	 */
	public int delOrder(int delId){
		for (int i = 0; i < orders.length; i++) {
			if(i==delId-1&&orders[i].state==1){
				orders[i]=null;
				return 1;
			}
		}
		
		return -1;
	}
	/**
	 * ��Ʒ��ʾ�ķ���
	 */
	public void showMenu(){
		System.out.println("���\t����\t����\t����");
		for (int i = 0; i < menus.length; i++) {
			if(menus[i]!=null){
				System.out.println((i+1)+"\t"+menus[i].dishName+"\t"+menus[i].price+"\t"+menus[i].praiseNum);
			}
		}
	}
	
	
	/**
	 * ���޵ķ���
	 * @param menuId
	 */
	public void dianZan(int menuId){
		for (int i = 0; i < menus.length; i++) {
			if(i==menuId-1){
				menus[i].praiseNum++;
				break;
			}
		}
	}

	public static void main(String[] args) {
		OrderService orderService=new OrderService();
		orderService.orderInit();
		orderService.menuInit();
		orderService.startMenu();
	}
}
