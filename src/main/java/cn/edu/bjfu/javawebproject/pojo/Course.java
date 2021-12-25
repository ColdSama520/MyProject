package cn.edu.bjfu.javawebproject.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    private String course_id;
    private String course_name;
    private String course_start_year;
    private String course_is_archive;
    private String teacher_id;

    private String student_class;
    private String student_number;
}
