package com.mvc.banda.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.banda.dao.HJ_dao;
import com.mvc.banda.dao.JH_dao;
import com.mvc.banda.dao.JI_dao;
import com.mvc.banda.dao.JY_dao;
import com.mvc.banda.dao.NK_dao;
import com.mvc.banda.dao.SI_dao;
import com.mvc.banda.dao.UJ_dao;

@Service
public class BandaBiz {
	
	@Autowired
	private HJ_dao hj_dao;
	
	@Autowired
	private JH_dao jh_dao;
	
	@Autowired
	private JI_dao ji_dao;
	
	@Autowired
	private JY_dao jy_dao;
	
	@Autowired
	private NK_dao nk_dao;
	
	@Autowired
	private SI_dao si_dao;
	
	@Autowired
	private UJ_dao uj_dao;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//------------------------------------------------------------------------------------------------------------------------------------


	// < 주희진 파트  시작 >  


	
	public String testMethod() {
		
		return hj_dao.testMethod();
	}
	

	// < 주희진 파트  끝 > 
	//------------------------------------------------------------------------------------------------------------------------------------
	
	// < 하나경 파트  시작 > 
	public String nkhello() {
		return nk_dao.nkhello();
	}
	
	
	// < 하나경 파트  끝 > 


	// < 최주예 �뙆�듃  �떆�옉 >  
	
		public String feed_insert() {
			
			return jy_dao.feed_insert();
		}
	
	// < 최주예 �뙆�듃  �걹 > 
	//------------------------------------------------------------------------------------------------------------------------------------
	// < 김재익 파트  시작 >  
	
	public String chat() {
		return ji_dao.chat();
	}
	
	
	// < 김재익 파트  끝 > 
	//------------------------------------------------------------------------------------------------------------------------------------
	
	
}
