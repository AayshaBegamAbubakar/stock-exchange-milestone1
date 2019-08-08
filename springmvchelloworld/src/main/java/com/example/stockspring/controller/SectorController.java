package com.example.stockspring.controller;

import org.springframework.web.servlet.ModelAndView;

public interface SectorController {
	public ModelAndView insertSector() throws Exception;
	public ModelAndView getSectorList() throws Exception;
	public ModelAndView  updateSector() throws Exception;


}
