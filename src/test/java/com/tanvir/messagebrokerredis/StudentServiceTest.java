package com.tanvir.messagebrokerredis;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StudentServiceTest {

    @Autowired
    private StudentService studentService;

    @Test
    void redisTest() {
        studentService.addOneStudent();
        Student student = studentService.getStudentOne();
        studentService.deleteStudentOne();

        Assertions.assertThat(student).isEqualTo(new Student( "Eng2015001", "John Doe", Student.Gender.MALE, 1));
    }
}
