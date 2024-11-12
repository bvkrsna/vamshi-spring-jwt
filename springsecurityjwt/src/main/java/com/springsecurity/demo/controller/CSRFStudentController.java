package com.springsecurity.demo.controller;

import com.springsecurity.demo.dto.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CSRFStudentController {

    private List<Student> students = new ArrayList<>(List.of(
            new Student(1, "Vamshi", 60),
            new Student(2, "Krushna", 80)
    ));

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }

    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @PostMapping("/students")
    public Student addStudents(@RequestBody Student student) {
        students.add(student);
        return student;
    }
}
