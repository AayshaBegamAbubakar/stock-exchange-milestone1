package com.example.stockspring.service;

import java.util.List;

import com.example.stockspring.model.Sector;

public interface SectorService {
	public int insertSector() throws Exception;
	public List<Sector> getSectorList() throws Exception;
	public int updateSector() throws Exception;

}
