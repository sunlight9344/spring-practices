package com.poscodx.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ReqeustMapping 매서드 단독 매핑
 * 
 */

@Controller
public class BoardController {
	
	@ResponseBody
	@RequestMapping("/board/write")
	public String write() {
		return "BoardController.write()";
	}
	
	@ResponseBody
	@RequestMapping("/board/view/{no}")
	public String view(@PathVariable("no") int no) {
		return "BoardController.view(" + no + ")";
	}
	
	@ResponseBody
	@RequestMapping("/board/view")
	public String view2(int no) {
		return "BoardController.view2(" + no + ")";
	}
}
