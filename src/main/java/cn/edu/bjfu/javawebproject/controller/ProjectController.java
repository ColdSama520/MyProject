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

    @GetMapping("/ProjectCourseById")
    public List<Project> selectCourseProjectById(String course_id, String project_id) {
        return projectService.selectCourseProjectById(course_id, project_id);
    }

    @GetMapping("/CourseProjectIdAll")
    public List<Project> selectCourseProjectIdAll(String course_id) {
        return projectService.selectCourseProjectIdAll(course_id);
    }

    @GetMapping("/addProject")
    public void addProject(Project project) {
        projectService.addProject(project);
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
