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

    public List<Student> selectCourseStudentById(String course_id, String student_id) {
        return studentMapper.selectCourseStudentById(course_id, student_id);
    }

    public List<Student> selectStudentMessageById(String student_id) {
        return studentMapper.selectStudentMessageById(student_id);
    }

    public void addStudent(Student student) {
        studentMapper.addStudent(student);
    }

    public void addStudentByExcel(Student student) {
        studentMapper.addStudentByExcel(student);
    }

    public void updateStudent(Student student) {
        studentMapper.updateStudent(student);
    }

    public void updateStudentName(Student student){
        studentMapper.updateStudentName(student);
    }

}
