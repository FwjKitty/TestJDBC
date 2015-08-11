package com.hand.TestJDBC.test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;

import com.hand.TestJDBC.dao.UserDao;
import com.hand.TestJDBC.dao.impl.UserDaoImpl;
import com.hand.TestJDBC.entity.User;
import com.hand.TestJDBC.utils.ConnectionFactory;

public class ConnectionFactoryTest {

	public static void main(String[] args) throws SQLException {
		try {
			Connection conn = null;
			conn = ConnectionFactory.getInstance().makeConnection();
			UserDao userDao = new UserDaoImpl();
			User user = new User();
			user.setUn("fwj");
			user.setPw("lqh");
			user.setCreate_date(new Date(System.currentTimeMillis()));
			userDao.save(conn, user);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		/*ConnectionFactory cf = ConnectionFactory.getInstance();
		Connection conn = cf.makeConnection();
		System.out.println(conn.getAutoCommit());*/
	}
}