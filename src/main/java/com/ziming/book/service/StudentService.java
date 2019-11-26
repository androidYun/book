package com.ziming.book.service;

import com.ziming.book.entity.Student;

import java.util.List;

public interface StudentService {
    Student selectStudentById(String sno);

    List<Student> selectStudentList();

    int insertStudent(Student student);

    int deleteStudent(String sno);

    int updateStudent(Student student);


}
