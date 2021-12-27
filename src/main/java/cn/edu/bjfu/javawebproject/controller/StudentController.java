package cn.edu.bjfu.javawebproject.controller;


import cn.edu.bjfu.javawebproject.pojo.Student;
import cn.edu.bjfu.javawebproject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/Student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/CourseAllStudent")
    public List<Student> selectCourseStudent(String course_id) {
        return studentService.selectCourseStudent(course_id);
    }

    @GetMapping("/add")
    public void addStudent(Student student) {
        studentService.addStudent(student);
    }

}
