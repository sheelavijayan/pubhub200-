package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sheela.book.Book;
import com.sheela.bookdao.BookDAO;

/**
 * Servlet implementation class AddBook
 */
@WebServlet("/AddBook")
public class AddBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("Register Servlet");
		//String id=request.getParameter("id");
		String name = request.getParameter("name");
		String price = request.getParameter("price");
		String publishedDate=request.getParameter("published_date");
		
		//int id1=Integer.parseInt(id);
		int p=Integer.parseInt(price);
		LocalDate date=LocalDate.parse(publishedDate);
		
Book book=new Book();
//book.setId( id1);
book.setName(name);
book.setPrice(p);
book.setPublished_date(date);
out.println(book);
BookDAO bookdao=new BookDAO();

try {
	bookdao.register(book);
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
