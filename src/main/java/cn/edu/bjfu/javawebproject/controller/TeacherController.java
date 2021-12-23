package cn.edu.bjfu.javawebproject.controller;


import cn.edu.bjfu.javawebproject.pojo.Teacher;
import cn.edu.bjfu.javawebproject.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/Teacher")
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @GetMapping("/all")
    public List<Teacher> GetTeacherAll(){
        return teacherService.selectTeacherAll();
    }

    @GetMapping("/add")
    public void addTeacher(Teacher teacher){
        teacherService.addTeacher(teacher);
    }
}
