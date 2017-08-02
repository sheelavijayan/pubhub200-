package test;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import com.sheela.dao.OrderDAO;
import com.sheela.model.Order;

public class TestOrderDAO {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		LocalDate p = LocalDate.parse("2016-12-12");

		Order order = new Order();
		order.setUserId(3);
		order.setBookId(13);
		order.setStatus("ordered");
		order.setQuantity(2);
		order.setOrderDate(p);
		OrderDAO orderdao = new OrderDAO();
		orderdao.add(order);
		System.out.println(order);
		List<Order> orderList = orderdao.list();
		for (Order o : orderList) {
			System.out.println(o);
		}
	}

}
