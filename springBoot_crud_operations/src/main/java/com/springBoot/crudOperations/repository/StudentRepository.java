package com.springBoot.crudOperations.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBoot.crudOperations.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
