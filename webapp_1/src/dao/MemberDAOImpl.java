package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import controller.src.Component;
import db.DBAction;
import dto.Member;


@Component("memberDao")
public class MemberDAOImpl implements MemberDAO2{
	private DataSource ds;
	public void setDataSource(DataSource ds) {
		this.ds = ds;
	}
	


	@Override
	public int insert(Member member) throws Exception {
		Connection conn = ds.getConnection();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement("insert into members3(email,manme,pwd,cre_date,mod_date) values(?,?,?,now(),now())");
			pstmt.setString(1, member.getEmail());
			pstmt.setString(2, member.getName());
			pstmt.setString(3, member.getPassword());
			return pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(int no) throws Exception {
		Connection conn = ds.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		Member member = null;
		int result = -1;
		try {
			stmt = conn.createStatement();
			result = stmt.executeUpdate("DELETE FROM MEMBERS3 WHERE MNO = "+no);
			return result;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Member selectOne(int no) throws Exception {
		Connection conn = ds.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		Member member = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT MNO,MNAME,EMAIL,CRE_DATE FROM MEMBERS3 WHERE MNO = "+no);
			if(rs.next()) {
				member.setNo(rs.getInt("NO"));
				member.setName(rs.getString("MNAME"));
				member.setEmail(rs.getString("EMAIL"));
				member.setCreatedDate(rs.getDate("CRE_DATE"));
				return member;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return member;
	}

	@Override
	public int update(Member member) throws Exception {
		Connection conn = ds.getConnection();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement("update members3 set email = ?, mname=?, pwd = ?, mod_date = now() where mno=?");
			pstmt.setString(1, member.getEmail());
			pstmt.setString(2, member.getName());
			pstmt.setString(3, member.getPassword());
			pstmt.setInt(4, member.getNo());
			return pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public Member exist(String email, String password) throws Exception {
		Connection conn = DBAction.getInstance().getConnection();
	    PreparedStatement stmt = null;
	    ResultSet rs = null;
	    try {
	      stmt = conn.prepareStatement(
	          "SELECT MNAME,EMAIL FROM MEMBERS"
	              + " WHERE EMAIL=? AND PWD=?");
	      stmt.setString(1, email);
	      stmt.setString(2, password);
	      rs = stmt.executeQuery();
	      if (rs.next()) {
	    	  Member member = new Member();
	    	  member.setName(rs.getString("MNAME"));
	    	  member.setName(rs.getString("EMAIL"));
	    	  return member;
	      } else {
	        return null;
	      }
	    } catch (Exception e) {
	      throw e;
	    } finally {
	      try {if (rs != null) rs.close();} catch (Exception e) {}
	      try {if (stmt != null) stmt.close();} catch (Exception e) {}
	      try {if (conn != null) conn.close();} catch (Exception e) {}
    }
  }
	
	
	public List<Member> SelectList() throws Exception {
		Connection conn = DBAction.getInstance().getConnection();

		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<Member> members = null;
		try {
			stmt = conn.createStatement();
                        // mysql, oralce
			rs = stmt.executeQuery(
			          "SELECT MNO, MNAME, EMAIL, CRE_DATE " + 
			              " FROM MEMBERS ORDER BY MNO ASC");
			members = new ArrayList<Member>();			
			while(rs.next()) {
				Member member = new Member();
				member.setNo(rs.getInt("MNO"));
				member.setName(rs.getString("MNAME"));
				member.setEmail(rs.getString("EMAIL"));
				member.setCreatedDate(rs.getDate("CRE_DATE"));
			    members.add(member);
			}					
		} catch (Exception e) {
		      throw e;
		} finally {
		  try {if (rs != null) rs.close();
		  if (stmt != null) stmt.close(); 
		  if (conn != null) conn.close();} catch (Exception e) {}
		}
		return members;		

	}
	
}