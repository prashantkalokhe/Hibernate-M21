package com.cg.Repository;

import com.cg.entities.Placement;

public interface IPlacementRepository  {

	public Placement addPlacement( Placement placement);//Placement
	public Placement updatePlacement( Placement placement) ;//Placement
	public Placement searchPlacement(long id);//Placement
	public boolean cancelPlacement(long id);
	
	public abstract void beginTransaction();
	public abstract void commitTransaction();
}
