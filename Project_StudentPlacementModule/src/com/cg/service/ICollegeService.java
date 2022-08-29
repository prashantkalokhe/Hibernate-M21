package com.cg.service;

import com.cg.entities.College;
import com.cg.entities.Placement;

public interface ICollegeService {

	void addCollege(College college);
	void updateCollege(College college);
	void searchCollege(long id);
	void deleteCollege(long id);
	void schedulePlacement(Placement placement);
}
