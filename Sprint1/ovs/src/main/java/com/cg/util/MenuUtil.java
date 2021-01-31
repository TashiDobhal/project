package com.cg.util;
import java.util.Scanner;
import java.time.LocalDate;  
import com.cg.domain.Order;
import com.cg.service.OrderService;
import com.cg.serviceImpl.OrderServiceImpl;

public class MenuUtil {
	private OrderService orderService;
	public MenuUtil()
	{
		orderService=new OrderServiceImpl();
	}
	
	public void showMenu()
	{
		
		
		System.out.println("1.Add Order");
		System.out.println("2.View Order By Order Id");
		System.out.println("3.Update Order Details");
		System.out.println("4.View All Orders By Customer Id");
		System.out.println("5.View Orders By Date");
		System.out.println("5.View All Orders");
		System.out.println();
		
		
		
	}
		public void start()
		{
			Scanner sc=new Scanner(System.in);
			int choice;
			String continueChoice;
			
			do {
				showMenu();		
				System.out.println("Enter Your Choice");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					
					System.out.println("Enter Customer ID");
					int custID=sc.nextInt();
						
					System.out.println("Enter Order Number");
					int orderId=sc.nextInt();
						
					System.out.println("Enter Amount");
					int totalAmount=sc.nextDouble();	
						
					LocalDate date = LocalDate.now(); 
						
					System.out.println("Enter Status");
					String status=sc.next();
						
					Order order = new Order(custId, orderId, totalAmount, date, status);
					orderService.addOrder(order);
					System.out.println("---------------Order Successfully Added-------------------");
					
					break;

