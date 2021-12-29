package cn.edu.bjfu.javawebproject.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Case {
    private String case_id;
    private String case_name;
    private String course_id;
    private String case_content;
    private String case_type;
    private String case_is_delete;
}
