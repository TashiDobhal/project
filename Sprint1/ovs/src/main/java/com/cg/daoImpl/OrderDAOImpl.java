package com.cg.daoImpl;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import com.cg.dao.OrderDAO;
import com.cg.domain.Order;
import com.cg.util.JPAUtil;


public class OrderDAOImpl implements OrderDAO{
	JPAUtil util;
	EntityManager entitymanager;
	public OrderDAOImpl() {
		util=new JPAUtil();
	}

	@Override
	public Order addOrder(Order order) {
		entitymanager=util.createEntityManager();
		entitymanager.getTransaction().begin();
		entitymanager.persist(order);
		entitymanager.getTransaction().commit();
	    return order;

		
	}

	@Override
	public Order viewOrder(int orderid) {
		entitymanager=util.createEntityManager();
		entitymanager.getTransaction().begin();
		Order order=entitymanager.find(Order.class, orderid);
		return order;
		
		
	}

	@Override
	public Order updateOrderDetails(Order order) {
		return null;
	
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Order> viewAllOrders(int custid) {
		entitymanager=util.createEntityManager();
		
		Query query = entitymanager.createQuery("SELECT * FROM orders o Where o.customerId = custid");
		return (List<Order>) query.getResultList();
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
