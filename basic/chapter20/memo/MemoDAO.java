package chapter20.memo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.driver.OracleDriver;

	// Data Access Object: ���� �����ͺ��̽��� �����ؼ� ������ ó��(�б�/����/��� ��)
	
	public class MemoDAO {

		public List<MemoVO> selectList() throws Exception {
			DriverManager.registerDriver(new OracleDriver());
			
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "pc07", "java");
			Statement statement = connection.createStatement();

			// ���ڿ� ����
			// 1. + ��ȣ�� ���ڿ� ����
			// 2. StringBuilder(StringBuffer)�� ���ڿ� ����: �ӵ��� ����
//			statement.executeQuery("select id, title, contents, register_date, modify_date from memo");
			StringBuilder builder = new StringBuilder();
			builder.append("select "); 
			builder.append("   id, "); // alt + shift + A ������ ȭ�� �۾���
			builder.append("   title, ");
			builder.append("   contents, ");
			builder.append("   register_date, ");
			builder.append("   modify_date ");
			builder.append("FROM ");
			builder.append("   memo ");
			String sql = builder.toString();
			
			ResultSet resultSet = statement.executeQuery(sql);
			
			// ����� 0~���Ѵ� -> flux
			List<MemoVO> list = new ArrayList<>();
			while (resultSet.next()) {
				int id = resultSet.getInt("id");             //�÷������� ���� �� ��õ
				String title = resultSet.getString("title");
				String contents = resultSet.getString("contents");
				Date registerDate = resultSet.getDate("register_date");
				Date modifyDate = resultSet.getDate("modify_date");
				
				list.add(new MemoVO(id, title, contents, registerDate, modifyDate));
			}
			resultSet.close();
			statement.close();
			connection.close();
			return list;
		}
		
		public MemoVO selectOne(int searchId) throws Exception {
			DriverManager.registerDriver(new OracleDriver());
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "pc07", "java");
			Statement statement = connection.createStatement();
			StringBuilder builder = new StringBuilder();
			builder.append("select "); 
			builder.append("   id, "); 
			builder.append("   title, ");
			builder.append("   contents, ");
			builder.append("   register_date, ");
			builder.append("   modify_date ");
			builder.append("FROM ");
			builder.append("   memo ");
			builder.append("WHERE ");
			builder.append("   id =" + searchId);
			String sql = builder.toString();
			
			ResultSet resultSet = statement.executeQuery(sql);
			 // ����� 0 or 1 -> Mono
			MemoVO vo = null;
			if (resultSet.next()) {
				int id = resultSet.getInt("id");
				String title = resultSet.getString("title");
				String contents = resultSet.getString("contents");
				Date registerDate = resultSet.getDate("register_date");
				Date modifyDate = resultSet.getDate("modify_date");
				vo = new MemoVO(id, title, contents, registerDate, modifyDate);
			}
			resultSet.close();
			statement.close();
			connection.close();
			return vo;
		}
		
		public int insertMemo(MemoVO vo) throws Exception {
			DriverManager.registerDriver(new OracleDriver());
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "pc07", "java");
			StringBuilder builder = new StringBuilder();
			builder.append("INSERT INTO memo ("); 
			builder.append("    id,"); 
			builder.append("    title,");
			builder.append("    contents");
			builder.append(") VALUES (");
			builder.append("    memo_seq.nextval,");
			builder.append("	?,");
			builder.append("	?");
			builder.append(")");
			String sql = builder.toString();
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, vo.getTitle());
			statement.setString(2, vo.getContents());
			
			// insert, update, delete�� ��� executeUpdate()�޼ҵ带 ȣ��
			int executeUpdate = statement.executeUpdate();
			statement.close();
			connection.close();
			return executeUpdate;
		}
		
		public int updateMemo(MemoVO vo) throws Exception {
			DriverManager.registerDriver(new OracleDriver());
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "pc07", "java");
			StringBuilder builder = new StringBuilder();
			builder.append("update memo"); 
			builder.append("	set "); 
			builder.append("    title = ?, ");
			builder.append("    contents = ?, ");
			builder.append("    modify_date = sysdate ");
			builder.append("where ");
			builder.append("    id =  ?");

			String sql = builder.toString();
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, vo.getTitle());
			statement.setString(2, vo.getContents());
			statement.setInt(3, vo.getId());
			
			// insert, update, delete�� ��� executeUpdate()�޼ҵ带 ȣ��
			int executeUpdate = statement.executeUpdate();
			statement.close();
			connection.close();
			return executeUpdate;
		}
		
		public int deleteMemo(int deleteId) throws Exception {
			DriverManager.registerDriver(new OracleDriver());
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "pc07", "java");
			StringBuilder builder = new StringBuilder();
			builder.append("DELETE FROM "); 
			builder.append("	memo "); 
			builder.append("WHERE ");
			builder.append("    ID = ?");

			String sql = builder.toString();
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, deleteId);

			// insert, update, delete�� ��� executeUpdate()�޼ҵ带 ȣ��
			int executeUpdate = statement.executeUpdate();
			statement.close();
			connection.close();
			return executeUpdate;
		}

	}
