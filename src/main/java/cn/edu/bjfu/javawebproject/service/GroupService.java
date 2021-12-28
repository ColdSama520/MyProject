package cn.edu.bjfu.javawebproject.service;



import cn.edu.bjfu.javawebproject.mapper.GroupMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupService {

    @Autowired
    GroupMapper groupMapper;

    public void deleteGroup(String project_id) {
        groupMapper.deleteGroup(project_id);
    }

}
