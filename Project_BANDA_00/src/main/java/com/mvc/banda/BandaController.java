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
	// < 유진 파트  시작 >  
	
	@RequestMapping("/uj.do")
	public String eugene(Model model) {
		
		model.addAttribute("testresult", biz.eugene());
		
		
		return "home";
	}
	
	
	
	// < 유진 파트  끝 > 
	//------------------------------------------------------------------------------------------------------------------------------------
	
}
