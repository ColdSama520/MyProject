package cn.edu.bjfu.javawebproject.controller;



import cn.edu.bjfu.javawebproject.pojo.Resource;
import cn.edu.bjfu.javawebproject.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/Resource")
public class ResourceController {

    @Autowired
    ResourceService resourceService;

    @GetMapping("/ResourceCaseAll")
    public List<Resource> selectResourceCase(String case_id) {
        return resourceService.selectResourceCase(case_id);
    }

    @GetMapping("/ResourceCaseByName")
    public List<Resource> selectResourceCaseByName(String case_id, String resource_name) {
        return resourceService.selectResourceCaseByName(case_id, resource_name);
    }

    @GetMapping("/deleteResourceById")
    public void deleteResourceById(String resource_id) {
        resourceService.deleteResourceById(resource_id);
    }

    @GetMapping("/addResource")
    public void addResource(Resource resource) {
        resourceService.addResource(resource);
    }

}
