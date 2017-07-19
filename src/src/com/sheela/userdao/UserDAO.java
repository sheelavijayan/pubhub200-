package com.sheela.userdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sheela.user.User;

import util.ConnectionUtil;

public class UserDAO {

	public void register(User user) throws SQLException, ClassNotFoundException {
		// public static void main(String[] args) throws ClassNotFoundException,
		// SQLException {

		Connection conn = ConnectionUtil.getConnection();

		String sql = "insert into user ( name, email, password) values ( ?, ? ,? )";

		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setString(1, user.getName());
		pst.setString(2, user.getEmail());
		pst.setString(3, user.getPassword());

		int rows = pst.executeUpdate();
		System.out.println(rows);
	}

	public User login(String email, String password) throws SQLException, ClassNotFoundException {
		// public static void main(String[] args) throws ClassNotFoundException,
		// SQLException {

		Connection conn = ConnectionUtil.getConnection();

		String selectQuery = "select id,name, email, password from user where email=? and password=?";
		PreparedStatement pst = conn.prepareStatement(selectQuery);
		pst.setString(1,email);
		pst.setString(2,password);
		ResultSet rs = pst.executeQuery();
		User user = null;
		if (rs.next()) {
			System.out.println("User exists");
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String email1 = rs.getString("email");
			String password1 = rs.getString("password");

			 user=new User();
			user.setId(id);
			user.setName(name);
			user.setEmail(email);
			user.setPassword(password);
			System.out.println(user);
		}
		return user;
	

	}
}
