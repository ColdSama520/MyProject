package cn.edu.bjfu.javawebproject.controller;


import cn.edu.bjfu.javawebproject.pojo.Group;
import cn.edu.bjfu.javawebproject.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/Group")
public class GroupController {

    @Autowired
    GroupService groupService;

    @GetMapping("CourseAllGroup")
    public List<Group> selectCourseGroup(String course_id) {
        return groupService.selectCourseGroup(course_id);
    }

    @GetMapping("/GroupCourseProjectById")
    public List<Group> GroupCourseProjectById(String course_id, String student_id) {
        return groupService.GroupCourseProjectById(course_id, student_id);
    }

    @GetMapping("/CourseGroupAllNo")
    public List<Group> selectCourseGroupAll() {
        return groupService.selectCourseGroupAll();
    }

    @GetMapping("/CourseGroupSearch")
    public List<Group> selectCourseGroupSearch(String group_id) {
        return groupService.selectCourseGroupSearch(group_id);
    }

    @GetMapping("/IsGroupHeader")
    public String IsGroupHeader(String group_id) {
        return groupService.IsGroupHeader(group_id);
    }

    @GetMapping("/updateGroup")
    public void updateGroup(String group_id, String student_id) {
        groupService.updateGroup(group_id, student_id);
    }

    @GetMapping("/updateGroupProject")
    public void updateGroupProject(String project_id, String student_id) {
        groupService.updateGroupProject(project_id, student_id);
    }

    @GetMapping("/addGroup")
    public void addGroup(Group group) {
        groupService.addGroup(group);
    }

    @GetMapping("/addGroupAll")
    public void addGroupAll(Group group) {
        groupService.addGroupAll(group);
    }

    @GetMapping("/deleteGroup")
    public void deleteGroup(String project_id) {
        groupService.deleteGroup(project_id);
    }

    @GetMapping("/deleteGroupByGroupId")
    public void deleteGroupByGroupId(String group_id) {
        groupService.deleteGroupByGroupId(group_id);
    }

}
