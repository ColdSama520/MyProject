package cn.edu.bjfu.javawebproject.mapper;

import cn.edu.bjfu.javawebproject.pojo.Teacher;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherMapper {
    void addTeacher(Teacher teacher);
}
