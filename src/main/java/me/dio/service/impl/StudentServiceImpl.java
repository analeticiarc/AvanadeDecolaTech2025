package me.dio.service.impl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import me.dio.domain.model.Student;
import me.dio.domain.repository.StudentRepository;
import me.dio.service.StudentService;

//não irá expor minha interface de uso: encapsulamento
@Service
public class StudentServiceImpl  implements StudentService{

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @Override
    public Student findById(Long id) {
        return studentRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Student create(Student studentToCreate) {
        if(studentToCreate.getId() != null && studentRepository.existsById(studentToCreate.getId())){
            throw new IllegalArgumentException("This Student Id already exists.");
        }
        return studentRepository.save(studentToCreate);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

}
