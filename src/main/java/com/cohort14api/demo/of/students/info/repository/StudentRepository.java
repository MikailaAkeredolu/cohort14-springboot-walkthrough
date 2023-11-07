package com.cohort14api.demo.of.students.info.repository;

import com.cohort14api.demo.of.students.info.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {


}
