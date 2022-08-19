package chapter20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver; // �̰� ���� ����

public class JDBCExample {
	public static void main(String[] args) throws Exception {
		
		// JDBC(Java DataBase Connectivity) : �ڹ�-DB����
		
		/* 
		 * 0. �غ�
		 * JDBC Driver
		 * Oracle JDBC => ojdbc.jar
		 */

		new OracleDriver();
		
		/*
		 * 1. ����Ŭ ����̹� �ε�
		 * 2. ���� ������ ���� ����
		 * 3. ���� �ۼ�
		 * 4. ���� ���� �� ��� �ޱ�
		 * 5. ��� �м�(Parsing)
		 * 6. ���ҽ� �ݱ�
		 */

		
		// 1. ����̹� �ε�
		
		// 1-1. reflection ����� ����� ����̹� �ε�
		Class.forName("oracle.jdbc.driver.OracleDriver");
		 
		// 1-2. DriverManager Ŭ������ �̿��Ͽ� ����̹� �ε�(������ ��õ)
		DriverManager.registerDriver(new OracleDriver());
		
		
		// 2. ���� ������ ���� �����ͺ��̽� ����
		// 127.0.0.1 == localhost
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "pc07", "java");
		
		// 3. ������ �ۼ�
		Statement statement = connection.createStatement();  // sqldeveloper�� ��ũ��Ʈ ������ ����
		
		// 4. ���� ���� �� ��� �ޱ�
		ResultSet resultSet = statement.executeQuery("select mem_id, mem_name, mem_hp, mem_mail from member");
		
		// 5. ��� �м�(Parsing)
		while (resultSet.next()) {
			String memId = resultSet.getString("mem_id");
			String memName = resultSet.getString("mem_name");
			String memHp = resultSet.getString("mem_hp");
			String memMail = resultSet.getString("mem_mail");
			System.out.printf("%s \t %s \t %s \t %s \n", memId, memName, memHp, memMail);
		}
		
		// 6. �ڿ�(���ҽ�) �ݳ�
		resultSet.close();
		statement.close();
		connection.close();
	}
}









