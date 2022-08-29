package com.cg.Reprository;

import javax.persistence.EntityManager;

import com.cg.entities.Certificate;
import com.cg.entities.Student;

public class IStudentreprositoryImpl implements IStudentreprository{
private EntityManager em;
	@Override
	public void addStudent(Student student) {
		super();
		em.persist(getClass());
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchStudentById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchStudentByHallTicket(int ticketNo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addCertificate(Certificate certificate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCertificate(Certificate certificate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void commitTransaction() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beginTransaction() {
		// TODO Auto-generated method stub
		
	}

}
