package cn.edu.bjfu.javawebproject.controller;


import cn.edu.bjfu.javawebproject.pojo.Project;
import cn.edu.bjfu.javawebproject.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/Project")
public class ProjectController {

    @Autowired
    ProjectService projectService;


    @GetMapping("/ProjectGroup")
    public List<Project> selectProject(String course_id) {
        return projectService.selectProject(course_id);
    }

    @GetMapping("/deleteProject")
    public void deleteProject(String project_id) {
        projectService.deleteProject(project_id);
    }

    @GetMapping("/updateProject")
    public void updateProject(Project project) {
        projectService.updateProject(project);
    }

}
