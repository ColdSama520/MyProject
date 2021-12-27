package cn.edu.bjfu.javawebproject.mapper;



import cn.edu.bjfu.javawebproject.pojo.SC;
import org.springframework.stereotype.Repository;

@Repository
public interface SCMapper {

    void addSC(SC sc);

    void deleteSCStudent(String course_id, String student_id);

}
