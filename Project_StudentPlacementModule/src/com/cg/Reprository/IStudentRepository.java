package com.cg.Reprository;

import com.cg.entities.Student;

public interface IStudentRepository {
	public Student addStudent(Student student);
	public Student updateStudent(Student student);
	public Student searchStudentById(int id);
	public Student searchStudentByHallTicket(int hallTicketNo);
	public boolean deleteStudent(int id);

	public abstract void beginTransaction();
	public abstract void commitTransaction();


}
