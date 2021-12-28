package cn.edu.bjfu.javawebproject.service;


import cn.edu.bjfu.javawebproject.mapper.ProjectMapper;
import cn.edu.bjfu.javawebproject.pojo.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    @Autowired
    ProjectMapper projectMapper;

    public List<Project> selectProject(String course_id) {
       return projectMapper.selectProject(course_id);
    }

    public List<Project> selectCourseProjectById(String course_id, String project_id) {
        return projectMapper.selectCourseProjectById(course_id, project_id);
    }

    public List<Project> selectCourseProjectIdAll(String course_id) {
        return projectMapper.selectCourseProjectIdAll(course_id);
    }

    public void addProject(Project project) {
        projectMapper.addProject(project);
    }

    public void deleteProject(String project_id) {
        projectMapper.deleteProject(project_id);
    }

    public void updateProject(Project project) {
        projectMapper.updateProject(project);
    }

}
