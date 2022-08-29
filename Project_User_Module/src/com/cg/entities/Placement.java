package com.cg.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="Placement")
public class Placement implements Serializable 


{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id ;// long
	private String name;// String
	//private College college;//College
	private LocalDate date ;// LocalDate
	private String qualification ; //String
	private int year;//int*/
	
	//Using Many-To-One Mapping for connecting placement and college table
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="college_id")
	//private College college;

	
	//getters and setters
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/*public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	*/
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

}

