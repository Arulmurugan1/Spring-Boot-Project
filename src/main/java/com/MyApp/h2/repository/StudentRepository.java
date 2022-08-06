package com.MyApp.h2.repository;

import org.springframework.data.repository.CrudRepository;

import com.MyApp.h2.modal.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
