package com.Student.REST.API;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;
    private Student updatedStudent;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // CREATE
    public Student addStudent(Student student){
        return studentRepository.save(student);
    }

    // READ-ALL
    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }

    public Student updateStudent(Long id, Student student){
        Student serviceStudent = studentRepository.findById(id).orElse(null);
//        Student updatedStudent = null;
        if (serviceStudent != null){
            serviceStudent.setName(updatedStudent.getName());
            serviceStudent.setAge(updatedStudent.getAge());
            serviceStudent.setCourse(updatedStudent.getCourse());
            return studentRepository.save(serviceStudent);
        }
        return null;
    }

    public void deleteStudent(Long id){
        studentRepository.deleteById(id);
    }

    public Optional<Student> getStudentByID(Long id){
        return studentRepository.findById(id);
    }

}
