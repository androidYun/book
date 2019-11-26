package com.ziming.book.service.impl;

import com.gitee.fastmybatis.core.query.Query;
import com.ziming.book.entity.Student;
import com.ziming.book.mapper.StudentMapper;
import com.ziming.book.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;

    @Override
    public Student selectStudentById(String sno) {
        return studentMapper.getByColumn("sno", sno);
    }

    @Override
    public List<Student> selectStudentList() {
        return studentMapper.list(new Query());
    }

    @Override
    public int insertStudent(Student student) {
        return studentMapper.save(student);
    }

    @Override
    public int deleteStudent(String sno) {
        return studentMapper.deleteById(sno);
    }

    @Override
    public int updateStudent(Student student) {
        return studentMapper.update(student);
    }
}
