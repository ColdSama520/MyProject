package cn.edu.bjfu.javawebproject.service;


import cn.edu.bjfu.javawebproject.mapper.CaseMapper;
import cn.edu.bjfu.javawebproject.pojo.Case;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CaseService {

    @Autowired
    CaseMapper caseMapper;

    public List<Case> selectCaseCourse(String course_id) {
        return caseMapper.selectCaseCourse(course_id);
    }

    public List<Case> selectCaseCourseByName(String course_id, String case_name) {
        return caseMapper.selectCaseCourseByName(course_id, case_name);
    }

}
