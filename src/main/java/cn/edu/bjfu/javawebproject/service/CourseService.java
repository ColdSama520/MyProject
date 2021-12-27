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

    public List<Course> selectHasCourse(String course_id) {
        return courseMapper.selectHasCourse(course_id);
    }

    public List<Course> selectCourseCommonMessage(String course_id, String teacher_id) {
        return courseMapper.selectCourseCommonMessage(course_id, teacher_id);
    }

    public List<Course> selectCourseUnCommonMessage(String course_id, String teacher_id) {
        return courseMapper.selectCourseUnCommonMessage(course_id, teacher_id);
    }

    public List<Course> selectCourseMessage(String course_id) {
        return courseMapper.selectCourseMessage(course_id);
    }

    public List<Course> selectCourseCommon(String teacher_id) {
        return courseMapper.selectCourseCommon(teacher_id);
    }

    public List<Course> selectCourseUnCommon(String teacher_id) {
        return courseMapper.selectCourseUnCommon(teacher_id);
    }

    public void updateCourseUnCommon(String course_id) {
        courseMapper.updateCourseUnCommon(course_id);
    }

    public void updateCourseCommon(String course_id) {
        courseMapper.updateCourseCommon(course_id);
    }

    public void addCourseCommon(String course_id, String course_name, String course_start_year, String course_is_archive, String teacher_id) {
        courseMapper.addCourseCommon(course_id, course_name, course_start_year, course_is_archive, teacher_id);
    }
}
