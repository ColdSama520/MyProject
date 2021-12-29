package cn.edu.bjfu.javawebproject.service;


import cn.edu.bjfu.javawebproject.mapper.ResourceMapper;
import cn.edu.bjfu.javawebproject.pojo.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceService {

    @Autowired
    ResourceMapper resourceMapper;

    public List<Resource> selectResourceCase(String case_id) {
        return resourceMapper.selectResourceCase(case_id);
    }

    public List<Resource> selectResourceCaseByName(String case_id, String resource_name) {
        return resourceMapper.selectResourceCaseByName(case_id, case_id);
    }

    public void deleteResourceById(String resource_id) {
        resourceMapper.deleteResourceById(resource_id);
    }

}
