package com.training;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CustomerRepositry implements CrudRepositry<LoanApplication> {
	
	private Connection con;
	
	public CustomerRepositry(Connection con) {
		super();
		// TODO Auto-generated constructor stub
		this.con=con;
	}

	public int add(LoanApplication obj) {
		int addrows1=0;
		int addrows2=0;
		String custStr="insert into sri_customer values(?,?,?,?)";
		String loanStr="insert into sri_loan_application values(?,?,?)";
		try(
				PreparedStatement pmpt1=con.prepareStatement(loanStr);
				PreparedStatement pmpt2=con.prepareStatement(custStr);
				)
		{
			
			pmpt2.setInt(1,obj.getCustomer().getCustomerId());
			pmpt2.setString(2,obj.getCustomer().getCustomerName());
			pmpt2.setLong(3,obj.getCustomer().getPhoneNumber());
			pmpt2.setDouble(4,obj.getCustomer().getCreditScore());
			
			addrows2=pmpt2.executeUpdate();
			
			pmpt1.setInt(1,obj.getApplicationNumber());
			pmpt1.setInt(2,obj.getCustomer().getCustomerId());
			pmpt1.setDouble(3,obj.getLoanAmount());
	
	
			addrows1=pmpt1.executeUpdate();
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return addrows1;
	
	}

	public List<LoanApplication> findAll() {
List<LoanApplication>memberList= new ArrayList<LoanApplication>();
		
		String sql= " SELECT *FROM sri_customer LEFT JOIN sri_loan_application ON sri_customer.Customer_ID = sri_loan_application.application_id";
		
		try(PreparedStatement pstmt=con.prepareStatement(sql)){
			
			ResultSet rs=pstmt.executeQuery();
			
	while(rs.next()) {

		int applicationnumber =rs.getInt("application_number");
				
	//int applicationid=  rs.getInt("application_id");
				
	double loanamount =rs.getDouble("loan_amount");
							
	int customerid =rs.getInt("customer_id");
				
		String customername=rs.getString("customer_name");
				 
		long phonenumber= rs.getLong("phone_number");
				
		double penaltyAmount=rs.getDouble("credit_score");
		
		
		Customer customer = new Customer(customerid,customername,phonenumber,penaltyAmount);
				 
		LoanApplication mem = new LoanApplication(applicationnumber,customer,loanamount);
				
		memberList.add(mem);
			
		}
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return memberList;
	}
	

	public int remove(int id) {


		String sql=("SELECT *FROM sri_customer LEFT JOIN sri_loan_application ON sri_customer.Customer_ID = sri_loan_application.application_id where sri_customer_customer_id=?");
		int rowsdeleted=0;
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setInt(1, id);
			
			rowsdeleted=pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
			
		
		return rowsdeleted;
	}

	public List<LoanApplication> findById(int id) {
		
		List<LoanApplication>memberList= new ArrayList<LoanApplication>();	 
		

		String sql= " SELECT *FROM sri_customer LEFT JOIN sri_loan_application ON sri_customer.Customer_ID = sri_loan_application.application_id where customer_id=?";
		
		try(PreparedStatement pstmt=con.prepareStatement(sql)){
			
			ResultSet rs=pstmt.executeQuery();
			
	while(rs.next()) {

		int applicationnumber =rs.getInt("application_number");
				
	//int applicationid=  rs.getInt("application_id");
				
	double loanamount =rs.getDouble("loan_amount");
							
	int customerid =rs.getInt("customer_id");
				
		String customername=rs.getString("customer_name");
				 
		long phonenumber= rs.getLong("phone_number");
				
		double penaltyAmount=rs.getDouble("credit_score");
		
		
		Customer customer = new Customer(customerid,customername,phonenumber,penaltyAmount);
				 
		LoanApplication mem = new LoanApplication(applicationnumber,customer,loanamount);
				
		memberList.add(mem);
			
		}
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return memberList;
	
	}
	

	public int update(int id, int obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
