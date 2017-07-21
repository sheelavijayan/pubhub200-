package com.sheela.orderdao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.sheela.book.Book;
import com.sheela.order.Order;

import util.ConnectionUtil;

public class OrderDAO {
	//public static void main(String[] args) throws ClassNotFoundException, SQLException {
	private JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();

	public void add(Order order) throws SQLException, ClassNotFoundException {

	Order order1=new Order();
		LocalDate date=LocalDate.parse( "2017-10-09");
		String sql="insert into orders(user_id,book_id,status,quantity,orders_date)values(?,?,?,?,?)";
		Object[] params={order1.getUserId(),order1.getBookId(),order1.getStatus(),order1.getQuantity(),order1.getOrderDate()};
		int rows=jdbcTemplate.update(sql,params);

		System.out.println(rows);
	}
	//public static void main(String[] args) throws ClassNotFoundException, SQLException {
	public List<Order> login() throws ClassNotFoundException, SQLException

	{
		String sql="select id,user_id,book_id,status,quantity,orders_date from orders ";
		List<Order>orderList = (List<Order>) jdbcTemplate.queryForObject(sql, (rs,rowNo)-> {

		int id1 = rs.getInt("id");
			int userId = rs.getInt("user_id");
			int bookId = rs.getInt("book_id");
			String status=rs.getString("status");
			int quantity=rs.getInt( "quantity");
			Date orderDate = rs.getDate("orders_date");

			Order order=new Order();
	order.setId(id1);
	order.setUserId(userId);
	order.setBookId(bookId);
	order.setStatus(status);
	order.setQuantity(quantity);
	  order.setOrderDate(orderDate.toLocalDate());
	//orderList.add(order);
return order;
		
		});
		//return bookList;
		System.out.println(orderList);
		
		return orderList;

	}


	

}
