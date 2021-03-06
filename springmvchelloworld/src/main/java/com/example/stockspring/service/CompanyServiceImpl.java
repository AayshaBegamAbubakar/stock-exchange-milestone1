package com.example.stockspring.service;

import java.sql.SQLException;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.stockspring.dao.CompanyDao;

import com.example.stockspring.model.Company;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyDao companyDao;

	@Override
	public List<Company> getCompanyList() throws SQLException {
		System.out.println("service interface");
		return companyDao.getCompanyList();
	}

}
