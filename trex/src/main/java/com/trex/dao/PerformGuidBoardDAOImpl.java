package com.trex.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.trex.dto.PerformGuidBoardVO;
import com.trex.dto.PerformScheduleVO;
import com.trex.dto.PerformVO;

public class PerformGuidBoardDAOImpl implements PerformGuidBoardDAO {

	private SqlSession session;
	public void setSession(SqlSession session) {
		this.session = session;
	}
	@Override
	public List<PerformGuidBoardVO> selectPFGBoardList() throws SQLException {
		
		List<PerformGuidBoardVO> PFGBoardList = session.selectList("PFGBoard-Mapper.selectPFGBoardList",null);
		
		return PFGBoardList;
	}

	@Override
	public PerformGuidBoardVO selectPFGBoard(String pfg_code) throws SQLException {
		
		PerformGuidBoardVO PFGBoard = session.selectOne("PFGBoard-Mapper.selectPFGBoard",pfg_code);
		
		return PFGBoard;
	}

	@Override
	public void insertPFGBoard(PerformGuidBoardVO PFGBoard) throws SQLException {
		session.update("PFGBoard-Mapper.insertPFGBoard",PFGBoard);

	}

	@Override
	public void updatePFGBoard(PerformGuidBoardVO PFGBoard) throws SQLException {
		session.update("PFGBoard-Mapper.updatePFGBoard",PFGBoard);

	}

	@Override
	public void deletePFGBoard(String pfg_code) throws SQLException {
		session.update("PFGBoard-Mapper.deletePFGBoard",pfg_code);

	}

	@Override
	public void increaseViewCnt(String pfg_code) throws SQLException {
		session.update("PFGBoard-Mapper.increaseViewCnt",pfg_code);

	}

	@Override
	public int selectPFGBoardNextSeq() throws SQLException {
		int seq_num = session.selectOne("PFGBoard-Mapper.selectPFGBoardNextSeq");
		return seq_num;
	}
	@Override
	public PerformVO selectPF(String pf_code) throws SQLException {
		PerformVO PF = session.selectOne("PFGBoard-Mapper.selectPF",pf_code);
		
		return PF;
	}
	@Override
	public PerformScheduleVO selectPFSH(String pf_code) throws SQLException {
		PerformScheduleVO PFSH = session.selectOne("PFGBoard-Mapper.selectPFSH",pf_code);
		
		return PFSH;
	}

}
