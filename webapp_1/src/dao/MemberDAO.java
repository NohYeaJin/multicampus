package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import db.DBAction;

public class MemberDAO {
	private static MemberDAO instance = new MemberDAO();

	public static MemberDAO getInstance() {
			return instance;
		}
	
	public int loginMember(MemberVO memberVO) throws Exception {
		int result = -1;
		Connection conn = DBAction.getInstance().getConnection();
		PreparedStatement pstmt = null;
		try {
			String sql = "SELECT * FROM MEMBERS2 WHERE ID=?, PW=?";
			pstmt = conn.prepareStatement(sql);
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();		
		}
		
		return result;
	}
	
	public ArrayList<AddressVO> findAddress(String dong) throws Exception{
		ArrayList<AddressVO> addressList = new ArrayList<>();
		Connection conn = DBAction.getInstance().getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "SELECT * FROM ZIPCODE WHERE DONG LIKE '%" + dong.trim() + "%' ORDER BY seq";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				AddressVO addressVO = new AddressVO();
				addressVO.setZipcode(rs.getString("zipcode"));
				addressVO.setSido(rs.getString("sido"));
				addressVO.setGugun(rs.getString("gugun"));
				addressVO.setDong(rs.getString("dong"));
				addressVO.setRi(rs.getString("ri"));
				addressVO.setBldg(rs.getString("bldg"));
				addressVO.setBunji(rs.getString("bunji"));
				addressList.add(addressVO);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return addressList;
	}
	
	public int JoinMember(MemberVO memberVO) throws Exception {
		int result = -1;
		Connection conn = DBAction.getInstance().getConnection();
		PreparedStatement pstmt = null;
		try {
			String sql = "INSERT INTO MEMBERS2(id,pwd,name,email,zip_num,address,phone,indate) VALUES(?,?,?,?,?,?,?,now())";
			pstmt = conn.prepareStatement(sql);	
			pstmt.setString(1, memberVO.getId());
			pstmt.setString(2, memberVO.getPwd());
			pstmt.setString(3, memberVO.getName());
			pstmt.setString(4, memberVO.getEmail());
			//System.out.println(memberVO.getAddress());
			pstmt.setString(5, memberVO.getZip_um());
			pstmt.setString(6, memberVO.getAddress());
			pstmt.setString(7, memberVO.getPhone());
			//pstmt.setString(8, memberVO.getIndate()); 
			result = pstmt.executeUpdate();	
		}catch(Exception e) {
			e.printStackTrace();		
		}
		
		return result;
	}

	public boolean overlappedID(String id) {
		// TODO Auto-generated method stub
		return false;
	}
}