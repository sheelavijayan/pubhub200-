package com.sheela.testorderdao;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import com.sheela.order.Order;
import com.sheela.orderdao.OrderDAO;
import com.sheela.userdao.UserDAO;

public class TestOrderDAO {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		LocalDate p = LocalDate.parse("2016-12-12");

		 Order order=new Order();
		 order.setUserId( 3);
		 order.setBookId( 15);
		 order.setStatus( "ordered");
		 order.setQuantity( 2);
		 order.setOrderDate( p);
		 OrderDAO orderdao = new OrderDAO();
System.out.println(order);
List<Order> orderList=orderdao.login();
for(Order o:orderList)
{
	System.out.println(o);
}
	}

}
