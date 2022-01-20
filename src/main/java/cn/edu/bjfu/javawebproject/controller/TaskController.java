package cn.edu.bjfu.javawebproject.controller;


import cn.edu.bjfu.javawebproject.pojo.Task;
import cn.edu.bjfu.javawebproject.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/Task")
public class TaskController {

    @Autowired
    TaskService taskService;

    @GetMapping("/TaskMessageByStudentId")
    List<Task> TaskMessageByStudentId(String student_id) {
        return taskService.TaskMessageByStudentId(student_id);
    }

    @GetMapping("/TaskMessageSearchByTaskName")
    public List<Task> TaskMessageSearchByTaskName(String student_id, String task_name) {
        return taskService.TaskMessageSearchByTaskName(student_id, task_name);
    }

    @GetMapping("addTask")
    public void addTask(String task_id, String task_name, String task_stage_type, String task_details, String task_type, String task_start_date, String student_id) {
        taskService.addTask(task_id, task_name, task_stage_type, task_details, task_type, task_start_date, student_id);
    }

    @GetMapping("/TaskMessageUpdateById")
    public void TaskMessageUpdateById(String task_name, String task_stage_type, String task_details, String task_type, String task_id, String task_alter_date) {
        taskService.TaskMessageUpdateById(task_name, task_stage_type, task_details, task_type, task_id, task_alter_date);
    }

    @GetMapping("/deleteTaskById")
    public void deleteTaskById(String task_id) {
        taskService.deleteTaskById(task_id);
    }


}
