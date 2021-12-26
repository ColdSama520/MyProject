package cn.edu.bjfu.javawebproject.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {
    private String task_id;
    private String task_name;
    private String task_details;
    private String task_stage_type;
    private String student_id;
    private String task_start_date;
    private String task_alter_date;
    private String task_score;
    private String task_reviews;
    private String task_score_date;
    private String task_type;
    private String task_start_day;
    private String task_start_time;
}
