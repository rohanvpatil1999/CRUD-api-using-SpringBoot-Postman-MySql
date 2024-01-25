package com.hefshine.StudentData.Service;

import java.util.List;


import com.hefshine.StudentData.model.Student;

public interface StudentService {
	
	public Student SaveStudent(Student student) ;
	
	public List<Student> findallStudent();
	
	public Student update(Student data);
	
	public void deleteStudent(int id);
	
	public Student findStudentById(int id);
	
	public Student findStudentInfoByName(String name);
	
	public Student findStudentInfoByEmail(String email);

}
