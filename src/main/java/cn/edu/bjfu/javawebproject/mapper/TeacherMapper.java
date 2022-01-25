package cn.edu.bjfu.javawebproject.mapper;

import cn.edu.bjfu.javawebproject.pojo.Course;
import cn.edu.bjfu.javawebproject.pojo.Teacher;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherMapper {

    List<Teacher> selectTeacher(String teacher_id);

    List<Teacher> selectTeacherAll();

    void addTeacher(Teacher teacher);

    List<Course> selectTeacherAllCourse(String teacher_id);

    void updateTeacher(Teacher teacher);
}
