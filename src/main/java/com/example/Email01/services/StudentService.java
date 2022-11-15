package com.example.Email01.services;

import com.example.Email01.entities.Student;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    static List<Student> students = Arrays.asList(
            new Student("1", "Mario", "Cotumaccio", "mariocotumaccio1@gmail.com"),
            new Student("2", "Mirko", "Di Cristina", "supermirkoplus8000@gmail.com"),
            new Student("3", "Fenna", "Mercalli", "2kkgarenspin@gmail.com"),
            new Student("4", "Antonio", "Primol", "borsettadigucci@gmail.com")
    );

    public Student getStudentById(String studentId) {
        Optional<Student> studentFromDB = students.stream().filter(student -> student.getId().equals(studentId)).findAny();
        if (studentFromDB.isPresent()) return studentFromDB.get();
        return null;
    }
}
