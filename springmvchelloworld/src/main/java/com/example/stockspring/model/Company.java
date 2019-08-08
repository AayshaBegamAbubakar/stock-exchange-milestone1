package com.example.stockspring.model;

public class Company {

	private int companyId; 
	public String companyName;
	private float turnOver;
	private String companyCEO;
	private String boardOfDirectors;
    private int sectorId;
	private String companyBrief;
	private int stockCode;
	
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public float getTurnOver() {
		return turnOver;
	}
	public void setTurnOver(float turnOver) {
		this.turnOver = turnOver;
	}
	public String getCompanyCEO() {
		return companyCEO;
	}
	public void setCompanyCEO(String companyCEO) {
		this.companyCEO = companyCEO;
	}
	public String getBoardOfDirectors() {
		return boardOfDirectors;
	}
	public void setBoardOfDirectors(String boardOfDirectors) {
		this.boardOfDirectors = boardOfDirectors;
	}
	public int getSectorId() {
		return sectorId;
	}
	public void setSectorId(int sectorId) {
		this.sectorId = sectorId;
	}
	public String getCompanyBrief() {
		return companyBrief;
	}
	public void setCompanyBrief(String companyBrief) {
		this.companyBrief = companyBrief;
	}
	public int getStockCode() {
		return stockCode;
	}
	public void setStockCode(int stockCode) {
		this.stockCode = stockCode;
	}
	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", turnOver=" + turnOver
				+ ", companyCEO=" + companyCEO + ", boardOfDirectors=" + boardOfDirectors + ", sectorId=" + sectorId
				+ ", companyBrief=" + companyBrief + ", stockCode=" + stockCode + "]";
	}
	
	
	
	
}
