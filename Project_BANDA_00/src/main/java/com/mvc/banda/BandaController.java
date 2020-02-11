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
	
}
