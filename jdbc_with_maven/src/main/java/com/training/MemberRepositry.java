package com.training;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//import com.example.entity.Product;

public class MemberRepositry implements CrudRespositry<Member> {
	
	private Connection con;

	public MemberRepositry(Connection con) {
		super();
		// TODO Auto-generated constructor stub
	}

	public int add(Member obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Member> findAll() {
List<Member>productList= new ArrayList<Member>();
		
		String sql= "select*from sri_member1";
		
		try(PreparedStatement pstmt=con.prepareStatement(sql)){
			
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next()) {

				int memberId =rs.getInt("memberId");
				
				String memberName= rs.getString("memberName");
				
				String memberAddress =rs.getString("memberAddress");
				
				LocalDate accountOpenDate=rs.getDate("accountOpenDate").toLocalDate();
				
				String memberShipType =rs.getString("memberShipType");
				 double feesPaid=rs.getDouble("feesPaid");
				 int maxBookAllowed= rs.getInt("maxBookAllowed");
				 double penaltyAmount=rs.getDouble("penaltyAmount");
				
				
				Member mem = new Member(memberId, memberName, memberAddress,accountOpenDate,memberShipType,feesPaid,maxBookAllowed,penaltyAmount);
				
				productList.add(mem);
			
		}
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public int remove(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Member findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int update(int id, Member obj) {
		// TODO Auto-generated method stub
		return 0;
	}

}
