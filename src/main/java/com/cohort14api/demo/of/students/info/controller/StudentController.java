package com.cohort14api.demo.of.students.info.controller;

import com.cohort14api.demo.of.students.info.model.Student;
import com.cohort14api.demo.of.students.info.repository.StudentRepository;
import com.cohort14api.demo.of.students.info.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

//base url or path - http://localhost:8080"/students"
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService; // Poll Service

    //dependencies
    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/students")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

//    @GetMapping("/students")
//    public Iterable<Student> getAll(){
//        return studentService.getALlStudents();
//    }


    @GetMapping("/students")
    public Iterable<Student> getAll(@RequestParam(value = "name", required = false) String name){

        if(name != null){
            return studentRepository.findByfirstNameIsContaining(name);
        }

        return studentService.getALlStudents();
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudentInfo(@PathVariable Long id){
        studentService.deleteStudentById(id);
    }

    @GetMapping("/students/{id}")
    public Optional<Student> getAStudent(@PathVariable Long id){
        return studentService.getStudentById(id);
    }

    //edit a student's information
    @PutMapping("/students/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student){
        return studentService.editStudent(id, student);
    }







}
