package cn.edu.bjfu.javawebproject.controller;


import cn.edu.bjfu.javawebproject.pojo.Course;
import cn.edu.bjfu.javawebproject.pojo.Teacher;
import cn.edu.bjfu.javawebproject.service.CourseService;
import cn.edu.bjfu.javawebproject.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/Course")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("/teacherCourse")
    public List<Course> selectTeacherAllCourse(String teacher_id) {
        return courseService.selectTeacherAllCourse(teacher_id);
    }

    @GetMapping("/all")
    public List<Course> selectAllCourse() {
        return courseService.selectAllCourse();
    }

    @GetMapping("/CourseMessage")
    public List<Course> selectCourseMessage(String course_id) {
        return courseService.selectCourseMessage(course_id);
    }
}
