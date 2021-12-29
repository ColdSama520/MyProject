package cn.edu.bjfu.javawebproject.mapper;


import cn.edu.bjfu.javawebproject.pojo.Resource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResourceMapper {

    List<Resource> selectResourceCase(String case_id);

    List<Resource> selectResourceCaseByName(String case_id, String resource_name);

    void deleteResourceById(String resource_id);

}
