package com.cg.dao;

import java.time.LocalDate;
import java.util.List;

import com.cg.domain.Order;

public interface OrderDAO {
	public Order addOrder(Order order);
	public Order viewOrder(int orderid);
	public Order updateOrderDetails(Order order);
	public List<Order> viewAllOrders(int custid);
	public List<Order> viewOrderList(LocalDate date);
	public List<Order> viewOrderList();
	public Order cancelOrder(int orderid);
}
