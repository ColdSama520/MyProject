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
}
