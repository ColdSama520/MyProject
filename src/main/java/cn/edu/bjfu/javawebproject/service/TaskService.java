package cn.edu.bjfu.javawebproject.service;




import cn.edu.bjfu.javawebproject.mapper.TaskMapper;
import cn.edu.bjfu.javawebproject.pojo.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    TaskMapper taskMapper;

    public List<Task> TaskMessageByStudentId(String student_id) {
        return taskMapper.TaskMessageByStudentId(student_id);
    }

    public List<Task> TaskMessageSearchByTaskName(String student_id, String task_name) {
        return taskMapper.TaskMessageSearchByTaskName(student_id, task_name);
    }

    public void TaskMessageUpdateById(String task_name, String task_stage_type, String task_details, String task_type, String task_id) {
        taskMapper.TaskMessageUpdateById(task_name, task_stage_type, task_details, task_type, task_id);
    }

    public void deleteTaskById(String task_id) {
        taskMapper.deleteTaskById(task_id);
    }

}
