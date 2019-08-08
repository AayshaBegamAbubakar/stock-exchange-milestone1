package com.example.stockspring.service;

import java.sql.SQLException;
import java.util.List;

import com.example.stockspring.model.Company;

public interface CompanyService {

	
	  
		public List<Company> getCompanyList() throws SQLException;

}
