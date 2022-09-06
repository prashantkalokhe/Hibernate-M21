package com.cg.service;

import com.cg.Repository.IPlacementRepository;
import com.cg.Repository.PlacementRepositoryImpl;
import com.cg.entities.Placement;

public class PlacementServiceImpl implements IPlacementService {
							
	//1 : Establishing connection between Service and Repository
	
	private IPlacementRepository dao;
	
	public PlacementServiceImpl() {
		
		dao=new PlacementRepositoryImpl();
	}


    //2  Service calls to perform CRUD Operations
	@Override
	public Placement addPlacement(Placement placement)
	{
		dao.beginTransaction();
		dao.addPlacement(placement);
		dao.commitTransaction();
		return placement;
	}

	@Override
	public Placement updatePlacement(Placement placement)
	{
		dao.beginTransaction();
		dao.updatePlacement(placement);
		dao.commitTransaction();
		return placement;
	}
	

	@Override
	public boolean cancelPlacement(long id) 	
	{ 
		dao.beginTransaction();
		boolean abc=dao.cancelPlacement(id);
		dao.commitTransaction();
		return abc;
	
}

	@Override
	public Placement searchPlacement(long id) {
		
			dao.beginTransaction();
			Placement placement=dao.searchPlacement(id);
			dao.commitTransaction();
			return placement;
		}
	}
