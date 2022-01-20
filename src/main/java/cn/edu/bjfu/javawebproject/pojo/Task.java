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
    private String task_details; // 任务详情
    private String task_stage_type;  // 所属任务阶段
    private String student_id;
    private String task_start_date;  //  任务生成时间
    private String task_alter_date;   // 任务修改时间
    private String task_score;   // 任务评分
    private String task_reviews;   // 任务点评
    private String task_score_date;   // 任务评分时间
    private String task_type;   // 任务状态
    private String task_start_day;   //  任务拟开始时间
    private String task_start_time;   // 任务拟工作时长

    private String student_name;
}
