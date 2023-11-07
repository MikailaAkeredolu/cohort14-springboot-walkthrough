package com.cohort14api.demo.of.students.info.controller;

import com.cohort14api.demo.of.students.info.model.Student;
import com.cohort14api.demo.of.students.info.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
//base url or path - http://localhost:8080"/students"
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService; // Poll Service

    @PostMapping("/students")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @GetMapping("/students")
    public Iterable<Student> getAll(){
        return studentService.getALlStudents();
    }







}
