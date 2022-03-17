package com.member.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.member.service.MemberService;
import com.member.vo.MemberVO;

public class MemberUnitTest {
	final static String MEMBER_MID = "5678";
	ApplicationContext _context = null;
	
	@Before
	public void init() {
		System.out.println("[MemberUnitTest] init()");
		_context = new GenericXmlApplicationContext("classpath:spstep06-context.xml");
	}

	@Test
	public void insertMember() {
		System.out.println("[MemberRunMain] insertMember");
		
		MemberService memberService = _context.getBean("memberService", MemberService.class);

		MemberVO memberVO = new MemberVO(MEMBER_MID, "오육칠팔", "5678", "5678@email.co.kr");
		int result = memberService.insertMember(memberVO);
		System.out.printf("[MemberRunMain] insertMember: result(%d)\n", result);
		assertEquals(1, result);
	}

	@Test
	public void viewMember() {
		System.out.println("[MemberRunMain] viewMember");
		
		MemberService memberService = _context.getBean("memberService", MemberService.class);
		MemberVO memberVO = memberService.selectMember(MEMBER_MID);
		assertNotNull(memberVO);

		System.out.printf("memberVO: mid(%s), mname(%s), pwd(%s), email(%s), regdate(%s)\n",
				memberVO.getMid(), 
				memberVO.getMname(), 
				memberVO.getPwd(),
				memberVO.getEmail(),
				memberVO.getRegdate().toString());
	}

	@Test
	public void listMember() {
		System.out.println("[MemberRunMain] listMember");

		MemberService memberService = _context.getBean("memberService", MemberService.class);
		List<MemberVO> memberList = memberService.listMember();
		
		assertNotNull(memberList);

		for(MemberVO memberVO : memberList) {
			System.out.printf("memberVO: mid(%s), mname(%s), pwd(%s), email(%s), regdate(%s)\n",
				memberVO.getMid(), 
				memberVO.getMname(), 
				memberVO.getPwd(),
				memberVO.getEmail(),
				memberVO.getRegdate().toString());
		}
	}

	@Test
	public void deleteMember() {
		System.out.println("[MemberRunMain] deleteMember");

		MemberService memberService = _context.getBean("memberService", MemberService.class);
		int result = memberService.deleteMember(MEMBER_MID);
		// assertEquals(1, result);
		boolean br = (result == 1);
		assertTrue(br);
		
		System.out.printf("[MemberRunMain] deleteMember: result(%d)\n", result);
	}
	
	@Test
	public void editMember() {
		System.out.println("[MemberRunMain] editMember");
		
		MemberService memberService = _context.getBean("memberService", MemberService.class);

		MemberVO memberVO = memberService.selectMember(MEMBER_MID);
		assertNotNull(memberVO);
		
		System.out.printf("memberVO: mid(%s), mname(%s), pwd(%s), email(%s), regdate(%s)\n",
				memberVO.getMid(), 
				memberVO.getMname(), 
				memberVO.getPwd(),
				memberVO.getEmail(),
				memberVO.getRegdate().toString());
			
		memberVO.setMname("오사랑");
		memberVO.setPwd("8765");
		memberVO.setEmail("8765@email.co.kr");
		int result = memberService.updateMember(memberVO);
		assertEquals(1, result);
		System.out.printf("[MemberRunMain] editMember: result(%d)\n", result);
	}


	@After
	public void close() {
		System.out.println("[MemberUnitTest] close()");
	}
}
