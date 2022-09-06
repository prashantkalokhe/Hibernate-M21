package com.cg.client;

import java.time.LocalDate;

import com.cg.entities.Placement;
import com.cg.service.IPlacementService;
import com.cg.service.PlacementServiceImpl;

public class client 
{

	public static void main(String[] args) {
		
		{
			//Providing input for Student table

			Placement std=new Placement();
			IPlacementService service = new PlacementServiceImpl();
			
			// creating DB
			
			std.setId(23);
			std.setName("Prashant");
			
			//Object jspm;
			//std.setcollege(jspm);
			
			LocalDate d=LocalDate.now();
			std.setDate(d);
			std.setQualification("BE");
			std.setYear(2022);
			
			service.addPlacement(std);
			
			//Retrieve
			/*std =service.searchPlacementByID(1);
			System.out.println("ID is " +std.getID());
			System.out.println("NAME is "+std.getNAME());
			System.out.println("COLLEGE is "+std.getCOLLEGE());*/
					
			//Update
			/*std = service.searchPlacementByID(1);
			std.setROLLNO(55);
			service.updatePlacement(std);*/
			
			
			//Delete
			/*std= service.searchPlacementByID(1);
			service.deletePlacement(std);*/
		}

}
}
		