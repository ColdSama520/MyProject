package cn.edu.bjfu.javawebproject.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Group {
    private String group_id;
    private String group_name;
    private String student_id;
    private String project_id;

    private String project_name;
    private String student_member;
}
