package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.DBAction;
import dto.UserInfo;

public class UserInfoDao {
	
	public List<UserInfo> selectList() throws Exception{
		Connection conn = DBAction.getInstance().getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<UserInfo> userInfos = null;
		try {
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery("SELECT * FROM USERINFO ORDER BY NAME ASC");
			userInfos = new ArrayList<UserInfo>();
			while(rs.next()) {
				UserInfo userinfo = new UserInfo()
						.setId(rs.getString("ID"))
						.setName(rs.getString("Name"))
						.setPw(rs.getString("PW"));
				userInfos.add(userinfo);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			
		}
		return userInfos;
	
	}

}
