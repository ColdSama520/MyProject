package cn.edu.bjfu.javawebproject.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project {
    private String project_id;
    private String project_name;
    private String project_introduction;
    private String project_number_limit;
    private String project_instructions;
    private String course_id;
}
