package cn.edu.bjfu.javawebproject.service;



import cn.edu.bjfu.javawebproject.mapper.SCMapper;
import cn.edu.bjfu.javawebproject.pojo.SC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SCService {

    @Autowired
    SCMapper scMapper;

    public void addSC(SC sc) {
        scMapper.addSC(sc);
    }

    public void deleteSCStudent(String course_id, String student_id) {
        scMapper.deleteSCStudent(course_id, student_id);
    }

}
