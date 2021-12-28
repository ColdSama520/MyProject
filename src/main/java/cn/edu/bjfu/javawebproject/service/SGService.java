package cn.edu.bjfu.javawebproject.service;



import cn.edu.bjfu.javawebproject.mapper.SGMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SGService {

    @Autowired
    SGMapper sgMapper;

    public void deleteSGByGroupId(String group_id) {
        sgMapper.deleteSGByGroupId(group_id);
    }

}
