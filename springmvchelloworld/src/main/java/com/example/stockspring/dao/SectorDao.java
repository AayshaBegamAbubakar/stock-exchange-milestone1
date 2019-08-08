package com.example.stockspring.dao;



import java.util.List;

import com.example.stockspring.model.Sector;

public interface SectorDao {
	public int insertSector() throws Exception;
	public List<Sector> getSectorList() throws Exception;
	public int updateSector() throws Exception;
}
