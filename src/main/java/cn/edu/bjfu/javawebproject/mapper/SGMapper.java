package cn.edu.bjfu.javawebproject.mapper;



import cn.edu.bjfu.javawebproject.pojo.SC;
import cn.edu.bjfu.javawebproject.pojo.SG;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SGMapper {

    List<SG> selectGroupMemberByGroupId(String group_id);

    void deleteSGByGroupId(String group_id);

    String HasGroupByStudentId(String student_id);

    SG HasGroupNumber(String group_id);

    void GroupAddNewStudent(String student_id, String group_id);

    void deleteSGStudentByID(String student_id, String group_id);

}
