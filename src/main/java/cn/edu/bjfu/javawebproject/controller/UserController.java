package cn.edu.bjfu.javawebproject.controller;

import cn.edu.bjfu.javawebproject.pojo.User;
import cn.edu.bjfu.javawebproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/User")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{user_id}")
    public User GetUser(@PathVariable String user_id){
        return userService.selectUserById(user_id);
    }
    @GetMapping("/all")
    public List<User> GetUserAll(){
        return userService.selectUserAll();
    }

    @GetMapping("/add/{user_id}")
    public void AddTeacherUser(@PathVariable String user_id) {
        userService.addTeacherUser(user_id);
    }

}
