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
	// < 하나경 파트  시작 >  
	
	@RequestMapping(value="/nk.do")
	public String nkhello(Model model) {
		model.addAttribute("test", biz.nkhello());
		
		return "home";
	}
	
	// < 하나경 파트  끝 > 
	//------------------------------------------------------------------------------------------------------------------------------------
	
}
