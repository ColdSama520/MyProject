package cn.edu.bjfu.javawebproject.controller;

import cn.edu.bjfu.javawebproject.pojo.User;
import cn.edu.bjfu.javawebproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public int Login(@RequestBody User user){
        System.out.println(user.getUser_id());
        System.out.println(user.getUser_pwd());
        return 200;
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
