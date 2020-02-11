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
	// < 김성일 파트  시작 >  
	
	@RequestMapping("/home.do")
	public String sitest(Model model) {
		
		model.addAttribute("test",biz.sitesttest());
		return "home";
		
	}
	
	// < 김성일 파트  끝 > 
	//------------------------------------------------------------------------------------------------------------------------------------
	
}
