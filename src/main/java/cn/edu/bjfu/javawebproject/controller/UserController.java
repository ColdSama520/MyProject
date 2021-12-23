package cn.edu.bjfu.javawebproject.controller;

import cn.edu.bjfu.javawebproject.pojo.User;
import cn.edu.bjfu.javawebproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String Login(User user){
        return userService.selectUserForLogin(user.getUser_id(), user.getUser_pwd()).getUser_role();
    }

    @GetMapping("/updatePwd")
    public void updatePwd(User user){
        userService.updateUserPwd(user.getUser_id(), user.getUser_pwd());
    }

    @GetMapping("/{user_id}")
    public User GetUser(@PathVariable String user_id){
        return userService.selectUserById(user_id);
    }

    @GetMapping("/all")
    public List<User> GetUserAll(){
        return userService.selectUserAll();
    }

    @GetMapping("/addTeacher")
    public void AddTeacherUser(String user_id) {
        userService.addTeacherUser(user_id, "123456", "教师");
    }

}
