package com.cg.serviceImpl;

import java.time.LocalDate;
import java.util.List;

import com.cg.dao.OrderDAO;
import com.cg.daoImpl.OrderDAOImpl;
import com.cg.domain.Order;
import com.cg.service.OrderService;

public class OrderServiceImpl implements OrderService {
	OrderDAO orderdao;
	public OrderServiceImpl() {
		orderdao=new OrderDAOImpl();
	}
	@Override
	public Order addOrder(Order order) {
		Order s=new Order();
		s.setCustomerId(customerId);
		s.setStd_Name(name);
		stdao.addStudent(s);
		
		return null;
	}

	@Override
	public Order viewOrder(int orderid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order updateOrderDetails(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> viewAllOrders(int custid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> viewOrderList(LocalDate date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> viewOrderList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order cancelOrder(int orderid) {
		// TODO Auto-generated method stub
		return null;
	}

}
