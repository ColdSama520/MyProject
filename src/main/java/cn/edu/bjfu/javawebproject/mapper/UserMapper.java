package cn.edu.bjfu.javawebproject.mapper;

import cn.edu.bjfu.javawebproject.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    User selectUserById(String user_id);

    User selectUserForLogin(String user_id, String user_pwd);

    void updateUserPwd(String user_id, String user_pwd);

    List<User> selectUserAll();

    void addTeacherUser(String user_id, String user_pwd, String user_role);

}
