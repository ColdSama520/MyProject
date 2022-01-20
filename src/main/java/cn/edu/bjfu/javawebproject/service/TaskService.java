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

    public List<Task> TaskMessageGroupOthers(String student_id) {
        return taskMapper.TaskMessageGroupOthers(student_id);
    }

    public List<Task> TaskMessageSearchByStudent_Name(String student_id, String student_name) {
        return taskMapper.TaskMessageSearchByStudent_Name(student_id, student_name);
    }

    public void addTask(String task_id, String task_name, String task_stage_type, String task_details, String task_type, String task_start_date, String student_id) {
        taskMapper.addTask(task_id, task_name, task_stage_type, task_details, task_type, task_start_date, student_id);
    }

    public void TaskMessageUpdateById(String task_name, String task_stage_type, String task_details, String task_type, String task_id, String task_alter_date) {
        taskMapper.TaskMessageUpdateById(task_name, task_stage_type, task_details, task_type, task_id, task_alter_date);
    }

    public void deleteTaskById(String task_id) {
        taskMapper.deleteTaskById(task_id);
    }

}
