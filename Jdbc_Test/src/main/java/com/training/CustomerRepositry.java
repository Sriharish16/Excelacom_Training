package com.training;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepositry implements CrudRepositry<Customer> {
	
	private Connection con;
	
	public CustomerRepositry(Connection con) {
		super();
		// TODO Auto-generated constructor stub
		this.con=con;
	}

	public int add(LoanApplication obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<LoanApplication> findAll() {
List<LoanApplication>memberList= new ArrayList<LoanApplication>();
		
		String sql= "select*from sri_loan_application";
		
		try(PreparedStatement pstmt=con.prepareStatement(sql)){
			
			ResultSet rs=pstmt.executeQuery();
			
	while(rs.next()) {

		int applicationnumber =rs.getInt("application_number");
				
		int applicationid= rs.getInt("application_id");
				
		double loanamount =rs.getDouble("loan_amount");
//							
//		int customerid =rs.getInt("customer_id");
//				
//		String customername=rs.getString("customer_name");
//				 
//		long phonenumber= rs.getLong("phone_number");
//				
//		double penaltyAmount=rs.getDouble("credit_score");
				 
		LoanApplication mem = new LoanApplication(applicationnumber, applicationid, loanamount);
				
		memberList.add(mem);
			
		}
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return memberList;
	}
	

	public int remove(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Customer findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int update(int id, int obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int add(Customer obj) {
		// TODO Auto-generated method stub
		return 0;
	}

}
