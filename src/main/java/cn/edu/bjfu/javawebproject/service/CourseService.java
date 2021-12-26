package cn.edu.bjfu.javawebproject.service;

import cn.edu.bjfu.javawebproject.mapper.CourseMapper;
import cn.edu.bjfu.javawebproject.mapper.TeacherMapper;
import cn.edu.bjfu.javawebproject.pojo.Course;
import cn.edu.bjfu.javawebproject.pojo.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseMapper courseMapper;

    public List<Course> selectTeacherAllCourse(String teacher_id) {
        return courseMapper.selectTeacherAllCourse(teacher_id);
    }

    public List<Course> selectAllCourse() {
        return courseMapper.selectAllCourse();
    }

    public List<Course> selectCourseCommonMessage(String course_id, String teacher_id) {
        return courseMapper.selectCourseCommonMessage(course_id, teacher_id);
    }

    public List<Course> selectCourseMessage(String course_id) {
        return courseMapper.selectCourseMessage(course_id);
    }

    public List<Course> selectCourseCommon(String teacher_id) {
        return courseMapper.selectCourseCommon(teacher_id);
    }

    public void updateCourseUnCommon(String course_id) {
        courseMapper.updateCourseUnCommon(course_id);
    }
}
