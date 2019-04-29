package egovframework.example.sample.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import egovframework.example.sample.service.MemberService;
import egovframework.example.sample.service.MemberVO;

@Controller
public class MemberController {
	
	@Resource(name="memberService")
	private MemberService memberService;
	
	@RequestMapping("/member/list")
	public String selectAll() throws Exception{
		System.out.println("목록 요청 받음");
		
		return "member/list";
	}
	
	@RequestMapping("/member/registform")
	public String registForm() throws Exception{
		return "member/regist";
	}
	@RequestMapping(value="/member/regist", method=RequestMethod.POST)
	public String insert(@ModelAttribute("MemberVO") MemberVO memberVO) throws Exception{
		memberService.insert(memberVO);
		System.out.println("등록성공");
		return null;
	}
}
