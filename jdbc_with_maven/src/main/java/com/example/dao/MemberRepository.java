package com.example.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.example.entity.Member;
import com.example.ifaces.CrudRepository;

public class MemberRepository implements CrudRepository<Member> {
	
	
	private Connection con;
	

	public MemberRepository(Connection con) {
		super();
		this.con = con;
		// TODO Auto-generated constructor stub
	}

	public int add(Member member) {
		int addrow = 0;
		
		String sql = "insert into SHANMAMEMBER3 values(?,?,?,?,?,?,?,?)";
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setInt(1,member.getMemberId());
			pstmt.setString(2,member.getMemberName());
			pstmt.setString(3,member.getMemberAddress());
			//pstmt.setDate(4, member.getAccountOpenDate());
			pstmt.setDate(4,Date.valueOf(member.getAccountOpenDate()));
			pstmt.setString(5,member.getMemberShipType());
			pstmt.setDouble(6, member.getFeesPaid());
			pstmt.setInt(7,member.getMaxBookAllowed());
			pstmt.setDouble(8, member.getPenaltyAmount());
			
			addrow = pstmt.executeUpdate();
			
		}catch(SQLException e) { 
			e.printStackTrace();
		}
		
		
		return addrow;
	}
	
	public List<Member> findAll() {
		
             List<Member> memberList = new ArrayList <Member>();
		
		String sql = "Select * from  SHANMAMEMBER3 ";
		
		try (PreparedStatement pstmt =con.prepareStatement(sql)){
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				int memberId = rs.getInt("member_id") ;
				 String memberName = rs.getString("member_name");
				 String memberAddress = rs.getString("member_address");
				 Date accountOpenDate = rs.getDate("Acc_Open_date");
				LocalDate accDate = accountOpenDate.toLocalDate();
				
//				 LocalDate date = LocalDate.of(2022, 4, 12);
//					Date sqlDate = Date.valueOf(date);
//					LocalDate date2 = sqlDate.toLocalDate();
//					
					
				 String memberShipType=rs.getString("membership_Type");
				 double feesPaid=rs.getDouble("fees_paid");
				 int maxBookAllowed=rs.getInt("max_books_allowed");
				 double penaltyAmount=rs.getDouble("penalty_amount");
				 
				 
				 Member members = new Member( memberId, memberName,memberAddress,accDate,
			 memberShipType,  feesPaid,  maxBookAllowed,  penaltyAmount);
				 
				 memberList.add(members);
			
		}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return memberList;
	}

	public int remove(int id) {
		int delrow = 0;
		String sql = "select * from SHANMAMEMBER3 where product id = ? ";
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setInt(18,id);
			delrow = pstmt.executeUpdate();
		
		
	}catch(SQLException e) {
		e.printStackTrace();
	}
		
		
		return delrow;
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


