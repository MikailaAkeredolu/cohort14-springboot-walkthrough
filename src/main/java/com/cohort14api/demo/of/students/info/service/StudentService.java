package com.cohort14api.demo.of.students.info.service;

import com.cohort14api.demo.of.students.info.model.Student;
import com.cohort14api.demo.of.students.info.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//business logic
@Service
public class StudentService {

    //a wa y to add a student to the database
    @Autowired
    private StudentRepository studentRepository;

    public void addStudent(Student student){
        studentRepository.save(student);
    }

    public Iterable<Student> getALlStudents(){
        return studentRepository.findAll();
    }

}
