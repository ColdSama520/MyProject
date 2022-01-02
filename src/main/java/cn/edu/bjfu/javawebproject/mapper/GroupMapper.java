package cn.edu.bjfu.javawebproject.mapper;



import cn.edu.bjfu.javawebproject.pojo.Group;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GroupMapper {

    List<Group> selectCourseGroup(String course_id);

    List<Group> GroupCourseProjectById(String course_id, String student_id);

    List<Group> selectCourseGroupAll();

    List<Group> selectCourseGroupSearch(String group_id);

    void updateGroup(String group_id, String student_id);

    void addGroup(Group group);

    void addGroupAll(Group group);

    void deleteGroup(String project_id);

    void deleteGroupByGroupId(String group_id);

}
