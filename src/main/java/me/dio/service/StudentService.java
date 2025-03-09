package me.dio.service;

import me.dio.domain.model.Student;

import java.util.List;

public interface StudentService {

    Student findById(Long id);

    Student create(Student studentToCreate);
    List<Student> getAllStudents();
}
