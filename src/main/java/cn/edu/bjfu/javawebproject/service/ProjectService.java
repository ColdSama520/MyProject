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

    public void deleteProject(String project_id) {
        projectMapper.deleteProject(project_id);
    }

    public void updateProject(Project project) {
        projectMapper.updateProject(project);
    }

}
