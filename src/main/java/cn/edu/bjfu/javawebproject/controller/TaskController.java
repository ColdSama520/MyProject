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

    @GetMapping("/TaskMessageSearchByTaskType")
    public List<Task> TaskMessageSearchByTaskType(String student_id, String task_type) {
        return taskService.TaskMessageSearchByTaskType(student_id, task_type);
    }

    @GetMapping("/TaskMessageGroupOthers")
    public List<Task> TaskMessageGroupOthers(String student_id) {
        return taskService.TaskMessageGroupOthers(student_id);
    }

    @GetMapping("/TaskMessageSearchByStudentName")
    public List<Task> TaskMessageSearchByStudent_Name(String student_id, String student_name) {
        return taskService.TaskMessageSearchByStudent_Name(student_id, student_name);
    }

    @GetMapping("/IsTaskTypeHasWorked")
    public Integer IsTaskTypeHasWorked(String task_id) {
        if (taskService.IsTaskTypeHasWorked(task_id).equals("已完成"))
            return 1;
        return 0;
    }

    @GetMapping("addTask")
    public void addTask(String task_id, String task_name, String task_stage_type, String task_details, String task_type, String task_start_date, String student_id) {
        taskService.addTask(task_id, task_name, task_stage_type, task_details, task_type, task_start_date, student_id);
    }

    @GetMapping("TaskMessageUpdateByTeacherR")
    public void TaskMessageUpdateByTeacherR(String task_score, String task_reviews, String task_score_date, String task_id) {
        taskService.TaskMessageUpdateByTeacherR(task_score, task_reviews, task_score_date, task_id);
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
