package com.example.stockspring.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.stockspring.model.Company;

@Repository
public class CompanyDaoImpl implements CompanyDao {
	

	

	public List<Company> getCompanyList() throws SQLException {
		
		List<Company> companyList = new ArrayList<Company>();
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/stock_db", "root", "root");
			PreparedStatement ps = connection.prepareStatement("select * from company");
			ResultSet resultset = ps.executeQuery();
			Company company = null;
			while (resultset.next()) {
				company = new Company();
				int companyId = resultset.getInt("company_code");
				company.setCompanyId(companyId);
				company.setCompanyName(resultset.getString("company_name"));
				company.setTurnOver(resultset.getFloat("company_turnover"));
				company.setCompanyCEO(resultset.getString("company_ceo"));
				company.setBoardOfDirectors(resultset.getString("board_of_directors"));
				company.setCompanyBrief(resultset.getString("company_brief"));
				companyList.add(company);
			}
		} catch (SQLException e) {
			
			System.out.println(e.getMessage());
			throw e;
		}
		return companyList;

	}

}
