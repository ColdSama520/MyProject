package cn.edu.bjfu.javawebproject.mapper;



import cn.edu.bjfu.javawebproject.pojo.Group;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupMapper {

    void addGroup(Group group);

    void deleteGroup(String project_id);

}
