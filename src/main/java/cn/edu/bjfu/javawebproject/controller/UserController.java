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
    public int Login(User user){
        if(userService.selectUserById(user.getUser_id()) != null)
            return 200;//用户名已存在
        return -1;
    }

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
