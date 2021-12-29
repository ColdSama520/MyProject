package cn.edu.bjfu.javawebproject.mapper;


import cn.edu.bjfu.javawebproject.pojo.Case;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CaseMapper {

    List<Case> selectCaseCourse(String course_id);

    List<Case> selectCaseCourseByName(String course_id, String case_name);

}
