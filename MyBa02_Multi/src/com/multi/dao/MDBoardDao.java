package com.multi.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.multi.vo.MDBoardVo;

public class MDBoardDao extends SqlMapConfig{
	
	private String namespace = "multi.";
	
	//게시판 목록
	
	public List<MDBoardVo> selectAll(){
		
		SqlSession session = null;
		List<MDBoardVo> res = null;
		
		try {
		session = getSqlSessionFactory().openSession(true);
		res = session.selectList(namespace+"selectAll");
		}catch (Exception e) {

		}finally {
			session.close();
		}
		
		
		return res;
	}
	
	public MDBoardVo selectOne(int seq) {
		
		SqlSession session = null;
		MDBoardVo res = null;
		
		try {
			session = getSqlSessionFactory().openSession(true);
			res = session.selectOne(namespace+"selectOne", seq);
		}catch (Exception e) {
		}finally {
			session.close();
		}
		
		return res;
	}
	
	public int insert(MDBoardVo vo) {
		
		SqlSession session = null;
		int res = 0;
		try {
			session = getSqlSessionFactory().openSession(true);
			res = session.insert(namespace+"insert",vo);
		}catch (Exception e) {
		}finally {
			session.close();
		}
		
		return res;
	}
	
	public int update(MDBoardVo vo) {
		
		SqlSession session = null;
		int res = 0;
		try {
			session = getSqlSessionFactory().openSession(true);
			res = session.update(namespace+"update", vo);
		}catch (Exception e) {
		}finally {
			session.close();
		}
		
		return res;
	}
	
	public int delete(int seq) {
		
		SqlSession session = null;
		int res = 0;
		try {
			session = getSqlSessionFactory().openSession(true);
			res = session.delete(namespace+"delete", seq);
		}catch (Exception e) {
		}finally {
			session.close();
		}
		
		return res;
	}
	
	public int multiDelete(String[] seq) {
		
		SqlSession session = null;

		int count = 0;
		Map<String, String[]> map = new HashMap<String, String[]>();
		map.put("seq", seq);
		
		try {
			session = getSqlSessionFactory().openSession(false);
			count = session.delete(namespace+"muldel", map);
			
			if(count == seq.length) {
				session.commit();
			}
			
		}catch (Exception e) {
		}finally {
			session.close();
		}
		
		return count;
	}
	
	
	
	
	
	
	
	
	
	
}
