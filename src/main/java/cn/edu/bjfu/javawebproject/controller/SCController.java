package cn.edu.bjfu.javawebproject.controller;


import cn.edu.bjfu.javawebproject.pojo.SC;
import cn.edu.bjfu.javawebproject.service.SCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/SC")
public class SCController {

    @Autowired
    SCService scService;

    @GetMapping("/add")
    public void addSC(SC sc) {
        scService.addSC(sc);
    }

}
