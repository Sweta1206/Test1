package com.test1.question1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Client1 extends Observer{

	  public Client1(Database db) {
	        this.db = db;
	        this.db.add( this);
	    }


	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println( "Update State" + db.getState() );
		int eno=db.getState();
		int dept_no=db.getdpt();
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");
			 pstmt=con.prepareStatement("UPDATE emp2 SET DNO=? WHERE ENO=?");
			pstmt.setInt(1,dept_no);
			pstmt.setInt(2,eno);
			int update=pstmt.executeUpdate();
			if(update>0)
			{
			System.out.println("Record updated for employee:"+eno);	
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (pstmt!= null) {
					pstmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
