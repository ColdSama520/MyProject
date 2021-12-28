package cn.edu.bjfu.javawebproject.controller;


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


}
