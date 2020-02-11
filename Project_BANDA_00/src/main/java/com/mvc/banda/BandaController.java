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
	// < 정재호 파트  시작 >  
	
	@RequestMapping("/jh.do")
	public String searchlist(Model model) {
		
		model.addAttribute("test", biz.searchlist());
		
		return "home";
	}
	
	// < OOO 파트  끝 > 
	//------------------------------------------------------------------------------------------------------------------------------------
	
}
