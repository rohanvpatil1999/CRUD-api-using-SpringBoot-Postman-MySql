package com.hefshine.StudentData.ServiceImpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hefshine.StudentData.Repository.StudentRepository;
import com.hefshine.StudentData.Service.StudentService;
import com.hefshine.StudentData.model.Student;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository studentRepository;
	
	//to save Student details
	@Override
	public Student SaveStudent(Student student)
	{
		Student stud=studentRepository.save(student);
		return stud;
	}


	//to find all student details
	@Override
	public List<Student> findallStudent() {
		
		return  studentRepository.findAll();
	}


	//to update existing student details
	@Override
	public Student update(Student data) {
		
		return studentRepository.save(data);
	}

    // delete exsisting student details
	@Override
	public void deleteStudent(int id) {
	
		studentRepository.deleteById(id);
	}

    @Override
	public Student findStudentInfoByName(String name) {
		Student byName=studentRepository.findStudentByName(name);
		return byName;
	}

	@Override
	public Student findStudentById(int id) {
		Student byId=studentRepository.findById(id).get();
		return byId;
	}

    @Override
	public Student findStudentInfoByEmail(String email) {
		Student byMail=studentRepository.findStudentByEmail(email);
		return byMail;
	}


	

	

	
	
}
