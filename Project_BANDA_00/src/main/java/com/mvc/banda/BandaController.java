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
	// < 최주예 �뙆�듃  �떆�옉 >  
	
		@RequestMapping("/jy.do")
		public String feed_insert(Model model) {
			
			model.addAttribute("juye", biz.feed_insert());
			
			return "home";
		}
	
	// < 최주예 �뙆�듃  �걹 > 
	//------------------------------------------------------------------------------------------------------------------------------------
	
}
