package com.cg.service;

import com.cg.entities.Placement;

public interface IPlacementService {
	    
	   public Placement addPlacement(Placement placement) ;
	   public Placement updatePlacement(Placement placement);
	   public Placement searchPlacement(long Id);
	   public boolean cancelPlacement(long id);

}
