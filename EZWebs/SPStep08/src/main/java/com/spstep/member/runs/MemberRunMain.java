package com.spstep.member.runs;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spstep.member.service.MemberService;
import com.spstep.member.vo.MemberVO;

public class MemberRunMain {
	final static String MEMBER_MID = "5678";
	
	ApplicationContext _context = new GenericXmlApplicationContext("classpath:spstep08-context.xml");
	
	public MemberRunMain() {
	}
	
	public static void main(String[] args) {
		System.out.println(">>> 애플리케이션에서 서비스 테스트 <<<");
		MemberRunMain memberRunMain = new MemberRunMain();
		
		memberRunMain.deleteMember();

		memberRunMain.listMember();

		memberRunMain.insertMember();
		memberRunMain.viewMember();
		memberRunMain.editMember();
		memberRunMain.deleteMember();
		
		memberRunMain.listMember();
	}
	
	
	public void insertMember() {
		System.out.println("[MemberRunMain] insertMember");
		
		MemberService memberService = _context.getBean("memberService", MemberService.class);

		MemberVO memberVO = new MemberVO(MEMBER_MID, "오육칠팔", "5678", "5678@email.co.kr");
		int result = memberService.insertMember(memberVO);
		if(result > 0) {
			System.out.printf("[MemberRunMain] insertMember: succeed -> result(%d)\n", result);
			return;
		}
		
		System.out.printf("[MemberRunMain] insertMember: failed -> result(%d)\n", result);
	}

	public void viewMember() {
		System.out.println("[MemberRunMain] viewMember");
		
		MemberService memberService = _context.getBean("memberService", MemberService.class);
		MemberVO memberVO = memberService.selectMember(MEMBER_MID);
		if(memberVO != null) {
			System.out.printf("memberVO: mid(%s), mname(%s), pwd(%s), email(%s), regdate(%s)\n",
					memberVO.getMid(), 
					memberVO.getMname(), 
					memberVO.getPwd(),
					memberVO.getEmail(),
					memberVO.getRegdate().toString());
			System.out.printf("[MemberRunMain] viewMember: succeed\n");
			return;
		}
		
		System.out.printf("[MemberRunMain] viewMember: failed\n");
	}

	public void listMember() {
		System.out.println("[MemberRunMain] listMember");

		MemberService memberService = _context.getBean("memberService", MemberService.class);
		List<MemberVO> memberList = memberService.listMember();

		for(MemberVO memberVO : memberList) {
			System.out.printf("memberVO: mid(%s), mname(%s), pwd(%s), email(%s), regdate(%s)\n",
				memberVO.getMid(), 
				memberVO.getMname(), 
				memberVO.getPwd(),
				memberVO.getEmail(),
				memberVO.getRegdate().toString());
		}
	}

	public void deleteMember() {
		System.out.println("[MemberRunMain] deleteMember");

		MemberService memberService = _context.getBean("memberService", MemberService.class);
		int result = memberService.deleteMember(MEMBER_MID);
		if(result > 0) {
			System.out.printf("[MemberRunMain] deleteMember: succeed -> result(%d)\n", result);
			return;
		}
		
		System.out.printf("[MemberRunMain] deleteMember: failed -> result(%d)\n", result);
	}
	
	public void editMember() {
		System.out.println("[MemberRunMain] editMember");
		
		MemberService memberService = _context.getBean("memberService", MemberService.class);

		MemberVO memberVO = memberService.selectMember(MEMBER_MID);
		if(memberVO != null) {
			System.out.printf("memberVO: mid(%s), mname(%s), pwd(%s), email(%s), regdate(%s)\n",
					memberVO.getMid(), 
					memberVO.getMname(), 
					memberVO.getPwd(),
					memberVO.getEmail(),
					memberVO.getRegdate().toString());
			
			memberVO.setMid("오사랑");
			memberVO.setPwd("8765");
			memberVO.setMid("8765@email.co.kr");
			int result = memberService.updateMember(memberVO);
			if(result > 0) {
				System.out.printf("[MemberRunMain] editMember: succeed -> result(%d)\n", result);
			}
			
			return;
		}
		
		System.out.printf("[MemberRunMain] editMember: failed\n");
	}
}
