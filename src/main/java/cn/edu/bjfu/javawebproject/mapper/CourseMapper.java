package cn.edu.bjfu.javawebproject.mapper;

import cn.edu.bjfu.javawebproject.pojo.Course;
import cn.edu.bjfu.javawebproject.pojo.Teacher;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseMapper {

    List<Course> selectTeacherAllCourse(String teacher_id);
}
