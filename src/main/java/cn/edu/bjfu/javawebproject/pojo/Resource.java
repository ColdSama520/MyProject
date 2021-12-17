package cn.edu.bjfu.javawebproject.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Resource {
    private String resource_id;
    private String resource_name;
    private String resource_type;
    private String case_id;
    private String resource_local;
}
