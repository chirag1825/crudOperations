package com.springBoot.crudOperations.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBoot.crudOperations.entity.Student;
import com.springBoot.crudOperations.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repository;

	public Student saveStudentData(Student student) {
		return repository.save(student);

	}

	public List<Student> saveAllStudentData(List<Student> students) {
		return repository.saveAll(students);

	}

	public List<Student> findAllStudentData() {
		return repository.findAll();

	}

	public Student findByStudentId(int id) {
		return repository.findById(id).orElse(null);
	}

	public String deleteStudentById(int id) {
		repository.deleteById(id);
		return "Student data has been removed succesfully " + id;

	}

	public Student updateStudentData(Student student) {
		Student existingStudent = repository.findById(student.getId()).orElse(null);
		existingStudent.setsName(student.getsName());
		existingStudent.setfName(student.getfName());
		existingStudent.setlName(student.getlName());
		existingStudent.setStd(student.getStd());
		existingStudent.setDiv(student.getDiv());
		return repository.save(existingStudent);

	}

}
