package cn.edu.bjfu.javawebproject.mapper;


import cn.edu.bjfu.javawebproject.pojo.Project;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectMapper {

    List<Project> selectProject(String course_id);

    List<Project> selectCourseProjectById(String course_id, String project_id);

    List<Project> selectCourseProjectIdAll(String course_id);

    void deleteProject(String project_id);

    void updateProject(Project project);

    void addProject(Project project);

}
