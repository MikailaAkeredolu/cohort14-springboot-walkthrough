package com.cohort14api.demo.of.students.info.repository;

import com.cohort14api.demo.of.students.info.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
//Java Persistent API - JDBC
@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

    //write queires in english
    Iterable<Student> findByfirstNameIsContaining(String firstName); // SQL query

}
