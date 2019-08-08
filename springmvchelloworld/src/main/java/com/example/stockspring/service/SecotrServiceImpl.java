package com.example.stockspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stockspring.dao.SectorDao;
import com.example.stockspring.model.Sector;
@Service
public class SecotrServiceImpl implements SectorService {


	@Autowired
	private SectorDao sectorDao;
	@Override
	public int insertSector() throws Exception {
		// TODO Auto-generated method stub
		return sectorDao.insertSector();
	}

	@Override
	public List<Sector> getSectorList() throws Exception {
		// TODO Auto-generated method stub
		return sectorDao.getSectorList();
	}

	@Override
	public int updateSector() throws Exception {
		// TODO Auto-generated method stub
		return sectorDao.updateSector();
	}

}
