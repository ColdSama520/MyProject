package cn.edu.bjfu.javawebproject.mapper;



import cn.edu.bjfu.javawebproject.pojo.Task;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskMapper {

    List<Task> TaskMessageByStudentId(String student_id);

    List<Task> TaskMessageSearchByTaskName(String student_id, String task_name);

    List<Task> TaskMessageSearchByTaskType(String student_id, String task_type);

    List<Task> TaskMessageGroupOthers(String student_id);

    List<Task> TaskMessageSearchByStudent_Name(String student_id, String student_name);

    String IsTaskTypeHasWorked(String task_id);

    void TaskMessageUpdateById(String task_name, String task_stage_type, String task_details, String task_type, String task_id, String task_alter_date);

    void TaskMessageUpdateByTeacherR(String task_score, String task_reviews, String task_score_date, String task_id);

    void deleteTaskById(String task_id);

    void addTask(String task_id, String task_name, String task_stage_type, String task_details, String task_type, String task_start_date, String student_id);

}
