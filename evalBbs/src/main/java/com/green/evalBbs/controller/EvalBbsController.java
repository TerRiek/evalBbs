package com.green.evalBbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.green.evalBbs.dao.IEvalBbsDao;
import com.green.evalBbs.dto.EvalBbsDto;

@Controller
public class EvalBbsController {

	@Autowired
	private IEvalBbsDao iEvalBbsDao;
	
	@RequestMapping("/")
	public String root() {
		return "index";
	}

	@RequestMapping("/list")
	public String list(Model model) {
		model.addAttribute("list", iEvalBbsDao.getList());
		return "list";
	}
	
	@RequestMapping("/writeForm")
	public String writeForm() {
		return "writeForm";
	}
	
	@RequestMapping("/write")
	public String write(EvalBbsDto evalBbsDto) {
		iEvalBbsDao.writeDto(evalBbsDto.getTitle(), evalBbsDto.getContent(), evalBbsDto.getWriter(), evalBbsDto.getRegdate());
		return "redirect:list";
	}
	
	@RequestMapping("/detail")
	public ModelAndView detail(@RequestParam("bno") String bno_, ModelAndView modelAndView) {
		int bno = Integer.parseInt(bno_);
		modelAndView.addObject("dto", iEvalBbsDao.getDto(bno));
		modelAndView.setViewName("detail");
		return modelAndView;
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam("bno") String bno_) {
		int bno = Integer.parseInt(bno_);
		iEvalBbsDao.deleteDto(bno);
		return "redirect:list";
	}
}
