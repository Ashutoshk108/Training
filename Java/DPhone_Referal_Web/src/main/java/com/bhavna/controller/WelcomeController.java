package com.bhavna.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bhavna.dao.ReferralDao;

import com.bhavna.bean.ReferralBean;

@Controller
public class WelcomeController {
	static int id=1;
	@RequestMapping("/welcome.html")
	public String display() {
		return "welcome";
	}
	@RequestMapping("/register.html")
	public String register() {
		return "referral";
	}

	@RequestMapping("/home.html")
	public String display(HttpServletRequest req, Model m) {

		String name = req.getParameter("name");
		String mobile = req.getParameter("mobile");
		int age = Integer.parseInt(req.getParameter("age"));
		int code = Integer.parseInt(req.getParameter("code"));
		//System.out.println(age + "in method" + name);
		//int id = 1;
		if (age > 18) {
			ReferralBean obj = new ReferralBean(id, name, mobile, age, code);
			ReferralDao opt = new ReferralDao();
			opt.addReferral(obj);
			String msg = "Hello, " + name + " is eligible for Referral";
			m.addAttribute("message",msg);
			m.addAttribute("id1", id);
			m.addAttribute("name", name);
			m.addAttribute("mobile", mobile);
			m.addAttribute("age", age);
			m.addAttribute("code", code);
			//opt.viewReferral();
			id++;
			return "success";

		} else {
			String msg = name + " IS NOT QUALIFIED AS REFERRAL";
			m.addAttribute("message", msg);
			return "errorpage";
		}

	}
	/*
	@RequestMapping(value="/listReferrals",method=RequestMethod.GET)
	public ModelAndView getReferrals(ModelAndView modelAndView) {
		modelAndView.setViewName("referralList");
		List<ReferralBean> list=ReferralDao.getReferrals();
		modelAndView.addObject("list",list);
		return modelAndView;
	}*/
	@RequestMapping("/viewReferrals.html")
	public String getReferrals(Model m) {
		m.addAttribute("item",ReferralDao.getReferrals());
		return "referralList";
	}
}
