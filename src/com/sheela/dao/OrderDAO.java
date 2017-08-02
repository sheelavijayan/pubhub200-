package com.sheela.dao;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.sheela.model.Order;
import com.sheela.util.ConnectionUtil;

public class OrderDAO {
	// public static void main(String[] args) throws ClassNotFoundException,
	// SQLException {
	private JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();

	public void add(Order order) throws SQLException, ClassNotFoundException {
		String sql = "insert into orders (user_id,book_id,status,quantity,orders_date)values(?,?,?,?,?);";
		Object[] params = { order.getUserId(), order.getBookId(), order.getStatus(), order.getQuantity(),
				order.getOrderDate() };

		int rows = jdbcTemplate.update(sql, params);
		System.out.println(rows);
	}

	// public static void main(String[] args) throws ClassNotFoundException,
	// SQLException {
	public List<Order> list() throws ClassNotFoundException, SQLException

	{
		String sql = "select id,user_id,book_id,status,quantity,orders_date from orders ";
		List<Order> orderList = jdbcTemplate.query(sql, (rs, rowNo) -> {

			int id1 = rs.getInt("id");
			int userId = rs.getInt("user_id");
			int bookId = rs.getInt("book_id");
			String status = rs.getString("status");
			int quantity = rs.getInt("quantity");
			Date orderDate = rs.getDate("orders_date");

			Order order = new Order();
			order.setId(id1);
			order.setUserId(userId);
			order.setBookId(bookId);
			order.setStatus(status);
			order.setQuantity(quantity);
			order.setOrderDate(orderDate.toLocalDate());
			// orderList.add(order);
			return order;

		});
		// return bookList;
		System.out.println(orderList);

		return orderList;

	}

}
