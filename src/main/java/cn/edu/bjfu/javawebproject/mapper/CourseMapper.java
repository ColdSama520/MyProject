package cn.edu.bjfu.javawebproject.mapper;

import cn.edu.bjfu.javawebproject.pojo.Course;
import cn.edu.bjfu.javawebproject.pojo.Teacher;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseMapper {

    List<Course> selectTeacherAllCourse(String teacher_id);

    List<Course> selectAllCourse();

    List<Course> selectCourseMessage(String course_id);

    List<Course> selectCourseCommonMessage(String course_id, String teacher_id);

    List<Course> selectCourseCommon(String teacher_id);

    void updateCourseUnCommon(String course_id);
}
