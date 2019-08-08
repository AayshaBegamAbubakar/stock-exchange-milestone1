package com.example.stockspring.model;

public class Sector {
	private int sectorID;
	private String sectorName;
	private String sectorBrief;
	public int getSectorID() {
		return sectorID;
	}
	public void setSectorID(int sectorID) {
		this.sectorID = sectorID;
	}
	public String getSectorName() {
		return sectorName;
	}
	public void setSectorName(String sectorName) {
		this.sectorName = sectorName;
	}
	public String getSectorBrief() {
		return sectorBrief;
	}
	public void setSectorBrief(String sectorBrief) {
		this.sectorBrief = sectorBrief;
	}
	@Override
	public String toString() {
		return "Sector [sectorID=" + sectorID + ", sectorName=" + sectorName + ", sectorBrief=" + sectorBrief + "]";
	}
	

}
