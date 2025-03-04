package me.dio.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.domain.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
