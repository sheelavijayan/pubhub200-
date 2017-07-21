package com.sheela.userdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;

import com.sheela.user.User;

import util.ConnectionUtil;

public class UserDAO {
	
	private JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();

	public void register(User user) throws SQLException, ClassNotFoundException {
		// public static void main(String[] args) throws ClassNotFoundException,
		// SQLException {

		// conn = ConnectionUtil.getConnection();

		String sql = "insert into user ( name, email, password) values ( ?, ? ,? )";

		Object[] params={user.getName(),user.getEmail(),user.getPassword()};
		int rows=jdbcTemplate.update(sql,params);
		
		System.out.println(rows);
	}

	public User login(String email, String password) throws SQLException, ClassNotFoundException {
		// public static void main(String[] args) throws ClassNotFoundException,
		// SQLException {


		String sql = "select id,name, email, password from user where email=? and password=?";
		Object[] params={email,password};
		User userclass=jdbcTemplate.queryForObject(sql,params,(rs,rowno)->{
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String email1 = rs.getString("email");
			String password1 = rs.getString("password");

			User user=new User();
			user.setId(id);
			user.setName(name);
			user.setEmail(email);
			user.setPassword(password);
			return user;
		});
		return userclass;
	

	}
}
