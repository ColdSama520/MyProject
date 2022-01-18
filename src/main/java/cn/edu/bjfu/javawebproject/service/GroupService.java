package cn.edu.bjfu.javawebproject.service;



import cn.edu.bjfu.javawebproject.mapper.GroupMapper;
import cn.edu.bjfu.javawebproject.pojo.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService {

    @Autowired
    GroupMapper groupMapper;

    public List<Group> selectCourseGroup(String course_id) {
        return groupMapper.selectCourseGroup(course_id);
    }

    public List<Group> GroupCourseProjectById(String course_id, String student_id) {
        return groupMapper.GroupCourseProjectById(course_id, student_id);
    }

    public List<Group> selectCourseGroupAll() {
        return groupMapper.selectCourseGroupAll();
    }

    public List<Group> selectCourseGroupSearch(String group_id) {
        return groupMapper.selectCourseGroupSearch(group_id);
    }

    public void updateGroup(String group_id, String student_id) {
        groupMapper.updateGroup(group_id, student_id);
    }

    public void updateGroupProject(String project_id, String student_id) {
        groupMapper.updateGroupProject(project_id, student_id);
    }

    public void addGroup(Group group) {
        groupMapper.addGroup(group);
    }

    public void addGroupAll(Group group) {
        groupMapper.addGroupAll(group);
    }

    public void deleteGroup(String project_id) {
        groupMapper.deleteGroup(project_id);
    }

    public void deleteGroupByGroupId(String group_id) {
        groupMapper.deleteGroupByGroupId(group_id);
    }

}
