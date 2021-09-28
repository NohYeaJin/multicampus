package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.DBAction;
import dto.UserInfo;

public class UserInfoDao {

	private String Id;
	private String Pw;
	private String Name;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getPw() {
		return Pw;
	}

	public void setPw(String pw) {
		Pw = pw;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public List<UserInfo> selectList() throws Exception {
		Connection conn = DBAction.getInstance().getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<UserInfo> userInfos = null;
		try {
			stmt = conn.createStatement();

			rs = stmt.executeQuery("SELECT * FROM USERINFO ORDER BY NAME ASC");
			userInfos = new ArrayList<UserInfo>();
			while (rs.next()) {
				UserInfo userinfo = new UserInfo().setId(rs.getString("ID")).setName(rs.getString("Name"))
						.setPw(rs.getString("PW"));
				userInfos.add(userinfo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

		}
		return userInfos;

	}

	public UserInfo exist(String id, String pw) throws Exception {
		UserInfo userinfo = null;
		Connection conn = DBAction.getInstance().getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement("SELECT ID,PW,NAME FROM USERINFO WHERE ID=? AND PW=?");
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				userinfo = new UserInfo().setId(rs.getString("ID")).setName(rs.getString("NAME"))
						.setPw(rs.getString("PW"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userinfo;
	}

	public int insert(UserInfo userinfo) throws Exception {
		int result = -1;
		Connection conn = DBAction.getInstance().getConnection();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement("INSERT INTO USERINFO(ID,PW,NAME) VALUES(?,?,?)");
			pstmt.setString(1, userinfo.getId());
			pstmt.setString(2, userinfo.getPw());
			pstmt.setString(3, userinfo.getName());
			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public UserInfo selectOne(String id) {
		UserInfo userinfo = null;
		Connection conn = DBAction.getInstance().getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement("SELECT ID,PW, NAME FROM USERINFO WHERE ID=?");
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				userinfo = new UserInfo().setId(rs.getString("ID")).setName(rs.getString("NAME"))
						.setPw(rs.getNString("PW"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userinfo;

	}
	
	public int updateUserInfo(UserInfo userinfo) {
		int result = -1;
		Connection conn = DBAction.getInstance().getConnection();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement("update userinfo set pw=?, name=? where id=?");
			pstmt.setString(1,userinfo.getPw());
			pstmt.setString(2,userinfo.getName());
			pstmt.setString(3,userinfo.getId());
			result = pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public int delete(String id) throws Exception{
		int result = -1;
		Connection conn = DBAction.getInstance().getConnection();
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			result = stmt.executeUpdate("delete from userinfo where id='" + id + "'");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

}
