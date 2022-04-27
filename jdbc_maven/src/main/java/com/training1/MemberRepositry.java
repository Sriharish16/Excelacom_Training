package com.training1;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.training1.CrudRespositry;
import com.training1.Member;

//import com.example.entity.Product;

public class MemberRepositry implements CrudRespositry<Member> {
	
	private Connection con;

	public MemberRepositry(Connection con) {
		super();
		// TODO Auto-generated constructor stub
		this.con=con;
	}

	public int add(Member obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Member> findAll() {
		
List<Member>memberList= new ArrayList<Member>();
		
		String sql= "select*from sri_member1";
		
		try(PreparedStatement pstmt=con.prepareStatement(sql)){
			
			ResultSet rs=pstmt.executeQuery();
			
	while(rs.next()) {

		int memberId =rs.getInt("memberId");
				
		String memberName= rs.getString("memberName");
				
		String memberAddress =rs.getString("memberAddress");
				
		LocalDate accountOpenDate=rs.getDate("accountOpenDate").toLocalDate();
				
		String memberShipType =rs.getString("memberShip_Type");
				
		double feesPaid=rs.getDouble("feesPaid");
				 
		int maxBookAllowed= rs.getInt("maxBookAllowed");
				
		double penaltyAmount=rs.getDouble("penaltyAmount");
				 
		Member mem = new Member(memberId, memberName, memberAddress,accountOpenDate,memberShipType,feesPaid,maxBookAllowed,penaltyAmount);
				
		memberList.add(mem);
			
		}
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return memberList;
	}

	public int remove(int id) {
		
		String sql=("Delete from sri_member1 where memberid=? ");
		int rowsdeleted=0;
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setInt(1, id);
			
			rowsdeleted=pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
			
		
		return rowsdeleted;
	}

	public Member findById(int id) {

		return null;
	}

	public int update(int memberid, int feespaid) {
		
			String sql=("UPDATE sri_member1 SET feespaid = ? where memberid = ?");
			int rowsUpdated=0;
			try(PreparedStatement pstmt = con.prepareStatement(sql)){
				pstmt.setInt(1, feespaid);
				pstmt.setInt(2, memberid);
				
				
				rowsUpdated=pstmt.executeUpdate(); 
				
			} catch(SQLException e) {
				e.printStackTrace();
			}
			
			return rowsUpdated;
	}

	
		
		// TODO Auto-generated method stub
	
	}

	


