package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import db.DBAction;
import dto.Member;

public class MemberDAOImpl implements MemberDAO2{
	private DataSource ds;
	public void setDataSource(DataSource ds) {
		this.ds = ds;
	}
	


	@Override
	public int insert(Member member) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int no) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Member selectOne(int no) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Member member) throws Exception {
		// TODO Auto-generated method stub
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