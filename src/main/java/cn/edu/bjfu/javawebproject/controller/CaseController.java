package cn.edu.bjfu.javawebproject.controller;



import cn.edu.bjfu.javawebproject.pojo.Case;
import cn.edu.bjfu.javawebproject.service.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/Case")
public class CaseController {

    @Autowired
    CaseService caseService;

    @GetMapping("/CaseCourseAll")
    public List<Case> selectCaseCourse(String course_id) {
        return caseService.selectCaseCourse(course_id);
    }

    @GetMapping("/CaseCourseByName")
    public List<Case> selectCaseCourseByName(String course_id, String case_name) {
        return caseService.selectCaseCourseByName(course_id, case_name);
    }

}
