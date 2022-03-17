package com.members;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class MemberServiceMain {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/resources/context-members.xml"));
		MemberService memsvc = (MemberService)factory.getBean("memberService");
		memsvc.getMembers();
	}

}
