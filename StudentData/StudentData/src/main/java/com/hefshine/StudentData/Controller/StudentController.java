package com.hefshine.StudentData.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hefshine.StudentData.Service.StudentService;
import com.hefshine.StudentData.model.Student;

@RestController
public class StudentController {
	
	 @Autowired
	 StudentService studentservice;
	
	 
	 //Add student data
	@PostMapping("studentsavedata")
	public Student saveStud(@RequestBody Student student) 
	{
		Student saveData=studentservice.SaveStudent(student);
	    return 	saveData;
	}
	
	//ShowAll student data
	@GetMapping("studentsalllist")
	public List<Student> showall()
	{
		List<Student> show=studentservice.findallStudent();
		return show;
		
	}
	
	//update existing data
	@PutMapping("studentupdatedata")
	                          //request body is must
	public Student updatedata(@RequestBody Student data)
	{
		Student update=studentservice.update(data);
		return update;
	}
	
	//delete data with id
	@GetMapping("Studentbyid/{id}")
	public void deletestudentInfo(@PathVariable("id") Integer id)
	{
	    studentservice.deleteStudent(id);	
	}
	
	//find by id
	@GetMapping("getstudentbyid/{id}")
	public Student findbyid(@PathVariable("id")Integer id)
	{
		Student studentById=studentservice.findStudentById(id);
		return studentById;
	}
	
	//find by name
	@GetMapping("getstudentbyname/{name}")
	public Student findbyname(@PathVariable("name")String name)
	{
		Student studentByName=studentservice.findStudentInfoByName(name);
		return studentByName;
	}
	//find by email
	@GetMapping("getstudentbyemail/{email}")
	public Student findbyemail(@PathVariable("email")String email)
	{
		Student studentByMail=studentservice.findStudentInfoByEmail(email);
		return studentByMail;
	}

}
