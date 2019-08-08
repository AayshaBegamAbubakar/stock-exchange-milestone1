package com.example.stockspring.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.stockspring.model.Company;
import com.example.stockspring.service.CompanyService;
import com.example.stockspring.service.CompanyServiceImpl;

@Controller
public class CompanyControllerImpl implements CompanyController{

	
	@Autowired
	private CompanyService companyService;
	
	
	
	
	

	@RequestMapping(path="/companyList")
	public ModelAndView getCompanyList() throws Exception {
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("companyList");
		mv.addObject("companyList",companyService.getCompanyList());
		return mv;
	}






	@Override
	public ModelAndView insertCompany() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}






	@Override
	public ModelAndView updateCompany() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	
	
	
}
