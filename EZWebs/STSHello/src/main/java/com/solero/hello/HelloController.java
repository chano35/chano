package com.solero.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/hellopage.do")
	public String hellopage(Model model) {
		System.out.println("HelloController [/hellopage.do]");
		model.addAttribute("msg", "스프링 부트의 세계에 오신 것을 환영합니다.");
		return "hellopage";
	}

}
