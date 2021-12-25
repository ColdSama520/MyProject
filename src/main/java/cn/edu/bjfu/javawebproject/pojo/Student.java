package cn.edu.bjfu.javawebproject.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String student_id;
    private String student_name;
    private String student_sex;
    private String student_phone;
    private String student_major;
    private String student_class;
    private String student_is_delete;
}
