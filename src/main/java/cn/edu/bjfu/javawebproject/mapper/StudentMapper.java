package cn.edu.bjfu.javawebproject.mapper;


import cn.edu.bjfu.javawebproject.pojo.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentMapper {

    List<Student> selectCourseStudent(String course_id);

    List<Student> selectCourseStudentById(String course_id, String student_id);

    void addStudent(Student student);

    void updateStudent(Student student);

}
