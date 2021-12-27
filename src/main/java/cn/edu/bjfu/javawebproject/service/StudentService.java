package cn.edu.bjfu.javawebproject.service;


import cn.edu.bjfu.javawebproject.mapper.StudentMapper;
import cn.edu.bjfu.javawebproject.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentMapper studentMapper;

    public List<Student> selectCourseStudent(String course_id) {
        return studentMapper.selectCourseStudent(course_id);
    }

    public void addStudent(Student student) {
        studentMapper.addStudent(student);
    }

}
