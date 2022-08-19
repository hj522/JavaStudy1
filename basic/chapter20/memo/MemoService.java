package chapter20.memo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.driver.OracleDriver;

public class MemoService {
	private MemoDAO dao = new MemoDAO();
	
	public List<MemoVO> selectList() throws Exception {
		return dao.selectList();
	}
	
	public MemoVO selectOne(int searchId) throws Exception {
		return dao.selectOne(searchId);
	}
	
	public int insertMemo(MemoVO vo) throws Exception {
		return dao.insertMemo(vo);
	}
	
	public int updateMemo(MemoVO vo) throws Exception {
		return dao.updateMemo(vo);
	}
	
	public int deleteMemo(int deleteId) throws Exception {
		return dao.deleteMemo(deleteId);
	}

}

