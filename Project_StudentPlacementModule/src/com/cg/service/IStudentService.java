package com.cg.service;

import com.cg.entities.Certificate;
import com.cg.entities.Student;

public interface IStudentService {

	public void addStudent(Student student);
	public void updateStudent(Student student);
	public void searchStudentById(int id);
	public void searchStudentByHallTicket(int ticketNo);
	public void addCertificate(Certificate certificate);
	public void updateCertificate(Certificate certificate);
	public void deleteStudent(int id);
}
