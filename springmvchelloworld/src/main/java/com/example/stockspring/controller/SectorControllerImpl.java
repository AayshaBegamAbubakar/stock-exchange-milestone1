package com.example.stockspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import com.example.stockspring.service.CompanyService;
import com.example.stockspring.service.SectorService;
@Controller
public class SectorControllerImpl implements SectorController {
	@Autowired
	private SectorService sectorService;
	
	@Override
	public ModelAndView insertSector() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView getSectorList() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView updateSector() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
