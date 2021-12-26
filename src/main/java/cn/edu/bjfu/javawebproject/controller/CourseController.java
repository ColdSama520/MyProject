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

    @GetMapping("/CourseCommonMessage")
    public List<Course> selectCourseCommonMessage(String course_id, String teacher_id) {
        return courseService.selectCourseCommonMessage(course_id, teacher_id);
    }

    @GetMapping("/CourseUnCommonMessage")
    public List<Course> selectCourseUnCommonMessage(String course_id, String teacher_id) {
        return courseService.selectCourseUnCommonMessage(course_id, teacher_id);
    }

    @GetMapping("/CourseCommon")
    public List<Course> selectCourseCommon(String teacher_id) {
        return courseService.selectCourseCommon(teacher_id);
    }

    @GetMapping("/CourseUnCommon")
    public List<Course> selectCourseUnCommon(String teacher_id) {
        return courseService.selectCourseUnCommon(teacher_id);
    }

    @GetMapping("/updateUnCommon")
    public int updateCourseUnCommon(String course_id) {
        if(course_id.equals(""))
            return 400;
        courseService.updateCourseUnCommon(course_id);
        return 200;
    }

    @GetMapping("/updateCommon")
    public int updateCourseCommon(String course_id) {
        if(course_id.equals(""))
            return 400;
        courseService.updateCourseCommon(course_id);
        return 200;
    }

}
