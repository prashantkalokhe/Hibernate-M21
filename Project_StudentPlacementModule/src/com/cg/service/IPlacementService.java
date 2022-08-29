package com.cg.service;

import com.cg.entities.Placement;

public interface IPlacementService {
	
     	void addPlacement(Placement placement) ;	
		void updatePlacement(Placement placement) ;
		void searchPlacement(long id);
		void cancelPlacement(long id);

}
