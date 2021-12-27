package cn.edu.bjfu.javawebproject.service;

import cn.edu.bjfu.javawebproject.mapper.UserMapper;
import cn.edu.bjfu.javawebproject.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;
    public User selectUserById(String user_id){
        return userMapper.selectUserById(user_id);
    }

    public User selectUserForLogin(String user_id, String user_pwd){
        return userMapper.selectUserForLogin(user_id, user_pwd);
    }

    public void updateUserPwd(String user_id, String user_pwd){
        userMapper.updateUserPwd(user_id, user_pwd);
    }

    public List<User> selectUserAll(){
        return userMapper.selectUserAll();
    }

    public void addTeacherUser(String  user_id, String user_pwd, String user_role) {
        userMapper.addTeacherUser(user_id, user_pwd, user_role);
    }

    public void addStudentUser(String  user_id, String user_pwd, String user_role) {
        userMapper.addStudentUser(user_id, user_pwd, user_role);
    }

}
