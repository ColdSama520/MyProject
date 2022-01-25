package cn.edu.bjfu.javawebproject.service;

import cn.edu.bjfu.javawebproject.mapper.TeacherMapper;
import cn.edu.bjfu.javawebproject.pojo.Course;
import cn.edu.bjfu.javawebproject.pojo.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    TeacherMapper teacherMapper;

    public List<Teacher> selectTeacher(String teacher_id) {
        return teacherMapper.selectTeacher(teacher_id);
    }

    public List<Teacher> selectTeacherAll() {
        return teacherMapper.selectTeacherAll();
    }

    public void addTeacher(Teacher teacher) {
        teacherMapper.addTeacher(teacher);
    }

    public List<Course> selectTeacherAllCourse(String teacher_id) {
        return teacherMapper.selectTeacherAllCourse(teacher_id);
    }

    public void updateTeacher(Teacher teacher) {
        teacherMapper.updateTeacher(teacher);
    }
}
