package com.sheela.bookdao;

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

import util.ConnectionUtil;

public class BookDAO {
	// public static void main(String[] args) throws ClassNotFoundException,
	// SQLException {
	private JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();

	public void register(Book book) throws SQLException, ClassNotFoundException {
		LocalDate p = LocalDate.parse("2016-12-12");
		Connection conn = ConnectionUtil.getConnection();

		String sql = "insert into book(name,price,published_date)values(?,?,?)";
		Object[] params={book.getName(),book.getPrice(),book.getPublished_date()};
		int rows=jdbcTemplate.update(sql,params);
		
		System.out.println(rows);

	}

	public List<Book> listBook() throws ClassNotFoundException, SQLException {
		// public static void main(String[] args) throws ClassNotFoundException,
		// SQLException {

		String sql = "select id,name,price,published_date from book ";
		
		List<Book>bookList = (List<Book>) jdbcTemplate.queryForObject(sql, (rs,rowNo)-> {

			int id1 = rs.getInt("id");
			String name1 = rs.getString("name");
			int price = rs.getInt("price");
			Date publishedDate = rs.getDate("published_date");

			Book book = new Book();
			book.setId(id1);
			book.setName(name1);
			book.setPrice(price);
			book.setPublished_date(publishedDate.toLocalDate());
			return book;
		});
		// return bookList;
		System.out.println(bookList);
		//for (Book b : bookList) {
			//System.out.println(b);
		//}
		return bookList;

	}

}
