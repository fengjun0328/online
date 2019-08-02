package cn.bdqn.service;

import java.util.Scanner;

import cn.bdqn.pojo.Menu;
import cn.bdqn.pojo.Order;

public class OrderService {
	Order [] orders=new Order[4];//保存订单信息
	Menu [] menus=new Menu[3]; //保存菜品信息
	Scanner input=new Scanner(System.in);


	/**
	 * 订单的初始化的方法
	 */
	public void orderInit(){
		Order order=new Order();
		order.address="东莞金码";
		order.dishMeg="红烧带鱼2份";
		order.name="赵苗苗";
		order.state=1;
		order.sumPrice=30;
		order.time=13;
		orders[0]=order;
		orders[1]=new Order("朱雅芝", "红烧鱼3份", 13, "东莞", 0, 45);
	}
	/**
	 * 菜品单初始化
	 */

	public void menuInit(){
		menus[0]=new Menu("红烧鱼",15,0);
		menus[1]=new Menu("红烧带鱼 ",15,0);
		menus[2]=new Menu("时令蔬菜 ",10,0);
	}


	/**
	 * 开始菜单的方法
	 */
	public void startMenu(){
		boolean isExit=false;
		System.out.println("\n欢迎使用“吃货联盟订餐系统”");
		do{
			isExit=false;
			System.out.println("****************************");
			System.out.println("1、我要订餐");
			System.out.println("2、查看餐袋");
			System.out.println("3、签收订单");
			System.out.println("4、删除订单");
			System.out.println("5、我要点赞");
			System.out.println("6、退出系统");
			System.out.println("****************************");
			System.out.print("请选择：");
			int choose = input.nextInt(); // 记录用户选择的功能编号
			switch (choose) {
			case 1:
				System.out.println("我要订餐");
				add();
				break;
			case 2:
				System.out.println("查看餐袋");
				show();
				break;
			case 3:
				System.out.println("签收订单");
				show();
				System.out.println("请选择：");
				int updateId=input.nextInt();
				int result_=updateOrder(updateId);
				if(result_>0){
					System.out.println("签单成功");
				}else{
					System.out.println("订单完成不需要签单");
				}
				break;
			case 4:
				System.out.println("删除订单");
				show();
				System.out.println("请选择：");
				int delId=input.nextInt();
				int result=delOrder(delId);
				if(result>0){
					System.out.println("删除成功");
				}else{
					System.out.println("订单没有完成");
				}
				
				break;
			case 5:
				System.out.println("我要点赞");
				showMenu();
				System.out.println("请选择：");
				int menuId=input.nextInt();
				dianZan(menuId);
				break;
			case 6:
				System.out.println("退出系统");
				System.exit(0);
				break;

			default:
				System.out.println("输入有误，返回主菜单");
				isExit=true;
				break;
			}
			if(!isExit){
				System.out.println("按0返回");
				int num=input.nextInt();
				if(num==0){
					isExit=true;
				}
			}
			
		}while(isExit);
	}
	/**
	 * 签单的方法
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
	 * 查看的方法
	 */
	public void show(){
		System.out.println("序号\t姓名\t描述\t总价\t时间\t地址\t完成状态");
		for (int i = 0; i < orders.length; i++) {
			if(orders[i]!=null){
				//				orders[i].show();
				String status="";
				if(orders[i].state==0){
					status="已预定";
				}else{
					status="已完成";
				}
				System.out.println((i+1)+"\t"+orders[i].name+"\t"+
						orders[i].dishMeg+"\t"+orders[i].sumPrice
						+"\t"+orders[i].time+"\t"+orders[i].address+"\t"+status);
			}
		}
	}
	
	/**
	 * 添加的方法   true  为成功 反之
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
	 * 添加模块的方法
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
			System.out.println("餐带满了不能点");
			return;
		}
		Order order=new Order();
		System.out.println("输入名字：");
		order.name=input.next();
		showMenu();
		System.out.println("请选择你点的菜品：");
		int choose=input.nextInt();
		while(choose>menus.length||choose<1){
			System.out.println("没有这个菜，重新点");
			choose=input.nextInt();
		}
		System.out.println("你要几份：");
		int number=input.nextInt();
		System.out.println("输入时间10-24的整数：");
		order.time=input.nextInt();
		while(order.time<10||order.time>24){
			System.out.println("输入错误，输入时间10-24的整数：");
			order.time=input.nextInt();
		}
		System.out.println("输入地址：");
		order.address=input.next();
		//订单描述
		order.dishMeg=menus[choose-1].dishName+number+"份";
		order.sumPrice=menus[choose-1].price*number;
		if(order.sumPrice<50){
			order.sumPrice+=6;//小于50元加收运费
		}
		boolean isRight=addOrder(order);
		if(isRight){
			System.out.println("点餐成功");
		}
		
	}
	
	
	
	/**
	 * 删除的方法
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
	 * 菜品显示的方法
	 */
	public void showMenu(){
		System.out.println("序号\t菜名\t单价\t点赞");
		for (int i = 0; i < menus.length; i++) {
			if(menus[i]!=null){
				System.out.println((i+1)+"\t"+menus[i].dishName+"\t"+menus[i].price+"\t"+menus[i].praiseNum);
			}
		}
	}
	
	
	/**
	 * 点赞的方法
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
