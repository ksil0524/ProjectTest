package com.mvc.banda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mvc.banda.biz.BandaBiz;

@Controller
public class BandaController {
	
	@Autowired
	private BandaBiz biz;

	//------------------------------------------------------------------------------------------------------------------------------------

	// < 주희진 파트  시작 > 
	
	@RequestMapping(value="/hj.do")
	public String test(Model model) {
		
		model.addAttribute("testresult", biz.testMethod());
		
		return "home";
		
	}
	// < 주희진 파트  끝 > 
	//------------------------------------------------------------------------------------------------------------------------------------

	// < 최주예 �뙆�듃  �떆�옉 >  
	
		@RequestMapping("/jy.do")
		public String feed_insert(Model model) {
			
			model.addAttribute("juye", biz.feed_insert());
			
			return "home";
		}
	
	// < 최주예 �뙆�듃  �걹 > 

	// < 유진 파트  시작 >  
	
	@RequestMapping("/uj.do")
	public String eugene(Model model) {
		
		model.addAttribute("testresult", biz.eugene());
		
		
		return "home";
	}
	
	
	
	// < 유진 파트  끝 > 
	//------------------------------------------------------------------------------------------------------------------------------------
	// < 김성일 파트  시작 >  
	
	@RequestMapping("/si.do")
	public String sitest(Model model) {
		
		model.addAttribute("test",biz.sitest());
		
		return "home";
	}
	
	
	// < 김성일 파트  끝 > 

	// < 하나경 파트  시작 >  
	
	@RequestMapping(value="/nk.do")
	public String nkhello(Model model) {
		model.addAttribute("test", biz.nkhello());
		
		return "home";
	}
	
	// < 하나경 파트  끝 > 

	//------------------------------------------------------------------------------------------------------------------------------------
	
	//------------------------------------------------------------------------------------------------------------------------------------
	// < 김재익 파트  시작 >
	
	@RequestMapping("ji.do")
	public String chat(Model model) {
		model.addAttribute("chat",biz.chat());
		return "home";
				
	}
	
	// < 김재익 파트  끝 > 
	//------------------------------------------------------------------------------------------------------------------------------------
}
