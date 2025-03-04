package me.dio.domain.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String registration;

    //usamos o Lazy quando os dados nem sempre são necessários, evitando consultas desnecessárias
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id")
    private List<Subject> subjects;

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
    
    public String getRegistration(){
        return registration;
    }

    public void setRegistration(String registration){
        this.registration = registration;
    }

    public List<Subject> getSubjects(){
        return subjects;
    }

    public void setSubjects(List<Subject> subjects){
        this.subjects = subjects;
    }
    

}
