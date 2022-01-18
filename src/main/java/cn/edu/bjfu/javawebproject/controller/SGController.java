package cn.edu.bjfu.javawebproject.controller;


import cn.edu.bjfu.javawebproject.pojo.SG;
import cn.edu.bjfu.javawebproject.service.SGService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/SG")
public class SGController {

    @Autowired
    SGService sgService;

    @GetMapping("/deleteSGByGroupId")
    public void deleteSGByGroupId(String group_id) {
        sgService.deleteSGByGroupId(group_id);
    }


    @GetMapping("/HasGroupByStudentId")
    public String HasGroupByStudentId(String student_id) {
        return sgService.HasGroupByStudentId(student_id);
    }

    @GetMapping("/HasGroupNumber")
    public int HasGroupNumber(String group_id) {
        SG sg = sgService.HasGroupNumber(group_id);
        if (sg.getGroup_number().equals(sg.getProject_number_limit()))
            return  0;
        return 1;
    }

    @GetMapping("/GroupAddNewStudent")
    public void GroupAddNewStudent(String student_id, String group_id) {
        sgService.GroupAddNewStudent(student_id, group_id);
    }

}
