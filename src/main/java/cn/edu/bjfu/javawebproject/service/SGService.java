package cn.edu.bjfu.javawebproject.service;



import cn.edu.bjfu.javawebproject.mapper.SGMapper;
import cn.edu.bjfu.javawebproject.pojo.SG;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SGService {

    @Autowired
    SGMapper sgMapper;

    public List<SG> selectGroupMemberByGroupId(String group_id) {
        return sgMapper.selectGroupMemberByGroupId(group_id);
    }

    public void deleteSGByGroupId(String group_id) {
        sgMapper.deleteSGByGroupId(group_id);
    }

    public String HasGroupByStudentId(String student_id) {
        return sgMapper.HasGroupByStudentId(student_id);
    }

    public SG HasGroupNumber(String group_id) {
        return sgMapper.HasGroupNumber(group_id);
    }

    public void GroupAddNewStudent(String student_id, String group_id) {
        sgMapper.GroupAddNewStudent(student_id, group_id);
    }

    public void deleteSGStudentByID(String student_id, String group_id) {
        sgMapper.deleteSGStudentByID(student_id, group_id);
    }

}
