package com.hefshine.StudentData.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.hefshine.StudentData.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>
{

	public Student findStudentByName(String name);
	
	public Student findStudentByEmail(String email);

}
