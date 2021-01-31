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
					
					System.out.println("Enter Your Choice");
					int ch=sc.nextInt();
					if(ch==1)
					{
						System.out.println("Enter Customer ID");
						int cust_ID=sc.nextInt();
						System.out.println("Enter Customer Name");
						String cust_name=sc.next();
						orderservice.addOrder(cust_ID, cust_name );
						System.out.println("--------------------Successfully Added--------------------------");
					}
					else if(ch==2)
					{
						System.out.println("Enter Book ID");
						int book_ID=sc.nextInt();
						bookservice.deleteBook(book_ID);
						System.out.println("-----------------------Successfully Deleted------------------------");
						
					}
					
					break;

