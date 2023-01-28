package com.com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.com.domain.OracleInsertDTO;
import com.com.domain.PostgreInsertDTO;
import com.com.domain.insertDTO;
import com.com.service.InsertService;
import com.com.service.MemberService;

@Controller
public class TestController {
	
	@Autowired
	InsertService insertService;
	
	@Autowired
	MemberService memberService;
	
	@RequestMapping(value = "/insert")
	public void insert() {
		System.out.println("인서트페이지");
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String insert(insertDTO dto) throws Exception {
		insertService.insert(dto);
		System.out.println(dto.getUserId());
		return "main/home";
	}
	
	@RequestMapping(value = "/view")
	public String view(@RequestParam(value="userId")String userId,Model model)throws Exception {
		System.out.println("view");
		model.addAttribute("result",insertService.view(userId));
		return "/view";
	}
	
	// 오라클 인서트

	@RequestMapping(value = "/oracleInsert")
	public void oracleInsert() {
		System.out.println("오라클인서트페이지");
	}
	
	@RequestMapping(value = "/oracleInsert", method = RequestMethod.POST)
	public String oracleInsert(OracleInsertDTO dto) throws Exception {
		System.out.println("포스트진입");
		insertService.oracleInsert(dto);
		System.out.println(dto.getId());
		
		return "main/home";
	}
	
	// postgres 인서트
	@RequestMapping(value = "/user/postgresInsert")
	public String postgresInsert() {
		System.out.println("포스트그리인서트페이지");
		return "postgresInsert";
	}
	
	@RequestMapping(value = "/user/postgresInsert", method = RequestMethod.POST)
	public String postgresInsert(PostgreInsertDTO dto) throws Exception {
		System.out.println("포스트진입");
		insertService.postgresInsert(dto);
		
		return "main/home";
	}	
	@RequestMapping(value = "/user/login", method = RequestMethod.POST)
	public String login(PostgreInsertDTO dto,HttpSession session) throws Exception {
		
		PostgreInsertDTO result =memberService.login(dto);
		// 아이디 없을 경우
		if(result != null) {
			System.out.println("getUserPassword값 ? " + dto.getUserPassword());
			if(result.getUserPassword().equals(dto.getUserPassword())) {
				System.out.println("일치");
				session.setAttribute("member", result.getUserName());
				//관리자 일 경우 (권한값 2 == 관리자)
				if(result.getUserAuthority().equals("2")) {
					session.setAttribute("authority", result.getUserAuthority());
					return "redirect:/admin/qq/mainPage";
				}
				// 관리자 아닐 경우
				else {
					return "redirect:/user/mainPage";
				}
			}
			else {
				System.out.println("비번 불일치");
			}
		}
		else {
			System.out.println("아이디 없음");
		}
		return "main/home";
		
	}	
	// 로그인후 접속 메인페이지
	@RequestMapping(value ="/user/mainPage")
	public String mainPage(HttpSession session) {
		//세션없으면 그냥 로그인페이지 보여줌
		if(session.getAttribute("member")==null) {
			return "main/home";
		}
		System.out.println("로그인 완료 페이지");
		return "main/mainPage";
	}
	
	// 로그아웃
	@RequestMapping(value="/logout")
	public String logout(HttpSession session) {
		
		session.removeAttribute("member");
		session.removeAttribute("authority");
		return "redirect:/user/mainPage";
	}
		
	// 관리자 로그인후 접속 메인페이지
	@RequestMapping(value ="/admin/qq/mainPage")
	public String adminMainPage(HttpSession session) {
		//세션없으면 그냥 로그인페이지 보여줌
		if(session.getAttribute("member")==null || 
				!session.getAttribute("authority").equals("2")) {
			return "main/home";
		}
		return "admin/mainPage";

	}
	
}
