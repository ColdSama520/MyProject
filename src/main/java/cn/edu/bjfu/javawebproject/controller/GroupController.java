package cn.edu.bjfu.javawebproject.controller;


import cn.edu.bjfu.javawebproject.pojo.Group;
import cn.edu.bjfu.javawebproject.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/Group")
public class GroupController {

    @Autowired
    GroupService groupService;

    @GetMapping("/addGroup")
    public void addGroup(Group group) {
        groupService.addGroup(group);
    }

    @GetMapping("/deleteGroup")
    public void deleteGroup(String project_id) {
        groupService.deleteGroup(project_id);
    }

}
