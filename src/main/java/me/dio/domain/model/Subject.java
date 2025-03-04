package me.dio.domain.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String professor;
    private String shift;
    private List<Float> grades;
    private Float attendance;

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }
    
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getProfessor(){
        return professor;
    }

    public void setProfessor(String professor){
        this.professor = professor;
    }

    public String getShift(){
        return shift;
    }

    public void setShift(String shift){
        this.shift = shift;
    }

    public List<Float> getGrades(){
        return grades;
    }

    public void setGrades(List<Float> grades){
        this.grades = grades;
    }

    public Float getAttendance(){
        return attendance;
    }

    public void setAttendance(Float attendance){
        this.attendance = attendance;
    }

}
