package com.cg.classpertable;

import com.cg.entities.Placement;

public class abc {

}
@Override
public Placement addPlacement(Placement placement) {
		co.beginTransaction();
		co.addPlacement(placement);
		co.commitTransaction();
		return placement;
}

@Override
public Placement updatePlacement(Placement placement) {
	co.beginTransaction();
	co.updatePlacement(placement);
	co.commitTransaction();
	return placement;
}

@Override
public Placement searchPlacement(long id) {
	co.beginTransaction();
	Placement placement=co.searchPlacement(id);
	co.commitTransaction();
	return null;
}

@Override
public boolean cancelPlacement(long id) {
	co.cancelPlacement(id);
	return false;
}/*/