package com.springBoot.crudOperations.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.crudOperations.entity.Student;
import com.springBoot.crudOperations.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentService service;

	@PostMapping("/save")
	public Student saveStudent(@RequestBody Student student) {
		return service.saveStudentData(student);

	}

	@PostMapping("/saveAll")
	public List<Student> saveAllStudent(@RequestBody List<Student> students) {
		return service.saveAllStudentData(students);

	}

	@GetMapping("/studentId/{id}")
	public Student findStudentByID(@PathVariable int id) {

		return service.findByStudentId(id);
	}

	@GetMapping("/findAll")
	public List<Student> findAllStudentByID() {
		return service.findAllStudentData();
	}

	@PostMapping("/update")
	public Student studentUpdate(@RequestBody Student student) {
		return service.updateStudentData(student);

	}

	@DeleteMapping("delete/{id}")
	public String deleteStudent(@PathVariable int id) {

		return service.deleteStudentById(id);

	}

}
