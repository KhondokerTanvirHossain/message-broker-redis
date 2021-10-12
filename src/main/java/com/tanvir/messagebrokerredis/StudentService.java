package com.tanvir.messagebrokerredis;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student addOneStudent() {
        return studentRepository.save(new Student( "Eng2015001", "John Doe", Student.Gender.MALE, 1));
    }

    public Student getStudentOne() {
        return studentRepository.findById("Eng2015001").get();
    }

    public void deleteStudentOne() {
        studentRepository.deleteById("Eng2015001");
    }
}
