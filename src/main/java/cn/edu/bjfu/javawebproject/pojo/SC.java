package cn.edu.bjfu.javawebproject.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SC {
    private String sc_id;
    private String student_id;
    private String group_id;
    private String sc_is_delete;
}
