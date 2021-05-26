package com.sw.project.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("students")
public class StudentController {

    @GetMapping
    public List<Student> getAllStudents(){
        return List.of(
                new Student(UUID.randomUUID(),
                        "Sharon",
                        "Watkins",
                        "sedx@me.com",
                        Student.Gender.FEMALE
                ),
                new Student(UUID.randomUUID(),
                        "Michael",
                        "Watkins",
                        "quazzy@me.com",
                        Student.Gender.MALE
                )
        );
    }
}
