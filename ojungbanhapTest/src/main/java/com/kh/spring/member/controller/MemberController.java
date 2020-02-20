package com.kh.spring.member.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

// 프레젠테이션 레이어, 웹 애플리케이션에서 View에서 전달받은 웹 요청과
// 응답을 처리하는 클래스임을 나타냄 + bean 등록
@Controller
@RequestMapping("/member/*")		// 내부 메소드 레벨에서 매핑되는 주소에 공통되는 부분 작성.
public class MemberController {
	/*
	 * // 1. HttpServletRequest를 이용하여 파라미터 받기(기존 Servlet방식)
	 * 
	 * @RequestMapping(value="login", method=RequestMethod.POST) // /member/login
	 * 요청을 매핑하는 메소드 + POST 방식 요청만
	 * 
	 * public String memberLogin(HttpServletRequest request) { // 메게변수로
	 * HttpServletRequest를 작성하면 // 스프링 컨테이너가 자동으로 요청페이지의 // HttpServletRequest 객체를
	 * 매개변수로 주입해줌. String memberId = request.getParameter("memberId"); String
	 * memberPwd = request.getParameter("memberPwd");
	 * 
	 * System.out.println(memberId + " / " + memberPwd);
	 * 
	 * return "main";
	 * 
	 * }
	 */
	
	// 2. @@RequestParam 어노테이션
	@RequestMapping(value="login", method=RequestMethod.POST)
	//		/member/login 요청을 매핑하는 메소드 + POST 방식 요청만
	
	public String memberLogin(@RequestParam("memberId") String memberId,
							@RequestParam("memberPwd") String memberPwd) {
		
		System.out.println(memberId + " / " + memberPwd);
		
		return "main";
		
	}
}
