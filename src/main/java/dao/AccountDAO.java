package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.Account;

public class AccountDAO {
	private Connection conn;

	public AccountDAO(Connection conn) {
		this.conn = conn;
	}

	// fetch user's account by email
	public Account getAccountInfoByEmail(String user_mail) throws SQLException {
		String sql = "select * from account where user_mail = ?";
		PreparedStatement stmt = conn.prepareStatement(sql);

		stmt.setString(1, user_mail);

		ResultSet rs = stmt.executeQuery();

		Account acc = new Account();
		while (rs.next()) {
			acc.setUser(rs.getString(1));
			acc.setPassword(rs.getString(2));
			acc.setRole(rs.getString(3));
			acc.setName(rs.getString(4));
			acc.setAddress(rs.getString(5));
			acc.setPhone(rs.getString(6));
			acc.setAge(rs.getInt(7));
		}
		System.out.println(acc.getAge());
		return acc;
	}

	// authentication user account
	public boolean login(String email, String password) throws SQLException {
		String sql = "select count(*) as count from account where user_mail = ? and password =?";
		PreparedStatement stmt = conn.prepareStatement(sql);

		stmt.setString(1, email);
		stmt.setString(2, password);

		ResultSet rs = stmt.executeQuery();

		int count = 0;
		if (rs.next()) {
			count = rs.getInt("count");
		}

		rs.close();
		stmt.close();

		if (count == 0) {
			return false;
		}
		return true;
	}

	public void create(String email, String password, String name) throws SQLException {
		String sql = "insert into account (user_mail, password, user_name) values (?,?,?)";

		PreparedStatement stmt = conn.prepareStatement(sql);

		stmt.setString(1, email);
		stmt.setString(2, password);
		stmt.setString(3, name);

		stmt.executeUpdate();

		stmt.close();
	}

	public boolean exist(String email) throws SQLException {
		String sql = "select count(*) as count from account where user_mail = ?";

		PreparedStatement stmt = conn.prepareStatement(sql);

		stmt.setString(1, email);

		int count = 0;
		ResultSet rs = stmt.executeQuery();

		if (rs.next()) {
			count = rs.getInt("count");
		}

		if (count == 0)
			return false;
		return true;
	}

	// update information user account
	public void updateInformationByEmail(String userMail, String newUserMail, String userName, String userPassword,
			String userAge, String address, String phoneNumber) throws SQLException {
		
		// update address and phone number only
		if (newUserMail == null || userPassword == null || userName == null) {
			String query = "update account set user_address = ?, user_phone = ? where user_mail = ?";
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setString(1, address);
			stmt.setString(2, phoneNumber);
			stmt.setString(3, userMail);
			stmt.executeUpdate();
		} 
		
		//update all information 
		else {
			String query = "update account set user_name = ?,  password = ?, user_age = ?,"
							+ "user_address = ?, user_phone = ?, user_mail = ? "
							+ "where user_mail = ?";
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setString(1, userName);
			stmt.setString(2, userPassword);
			stmt.setString(3, userAge);
			stmt.setString(4, address);
			stmt.setString(5, phoneNumber);
			stmt.setString(6, newUserMail);
			stmt.setString(7, userMail);
	
			System.out.println(query);
			stmt.executeUpdate();
		}
	}

	public void updateInformationByEmail(String userMail, String address, String phoneNumber) throws SQLException {
		updateInformationByEmail(userMail, null, null, null, null, address, phoneNumber);
	}

}