package cn.edu.bjfu.javawebproject.service;

import cn.edu.bjfu.javawebproject.mapper.TeacherMapper;
import cn.edu.bjfu.javawebproject.pojo.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    @Autowired
    TeacherMapper teacherMapper;
    public void addTeacher(Teacher teacher) {
        teacherMapper.addTeacher(teacher);
    }
}
