package test;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import com.sheela.dao.BookDAO;
import com.sheela.model.Book;

public class TestBookDAO {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		LocalDate date = LocalDate.parse("2016-12-12");
		Book book = new Book();
		book.setName("c++");
		book.setPrice(100);
		book.setPublished_date(date);

		BookDAO bookdao = new BookDAO();
		// bookdao.register(book);
		List<Book> bookList = bookdao.listBook();
		for (Book b : bookList) {
			System.out.println(b);
		}
	}
}