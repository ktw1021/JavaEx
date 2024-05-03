package com.javaex.jdbc;

import java.sql.*;

public class SelectTest {

	public static void main(String[] args) {
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		
		// Connection, Statement, ResultSet
		// try - with - resources 문 (자동 자원 정리)
		// AutoCloseable 인터페이스를 구현한 클래스들을 사용 가능
		ResultSet rs = null;
		Connection conn = null;
		Statement stmt = null;
		try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					conn = DriverManager.getConnection(dburl,"hr","hr");
					stmt = conn.createStatement();
					
					String sql = "SELECT department_id, department_name FROM Departments";
					rs = stmt.executeQuery(sql);	// DB cursor 반환
					
					// ResultSet 순회
					while (rs.next()) {
						// getXXX(컬럼 순서) or getXXX(컬럼 프로젝트 이름)
						int deptId = rs.getInt(1);	// rs.getInt("department_id")
						String deptName = rs.getString("department_name");	// rs.getString(2)
						System.out.printf("%d: %s%n",  deptId, deptName);
					}
					
				} catch (ClassNotFoundException e) {
					System.err.println("드라이버를 로드하지 못했습니다.");
					e.printStackTrace();
				} catch (SQLException e) {
					System.err.println("SQLError!");
					e.printStackTrace();
				} finally {
					try {
						rs.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
					try {
						stmt.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
					try {
						conn.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				
	}

}
