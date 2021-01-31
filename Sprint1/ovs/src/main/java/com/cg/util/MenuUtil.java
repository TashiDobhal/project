package com.cg.util;
import java.util.Scanner;

import com.cg.domain.Order;
import com.cg.service.OrderService;
import com.cg.serviceImpl.OrderServiceImpl;

public class MenuUtil {
	private OrderService orderService;
	public MenuUtil()
	{
		orderService=new OrderServiceImpl();
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
					Order order = new Order();
					
					System.out.println("Enter Customer ID");
					order.setCustomerId = sc.nextInt();
						
					System.out.println("Enter Order Number");
					order.setOrderNo = sc.nextInt();
						
					System.out.println("Enter Amount");
					order.setTotalAmount = sc.nextDouble();	
						
					order.setOrderDate = LocalDate.now(); 
						
					System.out.println("Enter Status");
					order.setStatus=sc.next();
						
					O
					orderService.addOrder(order);
					System.out.println("---------------Order Successfully Added-------------------");
					
					break;
				}
			}
		}
